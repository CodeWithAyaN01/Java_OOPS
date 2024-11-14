class Person {
    void message() { // parent method 
        System.out.println("welcome");
    }
}

class Student16 extends Person {
    void message() { // child method 
        System.out.println("welcome to java");
    }

    void display() {
        super.message(); // Will invoke parent class message() method
        message(); // Will invoke current class message() method
    }

}
public class p4 {
    public static void main(String args[]) {
        Student16 s = new Student16();
        s.display();
    }
    
}
