package org.example;

import java.util.Arrays;

public class MinMaxFinder {
    public static passObject findMinMax(int[] array1) {
        int[] returnedArr = new int[2];
        Arrays.sort(array1);
        returnedArr[0] = array1[0];
        returnedArr[1] = array1[array1.length - 1];
        /*
        return returnedArr;         //Use this return statement for testing first 3 cases.
         */
        passObject po=new passObject(array1[0], array1.length-1);
        return po;
    }
}

class passObject{
    int min, max;
    public passObject(int min, int max){
        this.min=min;
        this.max=max;
    }
}