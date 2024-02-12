package Sorting;

import Arrays.SimpleArrayNoDoubles;

<<<<<<< HEAD
=======
import java.awt.geom.Line2D;

>>>>>>> 87841f6195e6de0f56c56e8a29fea188ae6db27a
public class BubbleSortArray extends SimpleArrayNoDoubles {
    public BubbleSortArray(int maxCapacity) {
        super(maxCapacity);
    }

    public void bubbleSort() {
<<<<<<< HEAD
        for (int i = elemCount - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
=======
        for (int i = elemCount - 1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j+1);
>>>>>>> 87841f6195e6de0f56c56e8a29fea188ae6db27a
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
<<<<<<< HEAD
=======


>>>>>>> 87841f6195e6de0f56c56e8a29fea188ae6db27a
}
