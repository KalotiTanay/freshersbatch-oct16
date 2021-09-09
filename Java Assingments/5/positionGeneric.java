package GenericsPKG;

public class positionGeneric {
    public static <E> E[] swapArr(E[] arr, int i1, int i2){

    E temp = arr[i1];
    arr[i1]=arr[i2];
    arr[i2]=temp;

    return arr;
    }
    public static void main(String[] args) {

        Integer[] intArray = new Integer[]{2,3,5,4,1,6,9,7,8};

        for (int i: swapArr(intArray,0,3))
            System.out.println(i);
    }
}
