

class Areaofshape
{
    // for circle
    float area(float radii)
    {
        return radii*radii;
    }
    // for triangle
    double area(double  base , double  height)
    {
        return 0.5 * base * height;
    }
    // for rectangle
    int area(int length , int breadth)
    {
        return length * breadth;
    }
}
public class classEx
{
    public static void main(String[] args) {
        Areaofshape A = new Areaofshape();

        A.area(0.56);

    }
}