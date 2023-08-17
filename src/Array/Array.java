package Array;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class Array {
    public static void array(){
        Vector<Integer> ab = new Vector<Integer>();
        ab.add(2);
        ab.add(1);
        System.out.println(ab);

        Collections.sort(ab);
        System.out.println(ab);

        Scanner z = new Scanner(System.in);
        System.out.println(z.nextLine());

        String[] sliceOfstring = new String[4];
        int[] a = {1, 2, 3};
        sliceOfstring[0] = "A";
        sliceOfstring[2] = "B";

        for(int i = 0; i < 3; i++){
            System.out.println(sliceOfstring[i]);
            System.out.println(a[i]);
        }
    }
}
