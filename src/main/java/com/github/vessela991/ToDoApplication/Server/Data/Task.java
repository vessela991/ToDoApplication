package com.github.vessela991.ToDoApplication.Server.Data;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    @CreationTimestamp
    private Timestamp dateOfCreation;

    @Column(nullable = false)
    private Timestamp dueDate;

    @ManyToOne
    @NotNull
    @JoinColumn(name="userId", nullable=false)
    private User user;

    public Task(String name, String description, Timestamp dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Timestamp dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public Timestamp getDueDate() {
        return dueDate;
    }

    public void setDueDate(Timestamp dueDate) {
        this.dueDate = dueDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
