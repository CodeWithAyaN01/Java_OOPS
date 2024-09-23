
public class maxinArray {
    public static void main(String[] args) {
        // ArrayList<Integer> lsit = new ArrayList<Integer>();

        // Integer[] arr = new Integer[10];
        
        Integer arr[] = {1,6,4,33,100};

        int max = 0;
        int count=0;
        for (int i = 0 ; i< arr.length ; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
                count++;
            }
        }
        // System.out.println(Array.toString(arr));\
        System.out.println(count);
        System.out.println(arr[count]);


        


    }
}
