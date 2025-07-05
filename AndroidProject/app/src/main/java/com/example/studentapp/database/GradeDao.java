package com.example.studentapp.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Delete;
import androidx.room.Update;
import com.example.studentapp.model.Grade;
import java.util.List;

@Dao
public interface GradeDao {
    @Insert
    void insert(Grade grade);

    @Update
    void update(Grade grade);

    @Delete
    void delete(Grade grade);

    @Query("SELECT * FROM grades WHERE studentId = :studentId")
    List<Grade> getGradesByStudent(int studentId);

    @Query("SELECT * FROM grades")
    List<Grade> getAllGrades();
}
