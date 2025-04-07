
public class prg6
{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println("Length is :" + sb.length());
        
        System.out.println("capacity is :" + sb.capacity());

        sb.setLength(10);

        System.out.println("Set length to 10: "+sb);

        sb.delete(5,10);

        System.out.println("Delete From index 5 to 10"+ sb);

        sb.reverse();

        System.out.println("Reverse the Sb : "+ sb);

        sb.append("good bye");

        System.out.println("New Sb:"+sb);

        sb.insert(6,"hello");

        System.out.println("insert hello at 6:"+sb);

        sb.deleteCharAt(5);

        System.out.println("Deleted cg=hat : "+ sb);

        sb.replace(0, 3, "hii");

        System.out.println("---."+ sb);


    }
}