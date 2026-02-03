class program_27 {

    {
        System.out.println("Instance Initialization Block executed");
    }

    program_27() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        program_27 d1 = new program_27();

        System.out.println("Main method ended");
    }
}
