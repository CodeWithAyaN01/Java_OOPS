import java.util.ArrayList;
class user{
    int age;
    String name;
    int id;

    user (int age, String name, int id){
        this.age = age;
        this.name = name;
        this.id = id;
    }
    void display()
    {
        System.out.println("Name: " + name + ", Age: " + age + ", ID: " + id);
    }
}

public class prg2
{
    public static void main(String[] args) {
        
        ArrayList<user> person = new ArrayList<user>();

        person.add(new user(20,"ayan",001));
        person.add(new user(21,"sayan",002));
        person.add(new user(30,"umesh", 003));

        System.out.println("The user details are: ");
        for (user item : person)
        {
           item.display();
        }

    }
}

