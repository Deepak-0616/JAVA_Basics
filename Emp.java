
package com.deepak.lab;

class NameException extends Exception {
    NameException(String s) { 
        super(s);
    }
}
class AgeException extends Exception {
    AgeException(String s) { 
        super(s); 
    }
}
class Emp {
    public static void main(String[] args) throws Exception {
        String n = "123";
        int age = 40;
        if (n.matches("\\d+"))
            throw new NameException("Invalid Name");
        if (age > 50)
            throw new AgeException("Age > 50");
        System.out.println("Valid Employee");
    }
}
