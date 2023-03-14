package edu.brandeis.cosi12b2.lec13;

import edu.brandeis.cosi12b2.lec13.animal.Animal;
import edu.brandeis.cosi12b2.lec13.animal.Cat;
import edu.brandeis.cosi12b2.lec13.animal.Dog;
import edu.brandeis.cosi12b2.lec13.animal.Mammal;

public class M02_Casting {
    public static void main(String[] args) {
        // upcast();
        // bothCast();
        // errorCast1();
        // errorCast2();
        guardedCast();
    }

    public static void upcast() {
        Cat c = new Cat();
        System.out.println(c.health);

        Dog d = new Dog();
        System.out.println(d.health);

        Mammal m = d; // upcasting
        System.out.println(((Cat) m).owner());
    }

    public static void bothCast() {
        Cat c1 = new Cat();
        Animal a = c1; // auto upcast
        // Cat c2 = a; // does not compile
        Cat c2 = (Cat) a; // add explicit cast
    }

    public static void errorCast1() {
        Cat c1 = new Cat();
        Animal a = c1; // auto upcast
        Dog d1 = (Dog) a; // add explicit cast
    }

    public static void errorCast2() {
        Mammal m = new Mammal();
        Cat c = (Cat) m;
    }

    public static void guardedCast() {
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        // Animal a = c1; //upcasting to Animal
        Animal a = d1; //upcasting to Animal
        if (a instanceof Cat) { // testing if the Animal is a Cat
            System.out.println("It's a Cat!");
            Cat c2 = (Cat)a;
        } else {
            System.out.println("It's not a Cat!");
        }
    }
}
