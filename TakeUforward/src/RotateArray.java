import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,5};
        int temp;
        temp = nums[nums.length - 1];
        nums[nums.length -1] = nums[0];
        for(int i = 0 ;i < nums.length-2 ; i++)
        {
            nums[i] = nums[i+1];
        }
        nums[nums.length-2] = temp;
//        System.out.println(Arrays.toString(nums));
    }

}
