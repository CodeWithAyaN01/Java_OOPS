public class mian
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        for (int i = 0 ; i < 100000 ; i++)
        {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();

        long time = end - start;
        time = time/1000;
        System.out.println(time);
    }
}