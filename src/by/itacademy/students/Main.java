package by.itacademy.students;

import by.itacademy.students.DataBase;
import by.itacademy.students.Student;

import java.text.ParseException;
import java.util.Scanner;

/**
 * Created by user on 08.06.2018.
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("Введите количество студентов");
        int numberStuden = new Scanner(System.in).nextInt();
        DataBase dataBase = new DataBase(new Student[numberStuden]);
        dataBase.addPerson();
        dataBase.countPerson();
    }
}
