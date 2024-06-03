import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileH {




    public static void main(String[] args) {
        // File a = new File("abc.txt");
        // File a = new File("C:\\Users\\Shrey Kumar\\Desktop\\jdk\\java prac");
        // if(a.exsists()){
        //     System.out.println("File exists");
        //     System.out.println("File Name  is: "+a.getName());
        //     System.out.println("Path is: "+a.getAbsolutePath());
        //     System.out.println("Parent is: "+a.getParent());
        //     // System.out.println("Path is: "+a.getParent());
        //     System.out.println("File size is: "+a.length()+ "bytes");
        //     System.out.println("File is readable: "+a.canRead());
        //     System.out.println("File is Writeable: "+a.canWrite());







            // System.out.println("Path is: "+a.getParent());
            }

            try {
                File a = new File("abc.txt");
                Scanner b = new Scanner(a);
                while(b.hasNextLine()){
                    // System.out.println(b.nextLine());
                    String data = b.nextLine();
                    System.out.println(data);

            }
            Catch (Exception e){
                System.out.println("File not found");
            }
        // }
        // try {
        //     if (a.createNewFile()) {
        //         System.out.println("File created successfully");
        //     } else {
        //         System.out.println("File already exists");
        //     }
        // } catch (IOException e) {
        //     System.out.println("File not created");
        //     e.printStackTrace(); // Optional: prints the stack trace for debugging purposes
        // }
    }
}
