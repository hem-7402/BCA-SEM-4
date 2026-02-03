class program_17 {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter strings in command line.");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i].compareToIgnoreCase(args[j]) > 0) {
                    String temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }

        System.out.println("Strings in alphabetical order:");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
