package com.example.studentapp.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.studentapp.model.Subject;
import com.example.studentapp.model.Classroom;
import com.example.studentapp.model.Student;
import com.example.studentapp.model.Attendance;
import com.example.studentapp.model.Grade;

@Database(entities = {Subject.class, Classroom.class, Student.class, Attendance.class, Grade.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SubjectDao subjectDao();
    public abstract ClassroomDao classroomDao();
    public abstract StudentDao studentDao();
    public abstract AttendanceDao attendanceDao();
    public abstract GradeDao gradeDao();
}
