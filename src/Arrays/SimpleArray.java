package Arrays;

public class SimpleArray implements Array<Integer> {
    protected Integer[] array;
    protected int elemCount;

    public SimpleArray(int maxCapacity) {
        this.array = new Integer[maxCapacity];
        this.elemCount = 0;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-5d", array[i]);
        }
        System.out.println();
    }

    // Insert
    public void insert(Integer value) {
        if (elemCount == array.length) {
            System.out.println("Array is full");
        } else {
            array[elemCount] = value;
            elemCount++;
        }
    }

    // Find
    public Integer find(Integer value) {
        int result = linearSearch(value);
        if (result == -1) {
            return null;
        }
        return result;
    }

    // Delete
    public void delete(Integer value) {
        int indexToDel = linearSearch(value);
        if (indexToDel == -1) {
            System.out.println("not found. nothing to del");
            return;
        }
        array[indexToDel] = null;
        if (indexToDel != elemCount - 1) {
            backShift(indexToDel);
        }
        elemCount--;
    }

    protected void backShift(int indexToFill) {
        for (int i = indexToFill; i < elemCount - 1; i++) {
            array[i] = array[i + 1];
            array[i + 1] = null;
        }
    }

    protected int linearSearch(Integer value) {
        for (int i = 0; i < elemCount; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public Integer removeMax() {
        if (elemCount == 0) {
            return null;
        }
        int currVal = array[0];
        for (int i = 1; i < elemCount; i++) {
            if (currVal < array[i]) {
                currVal = array[i];
            }
        }
        delete(currVal);
        return currVal;
    }
}