package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MinMaxFinderTest{
    MinMaxFinder m=new MinMaxFinder();

    /*          Use the commented return statement for testing these cases.
    @Test
    public void testCase1(){
        assertArrayEquals(new int[]{3,112},m.findMinMax(new int[]{21,30,51,112,3,7}));
    }

    @Test
    public void testCase2(){
        assertArrayEquals(new int[]{2,61}, m.findMinMax(new int[]{12,15,47,2,61,30}));
    }

    @Test
    public void testCase3(){
        assertArrayEquals(new int[]{0,12}, m.findMinMax(new int[]{5,8,12,6,0,1}));
    }
    */

    @Test
    public void testCase4(){
        int[] postarray={12,5,31,4,71,9};
        passObject po1 = m.findMinMax(postarray);
        passObject po2 = m.findMinMax(postarray);
        assertEquals(po1.max,po2.max);
    }
}