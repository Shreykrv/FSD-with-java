import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileH2 {

    public static void main(String[] args) {
        try {
            File a = new File("abc.txt");
            Scanner b = new Scanner(a);
            while (b.hasNextLine()) {
                String data = b.nextLine();
                System.out.println(data);
            }
            b.close();
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("File not found or another error occurred");
             
            e.printStackTrace(); // Optional: prints the stack trace for debugging purposes
        }
    }
}
