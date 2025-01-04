import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String myString = "HelloWorld";

    // Find the length of the string
    System.out.println("Length of the string: " + myString.length());

    // Concatenate (add) two strings together and reassign the result
    myString += " Alston";
    System.out.println("Concatenated string: " + myString);

    // Find the value of the character at index 3
    System.out.println("Character at index 3: " + myString.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println("Contains 'World': " + myString.contains("World"));

    // Iterate over the characters of the string, printing each one on a separate line
    for (char c : myString.toCharArray()) {
      System.out.println(c);
    }

    // Create an ArrayList of Strings and assign it to a variable
    List<String> stringList = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    stringList.add("Apple");
    stringList.add("Banana");
    stringList.add("Cherry");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedString = String.join(", ", stringList);
    System.out.println(joinedString);

    // Check whether two strings are equal
    String anotherString = "Hello";
    System.out.println(myString.equals(anotherString));

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
