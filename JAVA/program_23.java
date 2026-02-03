class program_23 {

    static int count = 0;   
    int number;            

    program_23(int n) {
        number = n;
        count++;            
    }

    void display() {
        System.out.println("Number = " + number);
        System.out.println("Count  = " + count);
        System.out.println();
    }

    public static void main(String[] args) {

        program_23 c1 = new program_23(10);
        c1.display();

        program_23 c2 = new program_23(20);
        c2.display();

        program_23 c3 = new program_23(30);
        c3.display();
    }
}
