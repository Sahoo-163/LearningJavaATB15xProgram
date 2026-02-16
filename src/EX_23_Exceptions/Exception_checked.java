package EX_23_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_checked {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("c://txt.file");

    }
}
