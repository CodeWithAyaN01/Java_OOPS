public class prg5
{
    public static void main(String[] args) {
        
        String str = "Hello Java Program";

        System.out.println("Character at index 7: "+ str.charAt(7));

        System.out.println("Character at index 7 and 11 : "+ str.substring(7,11));

        String str1 = "java";
        String str2 = "JAVA";

        System.out.println("Compare using .equals(): " + str1.equals(str2));

        System.out.println("Compare using .equals() Ignore Cases: " + str1.equalsIgnoreCase(str2));

        System.out.println("Compare : "+ str1.compareTo("Java Script"));

        System.out.println("Index of Java: "+ str.indexOf("Java"));

        System.out.println("Last index: "+ str.lastIndexOf("a"));

        System.out.println("Comtains : "+ str.contains("Program"));

        System.out.println("Str uppercase: " + str.toUpperCase());

        System.out.println("Str to lower Case: "+ str.toLowerCase());

        System.out.println("replacing: "+ str.replace("Java" , "Python"));

        System.out.println("Trim space " + "     trim String ".trim());


    }
}