import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class fileH3 {
    public static void main(String[] args) {


try{
        Path filePath = Paths.get("./Shreyfolder/aa.txt");
        Files.write(filePath, "...sk....rkkkk \n hello".getBytes(), StandardOpenOption.APPEND);
        System.out.println("appended");
    }
    catch(Exception e){
    System.out.println("error: " + e);
    }



    // try{ FileWriter file = new FileWriter("./Shreyfolder/aa.txt"); //this is 
    // file.write("this is meeeeeee \n . heyyyy");
    // file.close();
    // System.out.println("text written Successful  ");}
    // catch(Exception e)
    //     {System.out.println("error");}
        
    
    
    
    // catch(Exception e){
      
        

        //this is for create file in folder
        // File file = new File("./Shreyfolder/aa.txt"); //this is folder name

        // try{file.createNewFile();}
        // catch(Exception e){

        //     System.out.println("file not created");
        
        // }


        // File file = new File("abcd.txt"); //this is folder name
        // File file = new File("./Shreyfolder/skk/kk/ll"); //this is folder name
        // file.mkdir();
        // System.out.println("File created Successfully");
    }
}
