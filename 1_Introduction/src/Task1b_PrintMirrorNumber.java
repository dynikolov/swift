


import java.util.Scanner;


public class Task1b_PrintMirrorNumber {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Your number is: ");
        int input = sc.nextInt();
    //there is a problem if the number is 0123 -> the output will be 321    
        int sum = 0;
        while (input >= 1){     
           sum = input % 10;
           System.out.print(sum);
           input = input / 10;
       }   
        System.out.println("\nCreated by Daniel Nikolov");
    }  
        
}
