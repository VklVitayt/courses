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

   @GetMapping("/getAllStudent")
    private List<Student>getAllStudent(){
        System.out.println("REST");
        return studentService.getAllStudent();
    }


    @PostMapping("/insertStudent")
    private void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
        System.out.println("Insert student");
    }

    @PostMapping("/addStudent")
    private void addStudent(@RequestBody Student student) {
       studentService.addStudent(student);
    }


}
