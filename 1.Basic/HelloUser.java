//import Scanner Class
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner name = new Scanner(System.in);    //Create Scanner Object
        welcome(name.next());               
        name.close();                             //Close Sanner Object to avoid resource leak
    }

    public static void welcome(String name) {
        System.out.println("Welcome " + name + " to the Java World");
    }
}