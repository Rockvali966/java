import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Fileexception {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("nonexistentfile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("A FileNotFoundException occurred: " + e.getMessage());
        }
    }
}
