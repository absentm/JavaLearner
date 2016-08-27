package test03;

import java.util.Arrays;

/**
 * test03.ArraysTest
 * Created by AbsentM on 16-8-9.
 */
public class ArraysTest {
    /**
     * Arrays: equals, sort, copyOf, copyOfRange, fill, binarySearch, toString
     */
    public static void arraysTest() {
        int[] arr1 = new int[]{2, 3, 1, 7, 8, 6, 4, 0, 9};
        int[] arr2 = new int[]{3, 5, 7, 9};

        System.out.println("arr1's content: ");
        for (int item : arr1) {
            System.out.println("item = " + item);
        }

        System.out.println("arr1 == arr2 ?: " + Arrays.equals(arr1, arr2));
        Arrays.sort(arr1);
        System.out.println("Arrays.sort(arr1) =  " + Arrays.toString(arr1));

        int[] arr3 = Arrays.copyOf(arr2, 3);
        System.out.println("arr3 =  " + Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOfRange(arr1, 1, 4);
        System.out.println("arr4 =  " + Arrays.toString(arr4));

        int[] arr5 = new int[6];
        Arrays.fill(arr5, 10);
        System.out.println("arr5 =  " + Arrays.toString(arr5));
        Arrays.fill(arr5, 1, 4, 8);
        System.out.println("arr5 =  " + Arrays.toString(arr5));

        System.out.println("7's position in arr1 =  " + Arrays.binarySearch(arr1, 7));

        System.out.println("arr1's length: " + arr1.length);
    }
}
