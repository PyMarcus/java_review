package Loops;

public class Loops {
    public static void loop(){
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        int i = 0;
        while (i < 10){
            System.out.println(i);
            ++i;
        }

        do{
            System.out.println(i);
            ++i;
        }while (i < 20);
    }
}
