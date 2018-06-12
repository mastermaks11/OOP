package by.itacademy.students;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 07.06.2018.
 */
public class Student {
    private String firstName;
    private String secondName;
    private Date dateOfBirthStudent;

    public Student(String firstName, String secondName, Date dateOfBirthStudent) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirthStudent = dateOfBirthStudent;
    }

    public Date getDateOfBirthStudent() {
        return dateOfBirthStudent;
    }
}
