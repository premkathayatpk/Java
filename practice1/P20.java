/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author premk
 */
public class P20 {
    public static void main(String[] args) {
      System.out.println("Here's a list of the ASCII values of all the upper"
                   + " case letters.");
char letter = 'A';
while (letter <= 'Z'){
    System.out.println(letter + "  " + (int)letter);    
    ++letter;
}
    }
}
