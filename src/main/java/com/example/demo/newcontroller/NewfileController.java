package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Studententity;
import com.example.project.service.Studentservice;

@RestController
public class NewfileController {
    @Autowired
    NewfileServiceImpl src;
    @PostMapping("/addStudent")
    public NewFileEntity addstudent(@RequestBody NewFileEntity student){
    return src.saveStudentData(student);
    }
    
    @GetMapping("/getStudent")
    public List<NewFileEntity> getallstudents(){
        return src.retrieveAllStudents();
    }
    
    @GetMapping("/getStudentById/{id}")
    public NewFileEntity getIdVal(@PathVariable int id){
        return src.retrieveStudentData(id);
    }
    
    @PutMapping("/updateStudentDate/{id}")
    public NewFileEntity updateStudentData(@PathVariable int id, @RequestBody NewFileEntity student){
        return src.updateStudentData(id,student);
    }

    @DeleteMapping("/deleteStudents/{id}")
    public NewFileEntity deleteStudentData(@PathVariable int id){
       return  src.deleteStudentData(id);
    }
}