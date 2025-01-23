
/* 

class test
{
    int a,b;
    test(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    void Swap(int a , int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}
public class CallByValue{
    public static void main(String[] args) {
        int i = 10;int  j = 20;
        test ob = new test(i,j);
        System.out.println("the Numbers is : "+ i + j);
        ob.Swap(i,j);
        System.out.println("the Numbers is : "+ i + j);
        

    }
}

*/
// call by reference

class test
{
    int a,b;
    test(int a,int b)
    {
        this.a = a;
        this.b = b;
    }
    void Swap(test obj) //object as parameter
    {
        int temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;
    }
}
public class CallByValue{
    public static void main(String[] args) {
        test ob = new test(10,20);
        System.out.println("the Numbers is : "+ob.a+ob.b);
        ob.Swap(ob);
        System.out.println("the Numbers is : "+ob.a+ ob.b);
        

    }
}


