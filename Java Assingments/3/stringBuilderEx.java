public class stringBuilderEx {

    public static void main(String[] args) {

        String s = "Java String pool refers to a collection of Strings which are stored in heap memory";
        System.out.println("Lowercase: "+s.toLowerCase());
        System.out.println("uppercase: "+s.toUpperCase());

        System.out.println("'a' replaced with '$: "+s.replace('a','$'));
        System.out.println("Contains 'collection':  "+s.contains("collection"));
        String s1= "java string pool refers to a collection of strings which are stored in heap memory";
        System.out.println("equal or not:  "+s.equals(s1));
        System.out.println("equal or not:  "+s.equalsIgnoreCase(s1));
    }
}
