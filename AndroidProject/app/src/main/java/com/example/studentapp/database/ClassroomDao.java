package com.example.studentapp.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Delete;
import androidx.room.Update;
import com.example.studentapp.model.Classroom;
import java.util.List;

@Dao
public interface ClassroomDao {
    @Insert
    void insert(Classroom classroom);

    @Update
    void update(Classroom classroom);

    @Delete
    void delete(Classroom classroom);

    @Query("SELECT * FROM classrooms")
    List<Classroom> getAllClassrooms();
}
