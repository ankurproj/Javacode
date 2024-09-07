//Q2 - Write a program to print absolute value of a number entered by the user.
import java.util.*;

public class Absolute_value {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = scn.nextInt();
        if(num>=0){
            System.out.println("Number:"+num);
        }
        else if(num<0){
            System.out.println("Absolute value:"+(num*(-1)));
        }
    }
}