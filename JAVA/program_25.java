class program_25 {

    String name;
    int age;

    program_25() {
        name = "Unknown";
        age = 0;
    }

    program_25(String n) {
        name = n;
        age = 0;
    }

    program_25(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        program_25 s1 = new program_25();
        program_25 s2 = new program_25("Rahul");
        program_25 s3 = new program_25("Amit", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}
