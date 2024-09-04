//Q1 - Input name, roll number and field of interest from user and print in the format below :
//Name: xyz, Roll number: xyz, Field of interest: xyz
import java.util.Scanner;
public class Input_details {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter your roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your field of interest: ");
        String interest = sc.nextLine();
        System.out.println("Name: " +name);
        System.out.println("Roll no.: "+roll);
        System.out.println("Field of interest: " +interest);

    }
}


