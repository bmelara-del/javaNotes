package forLoopsAndArrays;  

import java.util.*; 

public class javaNotes1 {
    public static void main(String[] args) {
        // This is a single-line comment in Java

        /*
         This is a multi-line comment in Java.
         It can span multiple lines.
        */
        Object obj1 = new Object(); // default constructor
        Object obj2 = new Object(10, "example", true); // parameterized constructor
        ArrayList<Object> objects = new ArrayList<>(); // create an ArrayList to hold Object instances
        objects.add(obj1); // add obj1 to the list
        objects.add(obj2); // add obj2 to the list

        // could also add new iobjects into an array list like this:
        objects.add(new Object(11, "name", false)); 
        objects.add(new Object(12, "nam", true));

        for(Object obj : objects) {
            System.out.println(obj.getString()); // print each object's string name
        }
        System.out.println("---");
        for(Object obj : objects) {
            System.out.println(obj);
        }
         // for loops
         // Arrays

         // "counting" for loops 
         // start ; stop ; step
         // count to 4
        for(int i = 0; i < 5; i++) {
            System.out.println("Count: " + i);

        }

        // advanced for loop (for-each loop)
        String [] fruits = {"Apple", "Banana", "Cherry"}; // array of strings
        for(String fruit: fruits) { // for each fruit in the fruits array
            System.out.println("Fruit: " + fruit); // print the fruit
        }

        // more examples
        int[] arr = {1, 2, 3, 4, 5};
        for(int num: arr){ // for every number in the arr array
            System.out.println("Number: " + num); // print the number
        }

        String[] nameList = new String[3]; // {null, null, null} // create an array of strings with 3 elements
        // all of the elements in this new array are going to take on default values
        // default values are always foing to be that datatype's equivalent too 0
        // default for an int is 0, double -> 0.0, boolean -> false, String -> null
        nameList[0] = "Bryan"; // assign "Bryan" to the first element
        nameList[1] = "Alice"; // assign "Alice" to the second element
        nameList[2] = "John"; // assign "John" to the third element
        for(String name: nameList) {
            System.out.println("Name: " + name); // print out the name
        }

        // python lists vs java arrays
        // java arrays have a set size when created, lists are flexible
        // python lists have a bunch of cool methods, java arrays are more basic

    }
}