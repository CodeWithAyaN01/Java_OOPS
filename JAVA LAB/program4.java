

// class mypoint{
//     int x;
//     int y;

//     public mypoint() // Default 
//     {
//         x = 0;
//         y = 0;
//     }
//     public mypoint(int x , int y) // Overloaded constructer
//     {
//         this.x = x;
//         this.y = y;
//     }

//     public void setXY(int x , int y) // methdo to set x y
//     {
//         this.x = x;
//         this.y = y;
//     }

//     public int[] getXY() // method to get x y
//     {
//         return new int[]{this.x , this.y};
//     }
    
//     @Override
//     public String toString()
//     {
//         return "My point{ X = " + x +" y = " + y + " }";
//     }

//     public double distance(int x ,int y)
//     {
//         return Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y,2));
//     }

//     public double distance(mypoint another)
//     {
//         return distance(another.x,another.y);
//     }
    
//     public double distance()
//     {
//         return distance(0,0);
//     }

// }
// public class program4
// {
//     public static void main(String[] args) {
//     mypoint p1 = new mypoint();
//     System.out.println("default pointer"+p1); //  show default constructor
//     mypoint p2 = new mypoint(3,4);
//     System.out.println("overloaded one : "+p2); // overloaded constructor
//     p1.setXY(1, 2);
//     System.out.println("point after setXY: "+p1); // setXY

//     System.out.println("distance from point 1 to (4,5) is "+p1.distance(4,5));

//     System.out.println("distance from point1 to point2: "+p1.distance(p2));

//     System.out.println("distance form origin: "+p1.distance()); // from origin
//     }
// }

class Mypoint 
{
    int x;
    int y;

    public Mypoint()
    {
        x = 0;
        y = 0;
    }

    public Mypoint(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public void SetXY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int[] GetXY(int x , int y)
    {
        return new int[]{this.x , this.y};
    }

    @Override
    public String toString()
    {
        return "Mypoint [ x = " + x + " y = " + y +" ]" ;
    }

    public double distance(int x , int y)
    {
        return Math.sqrt(Math.pow(this.x - x , 2) + Math.pow(this.y - y , 2));
    }

    public double distance(Mypoint other)
    {
        return distance(other.x , other.y);
    }

    public double distance()
    {
        return distance(0,0);
    }
}
public class program4
{
    public static void main(String[] args) {
        Mypoint p1 = new Mypoint();
        Mypoint p2 = new Mypoint(2,2);

        System.out.println("Default point1 = "+ p1);
        System.out.println("overloaded point2 = "+ p2);
        p1.SetXY(1, 1);
        System.out.println("used set method on point 1: "+p1);

        System.out.println("distance from 4,6 is "+p1.distance(4,6));

        System.out.println("distance from point 2 is : "+p1.distance(p2));

        System.out.println("distance from origin: "+p1.distance());
    
    }
}