public class code1 {

    static void print(int m,int till_num)
    {
        int total = 0;
        if (m > till_num)
        {
            return;
        }
        System.out.print("\t"+m);
        print(m+1,till_num);
    }
    public static void main(String[] args) {
        print(0,6);
    }
}
