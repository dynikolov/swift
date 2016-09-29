
package Lection_4;

import java.util.Scanner;

public class Lection4_1a {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Your input: ");
        int n = sc.nextInt();
        int [][] arr = new int [n][n];
        int count = 1;
        
       for (int row = 0 ; row < arr.length ; row++){
           for (int col = 0 ; col < arr.length ; col++){
                arr[col][row]=count;
                count++;
                
            }
       }
                
        for (int row = 0 ; row < arr.length ; row++){
           for (int col = 0 ; col < arr.length ; col++){
                System.out.print(arr[row][col] + "   ");
            }
           System.out.println("*");
        }
    }
    }
