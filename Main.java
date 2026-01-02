
package com.deepak.lab;

abstract class Shape {
    int a, b;
    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int x, int y) { a = x; b = y; }
    void printArea() { 
        System.out.println("Area of rectangle: " + (a * b)); 
    }
}

class Triangle extends Shape {
    Triangle(int x, int y) { a = x; b = y; }
    void printArea() { 
        System.out.println("Area of triangle: " + (0.5 * a * b)); 
    } 
}

class Circle extends Shape {
    Circle(int r) { a = r; }
    void printArea() {
        System.out.println("Area of circle          : " + (3.14 * a * a)); 
    }
}

class Main {
    public static void main(String[] args) {
        new Rectangle(4, 5).printArea();
        new Triangle(3, 6).printArea();
        new Circle(3).printArea();
    }
}
