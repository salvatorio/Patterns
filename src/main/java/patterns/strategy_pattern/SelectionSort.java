package patterns.strategy_pattern;

import java.util.Arrays;

/**
 * Created on 27. 05. 16.
 */

public class SelectionSort implements Sorting {

    @Override
    public void sort(int[] array) {
        System.out.println("Selection sorting");
        System.out.println("Array before sorting: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]){
                    minIdx = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIdx];
            array[minIdx] = temp;
        }
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}

