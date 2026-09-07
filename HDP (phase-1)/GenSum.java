class GenSum {
    static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sum(2, 3.5));
    }
}
