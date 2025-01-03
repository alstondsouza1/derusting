import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    List<String> myList = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    myList.add("Apple");
    myList.add("Banana");
    myList.add("Cherry");

    // Print the element at index 1
    System.out.println("Element at index 1: " + myList.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    myList.set(1, "Blueberry");

    // Insert a new element at index 0 (the length of the list will change)
    myList.add(0, "Apricot");

    // Check whether the list contains a certain string
    System.out.println("Contains 'Cherry': " + myList.contains("Cherry"));

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    System.out.println("Traditional for-loop:");
    for (int i = 0; i < myList.size(); i++) {
      System.out.println("Index " + i + ": " + myList.get(i));
    }

    // Sort the list using the Collections library
    Collections.sort(myList);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    System.out.println("For-each loop after sorting:");
    for (String item : myList) {
      System.out.println(item);
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}