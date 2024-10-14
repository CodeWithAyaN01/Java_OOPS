
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListtt {
    public static void main(String[] args) {
        ArrayList<Integer> main = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7,8)); //  adding the elem in the decleration it-self //  need to import Array for this
        main.add(5);
        main.set(1,100);
        main.remove(1);
        System.out.println((main));

    }
}
