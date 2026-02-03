class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

class program_32 {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Animal d = new Dog();   
        d.sound();              
    }
}
