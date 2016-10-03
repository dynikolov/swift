/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

public class Task4d_SumOfNumbersInString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type your sentence");
        String sentence = scan.nextLine();
        int sum = 0;
        int number = 0;
       
        for (char charIndex : sentence.toCharArray()) {
           
            if (Character.getNumericValue(charIndex) > 0 && Character.getNumericValue(charIndex) <= 9) {
                number *= 10;
                number += Character.getNumericValue(charIndex);

            } else {
                sum += number;
                number = 0;
            }
        }
        System.out.println(sum);

    }
}