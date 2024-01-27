package Arrays;

public class OrderedArray implements Array {

    protected Integer[] array;
    protected int elemCount;

    public OrderedArray(int maxCapacity) {
        this.array = new Integer[maxCapacity];
        this.elemCount = 0;
    }


    @Override
    public void insert(int value) {
        if (elemCount != array.length) {
            int insertIndex = find(value);
            if (insertIndex != -1) {
                System.out.println("No doubles");
            } else {
                insertIndex = findInsertIndex(value);
                array[insertIndex] = value;
                elemCount++;
            }
            return;
        }
        System.out.println("Array is full");
    }

    @Override
    public int find(int value) {
        System.out.println("Finding value: " + value);
        int lowBound = 0;
        int upBound = elemCount - 1;
        while (lowBound <= upBound) {
            int currIn = (lowBound + upBound) / 2;
            if (value == array[currIn]) {
                return currIn;
            } else if (value > array[currIn]) {
                lowBound = currIn + 1;
            } else {
                upBound = currIn - 1;
            }
        }
        System.out.println("Value: " + value + " not found");
        return -1;
    }

    private int findInsertIndex(int value) {
        System.out.println("Finding index to insert...");
        if (elemCount == 0 || (elemCount == 1 && array[elemCount - 1] < value)) {
            return elemCount;
        }

        int lowBound = 0;
        int upBound = elemCount - 1;
        while ((upBound - lowBound) != 1) {
            int currIn = (lowBound + upBound) / 2;
            if (value > array[currIn]) {
                lowBound = currIn + 1;
            } else {
                upBound = currIn - 1;
            }
        }
        forwardShift(upBound);
        return upBound;
    }

    @Override
    public void delete(int value) {
        System.out.println("deleting value " + value);
        int indexToDel = find(value);
        if (indexToDel == -1) {
            System.out.println("Not found to del");
        } else {
            array[indexToDel] = null;
            backShift(indexToDel);
        }
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
