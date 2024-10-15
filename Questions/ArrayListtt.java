import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListtt {
    public static void main(String[] args) {
        ArrayList<Integer> main = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7,8)); //  adding the elem in the decleration it-self //  need to import Array for this
        main.add(5); //  adding the elem at the last !
        main.set(1,100); //  setting the element of the index .set(index,value)
        main.remove(1); // remove the elem from the index 
        main.remove(Integer.valueOf(8)); // removes the value 8 not the index of 8
        System.out.println((main));
        ArrayList<String> main2;
        main2 = new ArrayList<>(Arrays.asList("Hello", "not hello")); //  assign values like this only 
        System.out.println(main2);
    }
}
