class program_19 {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Usage:");
            System.out.println("java Area <radius> <length> <breadth>");
            return;
        }

        double radius = Double.parseDouble(args[0]);
        double length = Double.parseDouble(args[1]);
        double breadth = Double.parseDouble(args[2]);

        double areaCircle = 3.14 * radius * radius;
        double areaRectangle = length * breadth;

        System.out.println("Area of Circle = " + areaCircle);
        System.out.println("Area of Rectangle = " + areaRectangle);
    }
}
