package ch3;
import java.util.Scanner;
public class CH3 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int NUM1;
        System.out.println("ENTER THE FIRST NUMBER");
        NUM1 = sc.nextInt();
        
        int NUM2;
        System.out.println("ENTER THE SECOUND NUMBER");
        NUM2 = sc.nextInt();
    
        int NUM3 = NUM1 * NUM2;
        
        System.out.println(NUM3);
        
