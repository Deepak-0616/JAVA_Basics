class DemoEx {
    public static void main(String[] args) {
        try { int x = 1 / 0; } 
        catch (ArithmeticException e) { System.out.println("Arithmetic"); }

        try { int a[] = new int[2]; a[5] = 10; } 
        catch (ArrayIndexOutOfBoundsException e) { System.out.println("Array"); }

        try { int n = Integer.parseInt("abc"); } 
        catch (NumberFormatException e) { System.out.println("NumberFormat"); }
    }
}
