class program_21 {

    String brand;
    String model;
    int year;

    // constructor
    program_21(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    // setter methods
    void setBrand(String b) {
        brand = b;
    }

    void setModel(String m) {
        model = m;
    }

    void setYear(int y) {
        year = y;
    }

    // method to display program_21 details
    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
    }

    public static void main(String[] args) {

        program_21 c1 = new program_21("Toyota", "Innova", 2020);

        // using setters
        c1.setBrand("Honda");
        c1.setModel("City");
        c1.setYear(2022);

        c1.display();
    }
}
