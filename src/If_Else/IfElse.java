package If_Else;

public class IfElse {
    public static void ifelse(){
        int x = 1;

        if(x == 1){
            System.out.println("1");
        }else if (x == 3){
            System.out.println("D");
        }else{
            System.out.println(3);
        }

        switch (x){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("3");
            default:
                System.out.println("default");
        }

        if(x == 1) System.out.println(1);
    }
}
