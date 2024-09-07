//Q3 - Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and calculate Profit
//or Loss.
import java.util.*;
public class Profit_Loss{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Selling price:");
        float SP = scn.nextFloat();
        System.out.println("Enter Cost price:");
        float CP = scn.nextFloat();
        float amount;
        if(SP>CP){
            amount = SP-CP;
            System.out.println("Profit of RS."+ amount);
        }else if(CP>SP){
            amount = CP-SP;
            System.out.println("Loss of RS."+ amount);
        }else{
            System.out.println("NO PROFIT!!!NO LOSS!!!");
        }

    }
}