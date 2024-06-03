import java.util.*;
public class String_input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = sc.nextLine();

        System.out.println("Hello, " + name + "! Welcome to your" + " program.");

        sc.close();

}

}