package Exceptions_new;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_throws {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        System.out.println("Starting of the program");
        System.out.println("Program will start executing");
        Thread.sleep(6000);
        FileInputStream fis = new FileInputStream("C:\\\\input.txt");
        System.out.println("End of the program");
    }
}
