package Sorting;

import Arrays.SimpleArrayNoDoubles;

public class BubbleSortArray extends SimpleArrayNoDoubles {
    public BubbleSortArray(int maxCapacity) {
        super(maxCapacity);
    }

    public void bubbleSort() {
        for (int i = elemCount - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                    print();
                }
            }
        }
    }

    protected void swap(int in1, int in2) {
        Integer i = array[in1];
        array[in1] = array[in2];
        array[in2] = i;
    }
}


