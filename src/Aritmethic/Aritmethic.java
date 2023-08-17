package Aritmethic;

public class Aritmethic{
    public static void solve(){
        int sum = 3 + 2;
        int sub = 3 - 2;
        int mul = 3 * 2;
        float div = 3 / 2f;

        System.out.println(sum + " " + sub + " " + mul + " " + div);
    }

    public static void logical(){
        int x = 1;
        int y = 2;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x <= y);

        String a = "a";
        String b = "b";
        System.out.println(a.equals(b));
        System.out.println(!a.equals(b));
        System.out.println(x == 1 && y == 2);
        System.out.println(x == 1 || y == 2);

    }
}