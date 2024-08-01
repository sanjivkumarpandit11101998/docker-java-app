package com.sanjiv.student_app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;


    @RequestMapping("/getStudents")
    public List<Student> getStudent(){
        return repo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent(){
        Student s= new Student();
        s.setRollno(5);
        s.setName("Raj");
        s.setMarks(40);
        repo.save(s);
    }
}
