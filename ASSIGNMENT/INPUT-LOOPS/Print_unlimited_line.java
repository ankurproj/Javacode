//Q5 - Given few lines of input(number of lines unknown) where each line has two
//strings, concatenate the strings.
import java.util.Scanner;
public class Print_unlimited_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        //HERE PRINTING FOR UNKNOWN LINES
        while(sc.hasNextLine()){
                String a = sc.next();
                System.out.println("Enter second string");
                String b = sc.next();
                System.out.println(a+b);
        }
    }

}
