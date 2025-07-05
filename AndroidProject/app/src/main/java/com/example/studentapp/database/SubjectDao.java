package com.example.studentapp.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Delete;
import androidx.room.Update;
import com.example.studentapp.model.Subject;
import java.util.List;

@Dao
public interface SubjectDao {
    @Insert
    void insert(Subject subject);

    @Update
    void update(Subject subject);

    @Delete
    void delete(Subject subject);

    @Query("SELECT * FROM subjects")
    List<Subject> getAllSubjects();
}
