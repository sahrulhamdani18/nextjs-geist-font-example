package com.example.studentapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "classrooms")
public class Classroom {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String name;

    public Classroom(String name) {
        this.name = name;
    }
}
