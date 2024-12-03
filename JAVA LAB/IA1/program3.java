// package IA1;
class Empolyee
{
    private int id;
    private String name;
    private double salary;

    public Empolyee(int id , String name , double salary)
    {
        this.id =id;
        this.name = name;
        this.salary = salary;
    }
    public void incSalry(double per)
    {
        double incAmt = salary * (per/100);
        salary += incAmt;
        System.out.println("Increased Salary is "+salary);
        System.out.println();
    }
    public void display()
    {
       System.out.println("Salary is : "+salary);
       System.out.println("Name is : "+name);
       System.out.println("ID is : "+id);
       System.out.println();
    }
}
public class program3 {
    public static void main(String[] args) {
        Empolyee emp1 = new Empolyee(1001,"Ayan",1000);
        emp1.display();
        emp1.incSalry(20);
        emp1.display();
    }
}
