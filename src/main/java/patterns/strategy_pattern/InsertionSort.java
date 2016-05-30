package patterns.strategy_pattern;

import java.util.Arrays;

/**
 * Created on 27. 05. 16.
 */

public class InsertionSort implements Sorting {

    @Override
    public void sort(int[] array) {
        System.out.println("Inserting sorting");
        System.out.println("Array before sorting: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]){

                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;

                }
            }
        }
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}

