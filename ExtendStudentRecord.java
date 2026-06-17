/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Natasya_4juni2026;

/**
 *
 * @author LAB-SI-PC
 */
public class ExtendStudentRecord {

    protected String name;
    protected double average;

    public ExtendStudentRecord(String name, double average) {
        this.name = name;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public void displayInfo() {
        System.out.println("Nama    : " + name);
        System.out.println("Nilai   : " + average);
    }
}

