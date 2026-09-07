class Bank implements Runnable {
    int bal = 1000;

    public void run() {
        if (Thread.currentThread().getName().equals("deposit"))
            bal += 500;
        else
            bal -= 200;
        System.out.println("Balance: " + bal);
    }
    public static void main(String[] args) {
        Bank b = new Bank();
        new Thread(b, "deposit").start();
        new Thread(b, "withdraw").start();
    }
}
