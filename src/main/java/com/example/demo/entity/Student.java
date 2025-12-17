package com.example.demo.entity;

import java.time.LocalDate;

public class Student { 
   private String name,email;
   private  int id;
   private LocalDate date;
   private float cgpa;

   public Student() {
     }

   public Student(String name, int id, LocalDate date, float cgpa,String email) {
    this.name = name;
    this.id = id;
    this.date = date;
    this.cgpa = cgpa;
    this.email=email;
}
   public String getName() {
    return name;
   }
   public void setName(String name) {
    this.name = name;
   }
   public int getId() {
    return id;
   }
   public void setId(int id) {
    this.id = id;
   }
   public LocalDate getDate() {
    return date;
   }
   public void setDate(LocalDate date) {
    this.date = date;
   }
   public float getCgpa() {
    return cgpa;
   }
   public void setCgpa(float cgpa) {
    this.cgpa = cgpa;
   }
     public void getEmail(){
      return email;
     }
     public void setEmail(String email){
      this.email=email;
     }
   
}
