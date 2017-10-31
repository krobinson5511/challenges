
package thescanner;
import java.util.Scanner;


public class TheScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    String first_name;
    System.out.println("what is your name");
    first_name = sc.next();
    
    System.out.println("hello "+ first_name);
       
    }
}
