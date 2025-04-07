
public class prg4
{
    public static void main(String[] args) {
        
        String str2 = new String("World");
        System.out.println("Using new Keyword"+str2);


        char[] charArray = {'J' , 'a' , 'v' , 'a'};
        String str3 = new String(charArray);
        System.out.println("Char Array : "+ str3);


        byte[] byteArray = {72, 101, 108, 108, 111};
        String str4 = new String(byteArray);
        System.out.println("Byte Array : "+str4);


        String str5 = new String(charArray,1,2);
        System.out.println("String is using offset: " + str5);


        String str6 = new String(byteArray,0,3);
        System.out.println("BY byteArray is : "+ str6);


        String str7 = new String(str2);
        System.out.println("Str7 : "+ str7);

        System.out.println("length of str4 is: "+str4.length());
    }
}
