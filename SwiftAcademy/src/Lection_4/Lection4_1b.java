
package Lection_4;

import java.util.Scanner;

public class Lection4_1b {
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Your input: ");
        int n = sc.nextInt();
        int [][] arr = new int [n][n];
        int count = 1;
        
       for (int row = 0 ; row < n ; row++){
           if (row == 1 || row ==3){
         
           }else{
             for (int col = 0 ; col < n ; col++){
                arr[col][row]=count;
                count++;  
           }
           
           
                }
       }
                
        for (int row = 0 ; row < n ; row++){
           for (int col = 0 ; col < n ; col++){
                System.out.print(arr[row][col] + "   ");
            }
           System.out.println("*");
        }
    }
    }
