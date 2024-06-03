// import java.util.Scanner;

public class uInput {
    public static void main(String[] args) {
        java.util.Scanner a = new java.util.Scanner(System.in);
        System.out.println("Enter your age");
        // int age = a.nextInt();
        String name = a.nextLine();
        System.out.println("Your name is " + name);
        String pass = a.nextLine();
        System.out.println("Your password is " + pass);

        if(name.equals("shrey")|| name.equals(""){
            if(pass.equals("123"))
            System.out.println("Welcome Authorized user");
        }
        else{
            System.out.println("Sorry unauthorized user");
            }
        
        ))

        
        // if(name=="Shrey"){
        //     System.out.println("Authorized user");
        // }
        // else{
        //     System.out.println("Logout");
        //     }

        // if (age>=18){
        //     System.out.println("You are eligible to vote");
        // }
        // else{
        //     System.out.println("You are not eligible to vote");
        // }

    
}
}