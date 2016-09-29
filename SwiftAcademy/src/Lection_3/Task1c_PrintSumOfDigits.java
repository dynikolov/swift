
package Lection_3;

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {
    public static void main (String [] args){
        
    Scanner sc = new Scanner (System.in);
    System.out.print("Your number is: ");
    int delimo = sc.nextInt();
    int sum =0;
    
    while (delimo >= 1){
        sum = sum + delimo %10; 
        delimo = delimo / 10;
        
       // System.out.println(sum);
        }
        System.out.println(sum);
        
        System.out.println("\nCreated by Daniel Nikolov");
    }
}