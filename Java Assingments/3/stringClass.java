public class stringClass {
    public static void main(String[] args) {
        String s = "Hello World";
        String s1="Hello, ";
        String s2="How are you?";
        String s3="Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println("length of the string is:"+s.length());
        System.out.println(s1+s2);
        System.out.println(s3.toLowerCase());
        System.out.println(s3.toUpperCase());
        System.out.println(s3.replace('a','$'));
        System.out.println(s3.contains("collection"));
        System.out.println(s3.compareTo("java string pool refers to collection of strings which are stored in heap memory"));
    }
}
