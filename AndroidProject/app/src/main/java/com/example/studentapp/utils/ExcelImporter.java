package com.example.studentapp.utils;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

import com.example.studentapp.database.AppDatabase;
import com.example.studentapp.model.Student;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.InputStream;
import java.util.Iterator;

public class ExcelImporter {

    private static final String TAG = "ExcelImporter";

    public static void importStudentsFromExcel(Context context, Uri fileUri, AppDatabase db, int classroomId) {
        try {
            InputStream inputStream = context.getContentResolver().openInputStream(fileUri);
            Workbook workbook = WorkbookFactory.create(inputStream);
            Sheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();
            boolean firstRow = true;
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                if (firstRow) {
                    firstRow = false; // Skip header row
                    continue;
                }
                Cell nameCell = row.getCell(0);
                if (nameCell != null) {
                    String studentName = nameCell.getStringCellValue();
                    Student student = new Student(studentName, classroomId);
                    db.studentDao().insert(student);
                }
            }
            workbook.close();
            inputStream.close();
        } catch (Exception e) {
            Log.e(TAG, "Error importing students from Excel", e);
        }
    }
}
