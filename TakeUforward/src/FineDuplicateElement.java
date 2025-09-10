import java.util.Arrays;
public class FineDuplicateElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        boolean valid = true;
        Arrays.sort(nums);
        int idx = 0;
        while (valid == true)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(i == nums[i]){
                    valid = true;
                    idx++;
                }
                else{
                    valid = false;
                    break;
                }
            }
        }
        if(idx == nums[nums.length])
            System.out.println(idx+1);
        else
            System.out.println(idx);
    }

}
