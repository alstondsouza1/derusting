public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] myArray = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    myArray[0] = "Apple";
    myArray[1] = "Banana";
    myArray[2] = "Cherry";
    myArray[3] = "Date";

    // Get the value of the array at index 2
    System.out.println("Value at index 2: " + myArray[2]);

    // Get the length of the array
    System.out.println("Length of the array: " + myArray.length);

    // Iterate over the array using a traditional for loop and print out each item
    System.out.println("Traditional for-loop");
    for (int i = 0; i < myArray.length; i++) {
      System.out.println(myArray[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    System.out.println("For-each loop:");
    for (String item : myArray) {
      System.out.println(item);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
