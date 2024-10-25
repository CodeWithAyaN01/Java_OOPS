public class main1 {

    static void print(int m)
    {
        if (m > 5)
        {
            return;
        }
        System.out.print("\t"+m);
        print(m+1);
    }
    
    public static void main(String[] args) {
        print(0);
    }
}
