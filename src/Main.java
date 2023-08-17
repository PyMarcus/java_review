import Helloworld.Helloworld;
import Types.*;

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

        System.out.println(ok);
        Helloworld.helloworld();
    }
}
