/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deepak.lab;

/**
 *
 * @author deepa
 */
import java.util.*;
public class SortStrings {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Number: ");
            int n = sc.nextInt();
            String s[] = new String[n];
            System.out.print("Enter strings : ");
            for (int i = 0; i < n; i++)
                s[i] = sc.next();
            Arrays.sort(s);
            for (String x : s)
                System.out.println(x);
    }
}
