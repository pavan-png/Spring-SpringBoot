package in.orcas.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.hateoas.*;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.model.Student;
import in.orcas.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;
    public StudentController(StudentService service) {
        this.service = service;
    }

    // Get all students
    @GetMapping
    public CollectionModel<EntityModel<Student>> getAllStudents() {
        List<EntityModel<Student>> studentModels = service.getAllStudents().stream()
            .map(st -> EntityModel.of(st,
                    WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(StudentController.class)
                            .getStudentById(st.getId())).withRel("details")))
            .collect(Collectors.toList());

        return CollectionModel.of(studentModels,
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(StudentController.class)
                        .getAllStudents()).withSelfRel());
    }

    // Get student by ID with links
    @GetMapping("/{id}")
    public EntityModel<Student> getStudentById(@PathVariable Integer id) {
        Student st = service.getStudentById(id);
        EntityModel<Student> model = EntityModel.of(st);
        model.add(WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(StudentController.class).getStudentById(id)).withSelfRel());
        model.add(WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder.methodOn(StudentController.class).getAllStudents()).withRel("all-students"));
        return model;
    }
}
