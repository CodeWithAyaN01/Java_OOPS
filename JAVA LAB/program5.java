
class Figure
{
    public void draw()
    {
        System.out.println("dwaring a shape ");
    }
    public void erase()
    {
        System.out.println("Erasing a shape");
    }
    
    public class Circle extends Figure
    {
        // @Override
        public void draw()
        {
            System.out.println("dwaring a circle ");
        }
        // @Override
        public void erase()
        {
            System.out.println("Erasing a Circle");
        }
    }
    
    public class Triangle extends Figure
    {
        // @Override
        public void draw()
        {
            System.out.println("dwaring a Triangle ");
        }
        // @Override
        public void erase()
        {
            System.out.println("Erasing a Triangle");
        }
    }
    
    public class square extends Figure
    {
        // @Override
        public void draw()
        {
            System.out.println("dwaring a square ");
        }
        // @Override
        public void erase()
        {
            System.out.println("Erasing a square");
        }
    }
}
public class program5
{
    public static void main(String[] args) {
        Figure insFig = new Figure();
        Figure[] fig = new Figure[3];
        fig[0] = insFig.new Circle();
        fig[1] = insFig.new Triangle();
        fig[2] = insFig.new square();

        for (Figure shape : fig)
        {
            shape.draw();
            shape.erase();
            System.out.println();
        }
    }
}
