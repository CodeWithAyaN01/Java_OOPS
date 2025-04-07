import java.util.*;

class TensPlaceComparator implements Comparator<Integer>
{
    @Override
    public int compare (Integer n1, Integer n2)
    {  
        int tensplace1 = (n1/10)%10;
        int tensplace2 = (n2/10)%10;

        if (tensplace1 != tensplace2)
        {
            return Integer.compare(tensplace1, tensplace2);
        }
        else
        {
            return n1.compareTo(n2);
        }
    }
}

public class prg3
{
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:  ");
        int c = sc.nextInt();
        System.out.println("Enter the elems: ");
        for (int i = 0 ; i< c;)
        {
            int w = sc.nextInt();
            if (w%5 == 0 && w%2 == 0)
            {
                number.add(w);
                i++;
            }
            else
            {
                System.out.println("Enter thr no accordingly ");
            }
            
        }
        Collections.sort(number,new TensPlaceComparator());
        System.err.println("Sorted Elems : " + number);
    }
}

