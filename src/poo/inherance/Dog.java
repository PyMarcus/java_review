package poo.inherance;

public class Dog extends Animal{
    public void bark(){
        name = "Dog";
        age = 2;
        System.out.println("The " + this.name + " has color " + color);
                System.out.println("The dog " + name + " is barking while");
        run();
        eat();
    }

    @Override
    public void run(){
        System.out.println("Run like a dog!");
    }
}
