import java.util.*;
public class RotateKarray {
    public static void main(String[] args) {
        int k = 3;
        ArrayList<Integer> Array = new ArrayList<>();
        int[] nums = {1,2,3,4,5,6};
        int[] tempArray = new int[k];
        for(int i=0; i<k; i++){
            tempArray[i] = nums[i];
        }
//        System.out.println(Arrays.toString(tempArray));
        for(int i=0; i<k; i++){
            for(int j =0; j<nums.length - 1; j++)
            {
                nums[j] = nums[j+1];
            }
        }
        for (int i = 0; i < k; i++) {
            nums[nums.length - k + i] = tempArray[i];
        }




        System.out.println(Arrays.toString(nums));
    }
}
