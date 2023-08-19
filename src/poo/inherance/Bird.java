package poo.inherance;

public class Bird extends Animal{
    public void fly(){
        name = "bird";
        age = 1;
        color = "yellow";
        System.out.println("The bird " + name + " is flying while");
        run();
        eat();
    }
}
