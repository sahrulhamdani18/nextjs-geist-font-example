package com.example.studentapp.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Delete;
import androidx.room.Update;
import com.example.studentapp.model.Attendance;
import java.util.List;

@Dao
public interface AttendanceDao {
    @Insert
    void insert(Attendance attendance);

    @Update
    void update(Attendance attendance);

    @Delete
    void delete(Attendance attendance);

    @Query("SELECT * FROM attendance WHERE studentId = :studentId")
    List<Attendance> getAttendanceByStudent(int studentId);

    @Query("SELECT * FROM attendance")
    List<Attendance> getAllAttendance();
}
