package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Student;
public interface Studentservice{
    Student postdata(Student stu);
    List<Student>getdata();
    Student updatedata(int id,Student std);
    String deletedata(int id);
}