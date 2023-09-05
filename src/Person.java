import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    // Constructors
    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    // Additional Methods
    public String fullName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return title + " " + fullName();
    }

    public String getAge() {
        return calculateAge(Calendar.getInstance().get(Calendar.YEAR)) + " years old";
    }

    public String getAge(int year) {
        return calculateAge(year) + " years old";
    }

    public String toCSVDataRecord() {
        return firstName + "," + lastName + "," + ID + "," + title + "," + YOB;
    }

    private int calculateAge(int currentYear) {
        return currentYear - YOB;
    }
}