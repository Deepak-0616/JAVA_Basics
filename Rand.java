import java.util.*;
class Rand extends Thread {
    public void run() {
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int n = r.nextInt(10);
            System.out.println("Number: " + n);
            if (n % 2 == 0)
                System.out.println("Square: " + n * n);
            else
                System.out.println("Cube: " + n * n * n);
        }
    }
    public static void main(String[] args) {
        new Rand().start();
    }
}