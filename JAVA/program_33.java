class Shape {

    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {

    double r = 7;

    void area() {
        double a = 3.14 * r * r;
        System.out.println("Area of Circle = " + a);
    }
}

class Rectangle extends Shape {

    double l = 10, b = 5;

    void area() {
        double a = l * b;
        System.out.println("Area of Rectangle = " + a);
    }
}

class program_33 {
    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}
