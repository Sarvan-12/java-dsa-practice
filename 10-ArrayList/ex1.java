import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        // 1. Creating and adding elements
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Original List: " + list);

        // 2. Adding at a specific index
        list.add(2, 25); // Adds 25 at index 2
        System.out.println("After adding 25 at index 2: " + list);

        // 3. Updating an element
        list.set(1, 15); // Updates index 1 with 15
        System.out.println("After updating index 1 with 15: " + list);

        // 4. Removing elements
        list.remove(2); // Removes element at index 2
        System.out.println("After removing index 2: " + list);
        list.remove(Integer.valueOf(30)); // Removes first occurrence of 30
        System.out.println("After removing 30: " + list);

        // 5. Searching for elements
        System.out.println("Index of 15: " + list.indexOf(15));
        System.out.println("Contains 40? " + list.contains(40));
        System.out.println("Contains 50? " + list.contains(50));

        // 6. Sorting the list
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted in Descending Order: " + list);
        
        // 6. Reversing the list
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // 7. Iterating through the list
        System.out.print("Using for-each loop: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Using Iterator: ");
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 8. Converting Array to List and vice versa
        Integer[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Converted Array to List: " + newList);

        Integer[] newArr = newList.toArray(new Integer[0]);
        System.out.println("Converted List to Array: " + Arrays.toString(newArr));
        
        //10.get the element at index 
        list.get(0);

        // 9. Checking size and clearing the list
        System.out.println("List size: " + list.size());
        list.clear();
        System.out.println("After clearing, is empty? " + list.isEmpty());
    }
}
