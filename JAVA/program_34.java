interface Vehicle {

    void start();  
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts with key");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike starts with kick");
    }
}

class program_34 {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();
    }
}