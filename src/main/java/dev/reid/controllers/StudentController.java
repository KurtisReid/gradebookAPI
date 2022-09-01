package dev.reid.controllers;

import com.google.gson.Gson;
import dev.reid.entities.Grade;
import dev.reid.entities.Student;
import dev.reid.services.StudentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        logger.info("POST student request");
        try{
            Student savedStudent = this.studentService.addStudent(student);
            return new ResponseEntity<>(this.gson.toJson(savedStudent), HttpStatus.CREATED);
        }catch(RuntimeException e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @GetMapping("/students/{id}")
    @ResponseBody
    public ResponseEntity<String> getStudentById(@PathVariable String id){
        logger.info("Get student by id request");
        int studentId = Integer.parseInt(id);
        try{
            Student returnStudent = this.studentService.getStudentById(studentId);
            return new ResponseEntity<>(this.gson.toJson(returnStudent), HttpStatus.CONTINUE);
        }catch(RuntimeException e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/students/{name}")
    @ResponseBody
    public ResponseEntity<String> getStudentByName(@PathVariable String name){
        logger.info("Get student by id request");
        List<Student> returnStudents = this.studentService.getStudentByName(name);
        return new ResponseEntity<>(this.gson.toJson(returnStudents), HttpStatus.CONTINUE);
    }

    @GetMapping("/students")
    @ResponseBody
    public ResponseEntity<String> getAllStudents(){
        logger.info("Get all student request");
        List<Student> returnStudents = this.studentService.getAllStudents();
        return new ResponseEntity<>(this.gson.toJson(returnStudents), HttpStatus.CONTINUE);
    }

    @PutMapping("/students")
    @ResponseBody
    public ResponseEntity<String> updateStudent(@RequestBody Student student){
        return new ResponseEntity<>("PUT request not available\nPlease delete and create new student", HttpStatus.CONTINUE);
    }

    @DeleteMapping("/students/{id}")
    @ResponseBody
    public ResponseEntity<String> deleteStudent(@PathVariable String id){
        logger.info("Delete student request");
        int studentId = Integer.parseInt(id);
        if(this.studentService.deleteStudent(studentId)){
            return new ResponseEntity<>("Student with id: " +id+ " successfully deleted", HttpStatus.CONTINUE);
        }
        return new ResponseEntity<>("Student with id: " +id+ " not found", HttpStatus.NOT_FOUND);
    }
}
