package com.example.demo.newentity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
@Entity
@Table(name = "Student")
public class NewfileEntity{
    @Id
    @GenerateValue(strategy=GenerateType.IDENTITY)
    private Long id;
    @NotBlank(message = "Should not contain spaces")
    private String name;
    @NotBlank(message = "Email dosent not contain White Spaces")
    @Email(message = "Invalid format")
    private String email;

    public NewfileEntity(Long id, @NotBlank(message = "Should not contain spaces")String name,@NotBlank(message = "Email dosent not contain White Spaces")@Email(message = "Invalid format") String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    

}