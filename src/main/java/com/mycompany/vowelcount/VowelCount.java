/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcount;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class VowelCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter a sentence");
        String input = sc.nextLine();
        
        int vowelCount = countVowels(input);
        System.out.println("number of vowels:"+ vowelCount);
       
    }

    private static int countVowels(String input) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
