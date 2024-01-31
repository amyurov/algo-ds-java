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
            if (checkBound(value) != -1) {
                int insertIndex = checkBound(value);
                if (insertIndex == 0) {
                    forwardShift(0);
                    array[0] = value;
                    elemCount++;
                    return;
                } else {
                    array[insertIndex] =  value;
                }
            }

            int insertIndex = biSearch(value);
            if (array[insertIndex].equals(value)) {
                System.out.println("doubles");
                return;
            } else if (value < array[insertIndex]) {
                forwardShift(insertIndex - 1);
                array[insertIndex - 1] = value;
                elemCount++;
            } else {
                forwardShift(insertIndex + 1);
                array[insertIndex + 1] = value;
                elemCount++;
            }
        }
        System.out.println("Array is full");
    }

    @Override
    public int find(Integer value) {
        System.out.println("Finding value: " + value);
        int mostLikelyIndex = biSearch(value);
        return array[mostLikelyIndex].equals(value) ? mostLikelyIndex : -1;
    }

    @Override
    public void delete(Integer value) {
        System.out.println("deleting value " + value);
        int indexToDel = find(value);
        if (indexToDel == -1) {
            System.out.println("Not found to del");
        } else {
            array[indexToDel] = null;
            backShift(indexToDel);
        }
    }

    private int biSearch(Integer value) {
        int low = 0;
        int high = elemCount - 1;
        int currIn = 0;
        while (low != high) {
            currIn = (low + high) / 2;
            if (value.equals(array[currIn])) {
                return currIn;
            } else if (value > array[currIn]) {
                low = ++currIn;
            } else {
                high = --currIn;
            }
        }
        return currIn;
    }

    private int checkBound(Integer value) {
        if (value < array[0]) {
            return 0;
        } else if (value > array[elemCount - 1]) {
            return elemCount;
        }
        return -1;
    }

    private void forwardShift(int insertIndex) {
        System.out.println("Shifting forward to index " + insertIndex);
        for (int i = elemCount; i > insertIndex; i--) {
            array[i] = array[i - 1];
            array[i - 1] = null;
        }
    }

    protected void backShift(int indexToFill) {
        System.out.println("Shifting back to index " + indexToFill);
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
