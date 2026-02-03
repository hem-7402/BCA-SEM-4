class program_26 {

    int sum(int... numbers) {

        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }

        return total;
    }

    public static void main(String[] args) {

        program_26 sc = new program_26();

        System.out.println("Sum of 2 numbers = " + sc.sum(10, 20));
        System.out.println("Sum of 3 numbers = " + sc.sum(10, 20, 30));
        System.out.println("Sum of 5 numbers = " + sc.sum(1, 2, 3, 4, 5));
    }
}
