package model;


//import javax.security.auth.Subject;
import java.util.List;

/**
 * Created by Сергей on 23.04.2015.
 */
public class Teacher {

    private String firstName;
    private String middleName;
    private String lastName;

    List<Subject> availableSubjects;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Subject> getAvailableSubjects() {
        return availableSubjects;
    }

    public void setAvailableSubjects(List<Subject> availableSubjects) {
        this.availableSubjects = availableSubjects;
    }

    public void addSubject(Subject subject){
        availableSubjects.add(subject);
    }
}
