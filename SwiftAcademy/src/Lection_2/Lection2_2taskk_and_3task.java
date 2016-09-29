/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lection_2;

import java.util.Scanner;

/**
 *
 * @author DanieL
 */
public class Lection2_2taskk_and_3task {
    public static void main (String []args){
        System.out.print("Check if the filled year is leap: ");
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();
        
        if ((year % 4 ==0) && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("This year is leap");
        }else {
            System.out.println("This year is NOT leap");

        }
    //TASK3 
    System.out.println ("TASK3: " + ((( 3291 + 88581 ) / 14) + ((( 1116 % 171 ) * 5) - (312 / ( 4 + 18 )))));
    }
}
