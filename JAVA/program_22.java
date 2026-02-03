class program_22 {

    protected void finalize() {
        System.out.println("Finalize method called: Object is cleaned up");
    }

    public static void main(String[] args) {

        program_22 obj1 = new program_22();
        program_22 obj2 = new program_22();

        obj1 = null;
        obj2 = null;

        System.gc();

        System.out.println("Main method finished");
    }
}
