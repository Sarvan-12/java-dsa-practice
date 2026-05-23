import java.util.HashSet;
import java.util.Iterator;

public class ex1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(3);
        set.add(3);
        set.add(5);
        System.out.println(set);

        // size
        int s = set.size();
        System.out.println(s);

        // search - contains 
        if(set.contains(1)) System.out.println("true");
        if(!set.contains(4)) System.out.println("true");

        // delete
        set.remove(3);
        System.out.println(set);

        // iterator
        Iterator it = set.iterator();
        while(it.hasNext()){    //hasNext means , is there any element in the nxt set
            System.out.print(it.next()+" ");
        }

    }
}
