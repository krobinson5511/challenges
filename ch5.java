package ch5;

import java.util.Scanner;


public class CH5 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
        int NUM01;
        System.out.println("ENTER YOUR MARK ");
        NUM01 = sc.nextInt();
        
        if (NUM01 > 20){
            System.out.println("You achieved an A");
        }else if (NUM01 > 10) {
            System.out.println("You achieved an c");
        }else {
            System.out.println("you have failed the test sorry");
        }     
    }
}
