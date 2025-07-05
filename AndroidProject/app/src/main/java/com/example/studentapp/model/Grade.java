package com.example.studentapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "grades")
public class Grade {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public int studentId;
    public int subjectId;
    public float grade;

    public Grade(int studentId, int subjectId, float grade) {
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.grade = grade;
    }
}
