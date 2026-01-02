
package com.deepak.lab;

class Demo {
    public static void main(String[] args) {
        try {
            int c = 1 / 0;
        } 
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
