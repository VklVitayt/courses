package com.iba.courses.rest;

import com.iba.courses.domain.Student;
import com.iba.courses.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentApi {
    @Autowired
    private StudentService studentService;

    @GetMapping("getAllStudent")
    private List<Student> getAllStudents(){
        System.out.println("REST");
        return studentService.getAllStudents();
    }
    @PostMapping("addStudent")
    private void addStudents(@RequestBody Student student){
        studentService.addStudents(student);
    }
}

