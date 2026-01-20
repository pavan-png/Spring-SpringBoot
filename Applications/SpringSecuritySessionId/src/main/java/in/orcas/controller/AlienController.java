package in.orcas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.orcas.model.Alien;
import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AlienController 
{
    // Temporary in-memory list (acts like a small database)
    List<Alien> list = new ArrayList<>();

    // Constructor to add some initial data
    public AlienController() {
        list.add(new Alien(1, "Rohan", "Bengaluru"));
        list.add(new Alien(2, "Rohit", "Delhi"));
        list.add(new Alien(3, "Ramesh", "Mumbai"));
    }

    // GET API - Returns all aliens
    @GetMapping("/get-aliens")
    public List<Alien> getAliens() {
        return list;
    }

    // POST API - Add a new alien
    @PostMapping("/add-aliens")
    public String addAlien(@RequestBody Alien alien) {
        list.add(alien);
        System.out.println("Current List: " + list);
        return "Alien added successfully!";
    }
    @GetMapping("/get-info")
    public String getCourseInfo(HttpServletRequest request) {
        return "Telusko launched DevOps with AWS course from scratch. Session ID: "
                + request.getSession().getId();
    }

    @GetMapping("/get-moreinfo")
    public String getCourseMoreInfo(HttpServletRequest request) {
        return "It's a 4-month weekend course. Session ID: "
                + request.getSession().getId();
    }

}