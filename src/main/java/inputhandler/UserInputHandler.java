package inputhandler;

import java.util.Scanner;

/**
 * Created by Сергей on 23.04.2015.
 */
public class UserInputHandler {

    Scanner scanner;
    {
        scanner = new Scanner(System.in);
    }

    public String getStringAnswer(String question){
        System.out.println(question);
        return scanner.next();
    }

    public int getIntAnswer(String question){
        System.out.println(question);
        return scanner.nextInt();
    }

}
