package ch12.animal;

public class Test {
    public static void main(String[] args) {
//        Dog haru = new Dog();
        Animal haru = new Dog();
//        haru.eat();
//        haru.bark();

        animalCare(haru);

        Cat c = new Cat();
        animalCare(c);
    }

    static void animalCare(Animal a) {
        a.eat();
        a.move();
        a.sleep();
    }

//    static void animalCare(Dog a) {
//        a.eat();
//        a.move();
//        a.sleep();
//        a.bark();
//    }
//
//    static void animalCare(Cat c) {
//        c.eat();
//        c.move();
//        c.sleep();
//        c.liquefy();
//    }
}
