class program_20 {

    double length;
    double breadth;
    double area;

    // constructor
    program_20(double l, double b) {
        length = l;
        breadth = b;
        area = length * breadth;
    }

    // method to display details
    void display() {
        System.out.println("Length  = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area    = " + area);
    }

    public static void main(String[] args) {

        program_20 r1 = new program_20(10, 5);
        r1.display();
    }
}
