package dao;

import model.Student;
import org.junit.Before;
import org.junit.Test;
import validation.Validator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StudentIsValidTest {

    Validator validator;

    @Before
    public void setUp() {

        validator = mock(Validator.class);
        when(validator.isValid(new Student("FirstName",null,123123))).thenThrow(new NullPointerException());
        when(validator.isValid(new Student(null,"LastName",123123))).thenThrow(new NullPointerException());
    }

    @Test(expected = NullPointerException.class)
    public void test(){

        validator.isValid(new Student("Name",null,123412));

    }

}