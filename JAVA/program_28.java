class Person {

    public String name = "Rahul";        // public
    private int age = 20;                // private
    protected String city = "Delhi";     // protected
    String country = "India";            // default
	
    void showAge() {
        System.out.println("Age (private) = " + age);
    }
}

class program_28 {
    public static void main(String[] args) {

        Person p = new Person();

        System.out.println("Name (public) = " + p.name);
        System.out.println("City (protected) = " + p.city);
        System.out.println("Country (default) = " + p.country);


        p.showAge(); // accessing private via method
    }
}