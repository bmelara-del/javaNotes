import java.util.*;

public class Friday {
    public static void main(String[] args) {

        // to make an array list
        // ArrayList<DataType> name = new ArrayList<>();

        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);

        // getting an element at an index
        System.out.println(list.get(0)); // Hello

        // changing a value at position of index
        list.set(0, "Hi");
        System.out.println(list);

        // removing an element at an index
        list.remove(1); // removes "World"  
        System.out.println(list);

        // size of the array list
        System.out.println(list.size()); // 1

        // to check if it is equal to something else
        System.out.println(list.equals("Hi")); // false
        
    }
}
