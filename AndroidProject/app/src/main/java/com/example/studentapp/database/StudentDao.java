package com.example.studentapp.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Delete;
import androidx.room.Update;
import com.example.studentapp.model.Student;
import java.util.List;

@Dao
public interface StudentDao {
    @Insert
    void insert(Student student);

    @Update
    void update(Student student);

    @Delete
    void delete(Student student);

    @Query("SELECT * FROM students WHERE classroomId = :classroomId")
    List<Student> getStudentsByClassroom(int classroomId);

    @Query("SELECT * FROM students")
    List<Student> getAllStudents();
}
