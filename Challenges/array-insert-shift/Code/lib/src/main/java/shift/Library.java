/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package shift;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        System.out.println("testBig");
        int[] a={42,8,15,23,42};//[42,8,15,23,42], 16
        insertShiftArray(a,16);
    }
    public static int[] insertShiftArray(int[] arr , int newValue) {
        int[] tempArr = new int[arr.length + 1];
        int shiftIndex = arr.length / 2;

        for (int i=0;i<arr.length;i++){
            tempArr[i]=arr[i];
            if(i%2==1) {
                tempArr[shiftIndex] = newValue;
            }
            if(i%2==0) {
                tempArr[shiftIndex] = newValue;
            }}
        for(int i = shiftIndex + 1; i < arr.length+1; i++) {
            tempArr[i] = arr[i - 1];
            System.out.println(Arrays.toString(tempArr));



        }   return tempArr;

    }
}