import Array.Array;
import Helloworld.Helloworld;
import Loops.Loops;
import Types.*;
import Aritmethic.Aritmethic;
import If_Else.IfElse;

public class Main {
    static final String ok = "KOK";

    public void test(){
        System.out.println(ok);
    }

    public static void main(String args[]){
        Main o = new Main();
        o.test();

        Types t = new Types();
        t.type();
        Aritmethic.solve();
        Aritmethic.logical();

        IfElse.ifelse();

        Loops.loop();

        System.out.println(ok);
        Helloworld.helloworld();

        System.out.println();

        Array.array();
    }
}
