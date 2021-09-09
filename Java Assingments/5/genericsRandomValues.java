package GenericsPKG;

class GenericTest<T,K>{
    private T key;
    private K value;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public K getValue() {
        return value;
    }

    public void setValue(K value) {
        this.value = value;
    }
}

public class genericsRandomValues {
    public static <T> void main(String[] args) {

        int key[] = new int[]{1,2,3,4,5,6,7,8,9,0};
        double value[] = new double[]{0,9,8,7,6,5,4,3,2,1};
        GenericTest <int[], double[]> GT = new GenericTest<>();
        GT.setKey(key);
        GT.setValue(value);

        for (int k:GT.getKey())
         System.out.println(k);

        for (double k:GT.getValue())
            System.out.println(k);
    }
}
