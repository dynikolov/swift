
package Lection_3;

import java.util.Scanner;


public class Task3c_PrintChristmasTree {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Your Christmas tree will have: ");
        int n = sc.nextInt();
        
        for (int i=0; i<n-2; i++){
            //for spaces
            for (int j=0; j<n-i ; j++)
            System.out.print(" ");
            //for *
            for (int k=0; k<(2*i+1); k++)
            System.out.print("*");
            
            System.out.println();
            }
        //styblo + stoika7
        for (int i=0; i<n; i++){
            System.out.print(" ");       
        }
           System.out.println("*");
        for (int i=0; i<n-1; i++){
            System.out.print(" ");       
        }
           System.out.println("***");
        }
    }

