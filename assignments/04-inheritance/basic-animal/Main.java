class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Name: Faizan Ahmed Shaikha");
        System.out.println("Register Number: 25BTIT146");

        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}