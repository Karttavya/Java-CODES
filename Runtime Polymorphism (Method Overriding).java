class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePoly {
    public static void main(String[] args) {

        Animal a;        // reference of parent

        a = new Dog();   // runtime object Dog
        a.sound();

        a = new Cat();   // runtime object Cat
        a.sound();
    }
}
