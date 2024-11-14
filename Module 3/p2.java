class Vech
{
    int speed = 10;
}
class bike extends Vech
{
    int speed;

    bike(int speed)
    {
        this.speed = speed;
    }

    public static void display()
    {
        bike BikeObj = new bike(90);

        System.out.println("Speed is " + BikeObj.speed);
        System.out.println("Parent speed is "+ super.speed);
    }

}
    public class p2
    {

        public static void main(String[] args) {
            
            display();
        }
    }
