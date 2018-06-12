package by.itacademy.students;

import by.itacademy.students.by.itacademy.student.AddPerson;
import by.itacademy.students.by.itacademy.student.CountPerson;
import by.itacademy.students.by.itacademy.student.GetBirthDayPerson;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by user on 07.06.2018.
 */
public class DataBase implements AddPerson, CountPerson, GetBirthDayPerson {
    Student[] students;

    DataBase(Student[] students) {
        this.students = students;
    }

    @Override
    public void countPerson() throws ParseException {
        DatePerson[] datePerson = new DatePerson[students.length];
        for (int i = 0; i < students.length; i++) {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime personBirthDayLocalTime = LocalDateTime.ofInstant(getBirthDayPerson(i).toInstant(), ZoneId.systemDefault());
            long years = ChronoUnit.YEARS.between(personBirthDayLocalTime, now);
            now = now.minusYears(years);
            long months = ChronoUnit.MONTHS.between(personBirthDayLocalTime, now);
            now = now.minusMonths(months);
            long days = ChronoUnit.DAYS.between(personBirthDayLocalTime, now);
            now = now.minusDays(days);
            long hours = ChronoUnit.HOURS.between(personBirthDayLocalTime, now);
            now = now.minusHours(hours);
            long minutes = ChronoUnit.MINUTES.between(personBirthDayLocalTime, now);
            now = now.minusMinutes(minutes);
            datePerson[i] = new DatePerson(years, months, days, hours, minutes);
        }
        averageAgeCalculation(datePerson);
    }


    @Override
    public void addPerson() throws ParseException {
        for (int i = 0; i < students.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите Имя");
            String firstName = scan.next();
            System.out.println("Введите Фамилию ");
            String secondName = scan.next();
            System.out.println("Введите год рождения dd.MM.yyyy");
            Date dateOfBirth = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).parse(scan.next());
            students[i] = new Student(firstName, secondName, dateOfBirth);
        }
    }

    @Override
    public Date getBirthDayPerson(int numberPersonArray) {
        return students[numberPersonArray].getDateOfBirthStudent();
    }

    private void averageAgeCalculation(DatePerson[] datePerson) {
        int averageYears = 0;
        int averageMonths = 0;
        int averageDays = 0;
        int averageHours = 0;
        int averageMinutes = 0;
        for (int i = 0; i < datePerson.length; i++) {
            averageYears += datePerson[i].getYear();
            averageMonths += datePerson[i].getMounts();
            averageDays += datePerson[i].getDays();
            averageHours += datePerson[i].getHours();
            averageMinutes += datePerson[i].getMinutes();
        }
        System.out.println(averageYears / datePerson.length + " лет " + averageMonths / datePerson.length + " месяцев " + averageDays / datePerson.length + " дней " + averageHours / datePerson.length + " часов " + averageMinutes / datePerson.length + " минут");
    }
}


