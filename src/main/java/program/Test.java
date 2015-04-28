package program;

import dao.DAO;
import dao.StudentJsonDAO;
import model.Student;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        DAO <Student> studentDAO = new StudentJsonDAO();
        System.out.println(studentDAO.create(new Student("Ivan","Ivanov",111111)));
        System.out.println(studentDAO.create(new Student("Petr","Petrov",222222)));
        System.out.println(studentDAO.create(new Student("Fedor","Fedorov",333333)));
        System.out.println(studentDAO.create(new Student("Sidor","Sidorov",444444)));

        /*JsonFile jsonFile = new JsonFile(Resources.STUDENT_JSON_FILE);
        jsonFile.createFile();
        JsonCRUDHandlerForStudent crudHandlerForStudent = new JsonCRUDHandlerForStudent();
        jsonFile.displayFileContent();



        crudHandlerForStudent.writeEntityToFile(student);
        jsonFile.displayFileContent();

        jsonFile.printClosingBracket();

        if(!jsonFile.isCreated())
            jsonFile.createFile();

        if(jsonFile.lastSymbolInFileIs(']'))
            jsonFile.printComma();

        jsonFile.displayFileContent();

        crudHandlerForStudent.writeEntityToFile(student);
        jsonFile.displayFileContent();

        jsonFile.printClosingBracket();
        jsonFile.displayFileContent();
*/

        /*
        JsonCRUDHandlerForStudent crudHandlerForStudent = new JsonCRUDHandlerForStudent();
        crudHandlerForStudent.writeEntityToFile(student);
        crudHandlerForStudent.writeEntityToFile(new Student("Sergey","Nesementsov",132321));
        */
    }
}
