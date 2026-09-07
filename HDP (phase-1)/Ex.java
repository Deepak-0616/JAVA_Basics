class Ex {
    public static void main(String[] args) {
        try {
            int x = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Predefined Exception");
        }
        try {
            throw new Exception("User Defined Exception");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

