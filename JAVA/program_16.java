class program_16 {
    public static void main(String[] args) {

        // jagged array (rows of different sizes)
        int a[][] = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        int sum = 0;

        // loop through jagged array
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum = sum + a[i][j];
            }
        }

        System.out.println("Sum of all elements = " + sum);
    }
}
