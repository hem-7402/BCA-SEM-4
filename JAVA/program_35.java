interface Shape {

    void area();  
}

class Circle implements Shape {

    double r = 7;

    public void area() {
        double a = 3.14 * r * r;
        System.out.println("Area of Circle = " + a);
    }
}

class Rectangle implements Shape {

    double l = 10, b = 5;

    public void area() {
        double a = l * b;
        System.out.println("Area of Rectangle = " + a);
    }
}

class program_35 {
    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}
