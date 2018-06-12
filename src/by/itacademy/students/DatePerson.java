package by.itacademy.students;

/**
 * Created by user on 09.06.2018.
 */
public class DatePerson {
    private long year;
    private long mounts;
    private long days;
    private long hours;
    private long minutes;

    public DatePerson(long year, long mounts, long days, long hours, long minutes) {
        this.year = year;
        this.mounts = mounts;
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
    }


    public long getYear() {
        return year;
    }

    public long getMounts() {
        return mounts;
    }

    public long getDays() {
        return days;
    }

    public long getHours() {
        return hours;
    }

    public long getMinutes() {
        return minutes;
    }
}
