package com.deepak.lab;

import java.util.*;

class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no : ");
        int n = sc.nextInt();
        System.out.print("the prime nos are : ");
        for (int i = 2; i <= n; i++) {
            int f = 1;
            for (int j = 2; j <= i / 2; j++)
                if (i % j == 0)
                    f = 0;
            if (f == 1)
                System.out.print(i + " ");
        }
    }
}
