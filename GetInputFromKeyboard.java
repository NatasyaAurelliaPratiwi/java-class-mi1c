/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter word1: ");
            String word1 = input.readLine();

            System.out.print("Enter word2: ");
            String word2 = input.readLine();

            System.out.print("Enter word3: ");
            String word3 = input.readLine();

            System.out.println();
            System.out.println(word1 + " " + word2 + " " + word3);

        } catch(IOException e) {
            System.out.println("Terjadi kesalahan input");
        }
    }
}
    
    

