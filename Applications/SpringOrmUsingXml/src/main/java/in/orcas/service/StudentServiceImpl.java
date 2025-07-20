package in.orcas.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import in.orcas.dao.StudentDAOImpl;
import in.orcas.model.StudentBO;
import in.orcas.model.StudentDTO;

@Transactional(readOnly = true)
public class StudentServiceImpl implements StudentService {

    private StudentDAOImpl dao;

    public void setDao(StudentDAOImpl dao) {
        this.dao = dao;
    }

    @Override
    @Transactional(readOnly = false)
    public void saveStudent(StudentDTO dto) {
        StudentBO bo = new StudentBO();
        bo.setId(dto.getId());
        bo.setName(dto.getName());
        bo.setMarks(dto.getMarks());
        dao.save(bo);
    }

    @Override
    @Transactional(readOnly = false)
    public void updateStudent(StudentDTO dto) {
        StudentBO bo = new StudentBO();
        bo.setId(dto.getId());
        bo.setName(dto.getName());
        bo.setMarks(dto.getMarks());
        dao.update(bo);
    }

    @Override
    @Transactional(readOnly = false)
    public void deleteStudent(int id) {
        dao.delete(id);
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<StudentBO> bos = dao.fetchAll();
        List<StudentDTO> dtos = new ArrayList<>();

        for (StudentBO bo : bos) {
            StudentDTO dto = new StudentDTO();
            dto.setId(bo.getId());
            dto.setName(bo.getName());
            dto.setMarks(bo.getMarks());
            dtos.add(dto);
        }

        return dtos;
    }

    @Override
    public StudentDTO getStudentById(int id) {
        StudentBO bo = dao.fetchById(id);
        if (bo != null) {
            StudentDTO dto = new StudentDTO();
            dto.setId(bo.getId());
            dto.setName(bo.getName());
            dto.setMarks(bo.getMarks());
            return dto;
        }
        return null;
    }
}