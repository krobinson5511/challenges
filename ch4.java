package ch4;

import java.util.Scanner;


public class CH4 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
        int NUM1;
        System.out.println("ENTER ANY NUMBER ");
        NUM1 = sc.nextInt();
        
        if (NUM1 > 100){
            System.out.println("your number is more than 100");
        } else if (NUM1 < 100) {
            System.out.println("less than 100 ");          
        } else {
            System.out.println("Your number must be exactly 100");
        }
                }
    
}
