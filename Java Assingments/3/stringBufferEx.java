public class stringBufferEx {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("StringBuffer");

        System.out.println("string:  "+sb);
        System.out.println("Using append function: "+sb.append("is a peer class of String."));
        System.out.println("Using append function again: "+sb.append("that provides much of"));
        System.out.println("Using append function again: "+sb.append("the functionality of string."));

        StringBuffer s1 = new StringBuffer("it is used to at the specific position.");
        System.out.println("string:  "+s1);
        System.out.println("Using  insert function: "+s1.insert(13,"insert text "));

        StringBuffer s2 = new StringBuffer("this method returns reversed string");
        System.out.println("Using revers function: "+s2.reverse());
    }
}
