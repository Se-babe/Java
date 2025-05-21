class Animal {
    Animal() {
        System.out.println("animal constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        super();  // Calls the constructor of Animal
        System.out.println("dog constructor called");
    }
}


    public static void main(String[] args) {
    }

