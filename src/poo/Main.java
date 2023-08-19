package poo;

import poo.inherance.Bird;
import poo.inherance.Dog;

public class Main {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
        Classes c = new Classes();
        c.print();

        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(dog.getColor());

        dog.setColor("blue");
        dog.bark();
        bird.fly();
    }
}
