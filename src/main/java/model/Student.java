package model;

import com.google.gson.annotations.SerializedName;

public class Student extends Entity{

    @SerializedName("Name")
    private String firstName;
    @SerializedName("Surname")
    private String lastName;
    @SerializedName("Roll No")
    private int rollNo;

    public Student(){ super();}

    public Student(String firstName, String lastName, int rollNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rollNo = rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

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

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
