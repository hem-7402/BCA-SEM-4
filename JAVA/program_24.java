class program_24 {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        program_24 cal = new program_24();

        System.out.println("Addition of two ints: " + cal.add(10, 20));
        System.out.println("Addition of three ints: " + cal.add(10, 20, 30));
        System.out.println("Addition of two doubles: " + cal.add(5.5, 4.5));
    }
}
