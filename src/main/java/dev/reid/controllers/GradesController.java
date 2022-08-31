package dev.reid.controllers;

import com.google.gson.Gson;
import dev.reid.entities.Grade;
import dev.reid.services.GradeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GradesController {

    Logger logger = LogManager.getLogger(GradesController.class);

    private Gson gson = new Gson();

    @Autowired
    GradeService gradeService;

    @PostMapping("/grades")
    @ResponseBody
    public ResponseEntity<String> createGrade(@RequestBody Grade grade){
        return null;
    }

    @GetMapping("/grades/{id}")
    @ResponseBody
    public ResponseEntity<String> getGradeById(@PathVariable String id){
        return null;
    }

    @GetMapping("/grades")
    @ResponseBody
    public List<Grade> getAllGrades(){
        return null;
    }

    @PutMapping("/grades")
    @ResponseBody
    public ResponseEntity<String> updateGrade(@RequestBody Grade grade){
        return null;
    }

    @DeleteMapping("/grades/{id}")
    @ResponseBody
    public ResponseEntity<String> deleteGrade(@PathVariable String id){
        return null;
    }
}
