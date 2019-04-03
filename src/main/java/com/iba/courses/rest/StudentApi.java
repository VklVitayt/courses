package com.iba.courses.rest;

import com.iba.courses.domain.Student;
import com.iba.courses.service.StudentService;
import com.iba.courses.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

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


    @PostMapping("/imsConnect")
    private Map getImsConnect(@RequestBody String command){
        return Collections.singletonMap("result", new TerminalService().ImsTerminal(command));
    }

    @PostMapping("/db2Connect")
    private Map getDb2Connect(@RequestBody String command){return Collections.singletonMap("result", new TerminalService().Db2Terminal(command));
    }


     /*
    @GetMapping("/greeting/{myVariable}")
    private String greeting(@PathVariable String myVariable){
        System.out.println("in our first rest");
        return  "Hello " + myVariable;
    }

    @PostMapping("/simplePost/{id}")
    private int postMethod(@RequestBody String s, @PathVariable int id){
        System.out.println(s);
        return id;

    }
     */
}
