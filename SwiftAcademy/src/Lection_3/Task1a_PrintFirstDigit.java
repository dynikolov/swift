
package Lection_3;

import java.util.Scanner;

public class Task1a_PrintFirstDigit {
    public static void main (String [] args){
        
    Scanner sc = new Scanner (System.in);
    int delimo = sc.nextInt();
    
    int delitel = 10;
    
        while (delimo >= delitel){
        delimo = delimo / delitel;
        //System.out.println(delimo);
        }
        System.out.println(delimo);
        
        System.out.println("\nCreated by Daniel Nikolov");
    }
}
