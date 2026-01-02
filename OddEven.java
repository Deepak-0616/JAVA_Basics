
package com.deepak.lab;

import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("enter array : ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int x : a)
            System.out.println(x + " is " + (x % 2 == 0 ? "Even" : "Odd"));
    }
}


