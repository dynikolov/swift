/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DanieL
 */
public class Task3b_PrintZFigure {
    public static void main (String [] args){
        int y=5;
        int x=5;
        
        for (int i=0; i<x ; i++){
            System.out.print("*");
        }
        System.out.println();
        
        for (int i = y-2; i > 0; i--){
            
            System.out.print("1");
            y--;
            
            for (int k = y-2; k > 0; k--){
            System.out.print("2");
            
            }
        System.out.println("*");
        }
        
         for (int i=0; i<x ; i++){
            System.out.print("*");
    }
}
}
