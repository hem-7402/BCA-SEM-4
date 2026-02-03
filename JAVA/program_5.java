class program_5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            System.out.print("1");

            for (int j = 1; j <= i - 1; j++) {
                System.out.print("0");
            }

            if (i > 1)
                System.out.print("1");

            System.out.println();
        }
    }
}
