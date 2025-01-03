import java.util.*;
public class LInkedListToArray {

    public static <T> Object[] convertLinkedListToArray(LinkedList <T> LinkedList){

        Object[] array = LinkedList.toArray();
        return array;
    }
    public static void main(String[] args) {
        
        LinkedList <String>
            LinkedList = new LinkedList<String>();

            LinkedList.add("I");
            LinkedList.add("n");
            LinkedList.add("d");
            LinkedList.add("e");
            LinkedList.add("x");

            System.out.println("Linked List " + LinkedList);

            Object[] objArray = convertLinkedListToArray(LinkedList);

            String[] array = Arrays.copyOf(objArray, objArray.length, String[].class);

            System.out.println("Array: " +Arrays.toString(array));           
            
            

    }
}
