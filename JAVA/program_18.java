class program_18 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter a number in command line.");
            return;
        }

        int num = Integer.parseInt(args[0]);
        int flag = 1;

        if (num <= 1) {
            flag = 0;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = 0;
                    break;
                }
            }
        }

        if (flag == 1)
            System.out.println(num + " is Prime number");
        else
            System.out.println(num + " is Not Prime number");
    }
}
