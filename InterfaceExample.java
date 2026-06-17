/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package natasya_11juni2026;

/**
 *
 * @author LAB-SI-PC
 */
public class InterfaceExample {
   public static void main(String[] args) {
    LineImplemensRelation line1 = new LineImplemensRelation(1, 5, 1, 5);
    LineImplemensRelation line2 = new LineImplemensRelation(1, 5, 1, 5);
    
    Relation line = new LineImplemensRelation(); 
    
    System.out.println(line.isGreater(line1, line2));
   }
}
