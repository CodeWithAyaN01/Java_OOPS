import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class removeDupilcateElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 3, 3, 5, 6};

        Set<Integer> newSet = new TreeSet<Integer>();

        for (int item : nums)
        {
            newSet.add(item);
        }
        System.out.println(newSet);

    }
}