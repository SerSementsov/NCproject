package dao;

import model.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StudentJsonDAOTest {


    DAO studentJsonDAO;

    @Before
    public void setUp() throws Exception {

        studentJsonDAO = mock(DAO.class);

        Student sampleStudent = new Student("Igor","Ivanov",123456);
        when(studentJsonDAO.create(sampleStudent)).thenReturn(sampleStudent.getId());

    }

    @Test
    public void testCreate() throws Exception {

        Student actualStudent = new Student("Ivan","Igorev",654321);
        String id = actualStudent.getId();
        assertEquals(id, studentJsonDAO.create(actualStudent));

    }
}