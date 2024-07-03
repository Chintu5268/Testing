import java.util.ArrayList;

public class ArrayListCloneExample {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");

        // Clone the ArrayList
        ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

        // Display the original and cloned lists
        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List: " + clonedList);

        // Modify the cloned list
        clonedList.add("Date");

        // Display the original and cloned lists after modification
        System.out.println("Original List after modifying clone: " + originalList);
        System.out.println("Cloned List after modification: " + clonedList);
    }
}
