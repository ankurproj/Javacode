//PROGRAM TO READ CHARACTER IN WORDS

import java.util.Scanner;
public class Read_char {
    public static void main(String[] args) {
        System.out.println("Enter Word ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(3);
        System.out.println("char = "+ch);
    }
}
