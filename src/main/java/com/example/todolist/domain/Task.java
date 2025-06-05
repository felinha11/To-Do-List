package com.example.todolist.domain;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private boolean status;
}