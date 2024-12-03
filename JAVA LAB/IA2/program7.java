// package IA2;
// Resizable interface

interface Resizable{
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable{
    // variables
    private int width;
    private int height;

    // Construct
    public Rectangle(int width , int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }

    @Override
    public void resizeWidth(int width)
    {
        this.width = width;
    }
    @Override
    public void resizeHeight(int height)
    {
        this.height = height;
    }
}
public class program7{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,30);
        // checking values
        System.out.printf("Original Width and height is %d %d",r.getWidth(),r.getHeight());
        // Resizing
        r.resizeHeight(5);
        r.resizeWidth(7);
        System.out.println();
        System.out.printf("new Width and height is %d %d",r.getWidth(),r.getHeight());

    }
}

