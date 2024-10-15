/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vowelcount;

/**
 *
 * @author RC_Student_lab
 */
public class VowelCounter {
     public static int countVowels(String sentence) {
        int vowelCount = 0;
        sentence = sentence.toLowerCase(); // convert to lowercase

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowelCount++;
            }
            
        }
        return vowelCount;
}
}


   
   
   