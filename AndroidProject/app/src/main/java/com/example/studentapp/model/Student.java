package com.example.studentapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "students")
public class Student {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String name;
    public int classroomId;

    public Student(String name, int classroomId) {
        this.name = name;
        this.classroomId = classroomId;
    }
}
