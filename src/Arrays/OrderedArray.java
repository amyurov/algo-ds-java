package Arrays;

public class OrderedArray implements Array<Integer> {

    protected Integer[] array;
    protected int elemCount;

    public OrderedArray(int maxCapacity) {
        this.array = new Integer[maxCapacity];
        this.elemCount = 0;
    }


    @Override
    public void insert(Integer value) {
        boolean isFull = elemCount == array.length;
        boolean isEmpty = elemCount == 0;
        if (!isFull) {
            if (isEmpty) {
                array[0] = value;
                elemCount++;
                return;
            }

            int insertIndex = biSearch(value);
            if (array[insertIndex].equals(value)) {
                System.out.println("doubles");
                return;
            }

            if ((value > array[insertIndex]) && (insertIndex == elemCount - 1)) {
                array[elemCount] = value;
            } else if (value < array[insertIndex]) {
                forwardShift(insertIndex);
                array[insertIndex] = value;
            } else {
                forwardShift(insertIndex + 1);
                array[insertIndex + 1] = value;
            }
            elemCount++;
            return;
        }
        System.out.println("Array is full");
    }

    @Override
    public Integer find(Integer value) {
        int mostLikelyIndex = biSearch(value);
        return array[mostLikelyIndex].equals(value) ? mostLikelyIndex : null;
    }

    @Override
    public void delete(Integer value) {
        Integer indexToDel = find(value);
        if (indexToDel == null) {
            System.out.println("Not found to del");
        } else {
            array[indexToDel] = null;
            backShift(indexToDel);
            elemCount--;
        }
    }

    public int biSearch(Integer value) {
        int low = 0;
        int high = elemCount - 1;
        int currIn = 0;
        while (low != high) {
            currIn = (low + high) / 2;
            if (value.equals(array[currIn]) || currIn + 1 > elemCount || currIn - 1 < 0) {
                return currIn;
            } else if (value > array[currIn]) {
                low = ++currIn;
            } else {
                high = --currIn;
            }
        }
        return currIn;
    }

    protected void forwardShift(int insertIndex) {
        for (int i = elemCount; i > insertIndex; i--) {
            array[i] = array[i - 1];
            array[i - 1] = null;
        }
    }

    protected void backShift(int indexToFill) {
        for (int i = indexToFill; i < elemCount - 1; i++) {
            array[i] = array[i + 1];
            array[i + 1] = null;
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-5d", array[i]);
        }
        System.out.println();
    }

}
