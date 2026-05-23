import java.util.*;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname = sc.next();
        String lname = sc.next();

        System.out.println("my name is " + fname);

        // concatination
        String name = fname + " " + lname;
        System.out.println(name);

        // length
        System.out.println(name.length());

        // charAt
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                System.out.print(" ");
            }
            System.out.print(name.charAt(i));
        }
        System.out.println();

        // compare
        // 1. s1>s2 : +ve value
        // 2. s1==s2 : 0
        // 3. s1<s2 : -ve value
        if (fname.compareTo(lname) == 0) { // if fname == lname , sometimes fails in contests
            System.out.println("strings r equal");
        } else
            System.out.println("not equal");

        System.out.println(fname.substring(0, 3));

        // substring(beg index,end index) , similer to slicing

        // strings are immuatble , cannot change after implemented

    }
}