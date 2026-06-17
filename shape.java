/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Natasya_4juni2026;

/**
 *
 * @author LAB-SI-PC
 */
//Abstract Class
public abstract class shape {
    public abstract double getArea();
    public abstract String getName();
}

//subclass Circle
class Circle extends shape {
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
    @Override
    public String getName(){
        return "Circle";
    }
}
//Subclass Square
class Square extends shape {
    private double side;
    
    public Square(double side){
        this.side = side;
    }
    
    @Override
    public double getArea(){
    return side * side;
    
    }
    
    @Override
    public String getName(){
        return"Square";
    }
}
 //Main Class
 class AbstractClass {
    
    public static void main(String[] args){
        Circle circle = new Circle(8);
        Square square = new Square(6);
        
        System.out.println("Nama shape : " + circle.getName());
        System.out.println("luas : " + circle.getArea());
        
        System.out.println("Nama shape :" + square.getName());
        System.out.println("Luas       :"  +square.getArea());
    }
}


