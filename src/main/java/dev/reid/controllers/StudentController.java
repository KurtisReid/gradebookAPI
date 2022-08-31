package dev.reid.controllers;

import com.google.gson.Gson;
import dev.reid.entities.Grade;
import dev.reid.entities.Student;
import dev.reid.services.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    Logger logger = LogManager.getLogger(GradesController.class);

    private Gson gson = new Gson();

    @Autowired
    StudentService studentService;

    @PostMapping("/students")
    @ResponseBody
    public ResponseEntity<String> createStudent(@RequestBody Student student){
        return null;
    }

    @GetMapping("/students/{id}")
    @ResponseBody
    public ResponseEntity<String> getStudentById(@PathVariable String id){
        return null;
    }

    @GetMapping("/students")
    @ResponseBody
    public List<Grade> getAllStudents(){
        return null;
    }

    @PutMapping("/students")
    @ResponseBody
    public ResponseEntity<String> updateStudent(@RequestBody Student student){
        return null;
    }

    @DeleteMapping("/students/{id}")
    @ResponseBody
    public ResponseEntity<String> deleteStudent(@PathVariable String id){
        return null;
    }
}
