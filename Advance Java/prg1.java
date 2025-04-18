import java.util.ArrayList;
import java.util.Collections;
public class prg1 {
    public static void main(String[] args) {
        
        ArrayList<String> List = new ArrayList<String>();
        
        List.add("Banan");
        List.add("Apple");
        List.add("Mango");
        List.add("Cool");

        System.out.println("Printed List is = " + List);
        List.remove("Cool");
        System.out.println("ModifiedList is = " + List);

        Collections.sort(List);

        System.out.println("Sorted List is = " + List);

        Object[] array = List.toArray();

        System.out.println("Array elements is: ");

        for (Object item : array)
        {
            System.out.println(item);
        }



    }
}