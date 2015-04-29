package program;

import dao.StudentJsonDAO;
import model.Student;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        StudentJsonDAO studentDAO = new StudentJsonDAO();
        //DAO <Student> studentDAO = new StudentJsonDAO();
        /*System.out.println(studentDAO.create(new Student("Ivan","Ivanov",111111)));
        System.out.println(studentDAO.create(new Student("Petr","Petrov",222222)));
        System.out.println(studentDAO.create(new Student("Fedor","Fedorov",333333)));
        System.out.println(studentDAO.create(new Student("Sidor","Sidorov",444444)));
*/

        int N = 100;
        for(int i = 0; i < N; i++){
            studentDAO.create(new Student("111","222",333));
        }
        studentDAO.create(new Student("222","444",333333));

        long startTime1 = System.currentTimeMillis();
        System.out.println(studentDAO.read1(333333));
        long finishTime1 = System.currentTimeMillis();
        System.out.println("That took: "+(finishTime1-startTime1)+ " ms");

        long startTime2 = System.currentTimeMillis();
        System.out.println(studentDAO.read(333333));
        long finishTime2 = System.currentTimeMillis();
        System.out.println("That took: "+(finishTime2-startTime2)+ " ms");

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
        crudHandlerForStudent.writeEntityToFile(new Student("Nesergey","Nesementsov",132321));
        */
    }
}
