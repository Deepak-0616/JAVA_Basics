
package com.deepak.lab;
import java.util.*;
public class Palindrome {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.next();
        String r = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(r) ? "Palindrome" : "Not Palindrome");
    }   
}
