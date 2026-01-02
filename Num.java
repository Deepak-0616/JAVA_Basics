class Num extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
            try { Thread.sleep(2000); } catch (Exception e) {}
        }
    }
    public static void main(String[] args) {
        new Num().start();
    }
}
