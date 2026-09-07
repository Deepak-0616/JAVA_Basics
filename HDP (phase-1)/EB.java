package com.deepak.lab;

import java.util.*;

public class EB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter consumer no. : ");
        int cno = sc.nextInt();
        System.out.print("Enter Consumer name : ");
        String name = sc.next();
        System.out.print("Previous & current month readings : ");
        int pm = sc.nextInt(), cm = sc.nextInt();
        System.out.print("Type of connection : ");
        String type = sc.next();
        int unit = cm - pm;
        double amt = 0;
        if (unit <= 100)
            amt = unit * 1;
        else if (unit <= 200)
            amt = 100 + (unit - 100) * 2.5;
        else if (unit <= 500)
            amt = 100 + 250 + (unit - 200) * 4;
        else
            amt = 100 + 250 + 1200 + (unit - 500) * 6;
        System.out.println("Amount: " + amt);
    }
}
