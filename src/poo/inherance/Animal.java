package poo.inherance;

public class Animal {
    String color = "pink";
    String name;
    int age;
    static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //get and setter
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        if(color.equals(" ") && !color.contains(CHARACTERS)){
            System.out.println("Invalid color");
        }else{
            this.color = color;
        }
    }

    public void run(){
        System.out.println("The " + this.name + " has color " +
                this.color + " and has " + this.age + " years, and now, he is running.");
    }

    public void eat(){
        System.out.println("The " + this.name + " has color " +
                this.color + " and has " + this.age + " years, and now, he is eating.");
    }
}
