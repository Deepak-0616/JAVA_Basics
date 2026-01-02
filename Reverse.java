
package com.deepak.lab;

import java.util.*;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string : ");
        String s = sc.next();
        System.out.println(new StringBuilder(s).reverse());
    }
}