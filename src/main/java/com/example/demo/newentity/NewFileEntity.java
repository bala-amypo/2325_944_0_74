package com.example.demo.newentity;
import jakarta.util.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;

public class NewFileEntity{
    @Id
    @GeneratedValue(strategy=GeneratedType.IDENTITY)
    private Long id;
    @NotBlank(message="Should not contain spaces")
    private String name;
    @Column(name=unique)
    @NotBlank(message="Should not contain spaces")
    @Email(message="Invalid message")
    private String email;

    public NewFileEntity(){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    
}