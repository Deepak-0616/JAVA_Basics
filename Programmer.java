package com.deepak.lab;

import java.util.*;
class Employee {
    String name, id, mail, mob;
}
class Programmer extends Employee {
    double bp;
    void calc() {
        double da = 0.97 * bp;
        double hra = 0.1 * bp;
        double pf = 0.12 * bp;
        double scf = 0.001 * bp;
        double gross = bp + da + hra;
        double net = gross - (pf + scf);
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("MObno.: "+mob);
        System.out.println("Mail: "+mail);
        System.out.println("Gross: " + gross);
        System.out.println("Net: " + net);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Programmer p = new Programmer();
        System.out.print("enter basic pay : ");
        p.bp = sc.nextDouble();
        System.out.print("Enter ur name : ");
        p.name=sc.next();
        System.out.print("Enter ur id : ");
        p.id=sc.next();
        System.out.print("Enter ur mobno. : ");
        p.mob=sc.next();
        System.out.print("Enter ur mail : ");
        p.mail=sc.next();
        p.calc();
    }
}
