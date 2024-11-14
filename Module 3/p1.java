class Employee // super class
{
    float salary = 40000;
    int inc = 10;
}
class programmer extends Employee // sub class
{
    int bonus = 1000;
    int inc = 15;
}
public class p1 //  main class hai
{
    // public static void main(String[] args) {
        public static void main(String[] args) {
            programmer p = new programmer();
            System.out.println("programmer salary is : "+ p.salary);
            System.out.println("Bonus of programmer is "+p.bonus);
            System.out.println("the inc is "+ p.inc);
        }
}
