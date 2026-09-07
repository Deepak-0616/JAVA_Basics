
package com.deepak.lab;
import java.util.*;
public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter currency : ");
        double v = sc.nextDouble();
        System.out.println("Dollar to INR: " + v * 83);
        System.out.println("Euro to INR: " + v * 90);
        System.out.println("Yen to INR: " + v * 0.56);
    }
}
