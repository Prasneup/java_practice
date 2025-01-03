import java.util.*;
public class Practice5 {
    public static <T> Object[] convertLinkedListToArray(LinkedList <T> LinkedList){

        Object[] array = LinkedList.toArray();
        return array;

    }

    public static void main(String[] args) {
         LinkedList <String>
            LinkedList = new LinkedList<String>();

            LinkedList.add("L");
            LinkedList.add("i");
            LinkedList.add("n");
            LinkedList.add("k");
            LinkedList.add("e");
            LinkedList.add("d");

            System.out.println("Linked List"+LinkedList);
            
            Object[] objArray = convertLinkedListToArray(LinkedList);

            String[] array = Arrays.copyOf(objArray, objArray.length,String[].class);

            System.out.println("Array: "+Arrays.toString(array));



    }
    
}
