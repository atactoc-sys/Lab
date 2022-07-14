package com.innovation.shapes;

public class Circle {
    float radius;
    public float pi = 3.5f;
    public Circle () {
        radius = 1.5f;
    }
    public Circle (float radius) {
        this.radius = radius;
    }
    public Circle (float redius , float pi){
        this(redius);
        this.pi=3.5f;
    }
    public float calculateCircleArea (float radius){
        return pi*radius*radius;
    }
    public float calculateCircumference(float radius) {
        return 2 * pi * radius;
    }
    public static void main(String args[]){
        Circle obj = new Circle();
        System.out.println("Circle area  =  "+obj.calculateCircleArea(3.5f));
        System.out.println("Circle circumference  =  "+obj.calculateCircumference(3.5f));
    }
}
