package com.example.studentapp.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "attendance")
public class Attendance {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public int studentId;
    public int subjectId;
    public String date;
    public boolean present;

    public Attendance(int studentId, int subjectId, String date, boolean present) {
        this.studentId = studentId;
        this.subjectId = subjectId;
        this.date = date;
        this.present = present;
    }
}
