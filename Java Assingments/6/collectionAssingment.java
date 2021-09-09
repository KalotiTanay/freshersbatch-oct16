package myCollectionPKG;

import java.util.*;

class contact{
    long phnumber;
    String name;
    String email;
    enum gender{
        male,female;
    }
    gender g1;

    public contact(long phnumber, String name, gender g1) {
        this.phnumber = phnumber;
        this.name = name;
        this.g1 = g1;
    }

    public long getPhnumber() {
        return phnumber;
    }

    public String toString(){
        return "Contact: " + this.name +" phone no: "+this.getPhnumber();
    }
}
public class collectionAssingment {

    public static void main(String[] args) {
        long mnumber = 987660;
        TreeMap<Long,contact> TreeMap1 = new TreeMap<>(Collections.reverseOrder());
        contact[] contacts=new contact[10];
        long j = 80;

        TreeMap1.put(10L,new contact(987654321,"rahul", contact.gender.male));
        TreeMap1.put(20L,new contact(987637342,"tanishka", contact.gender.female));

        //Printing TreeMap

        System.out.println(TreeMap1.keySet());
        System.out.println(TreeMap1.values());
        System.out.println(TreeMap1);

        Iterator it = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }
}
