package Arrays;

public class SimpleArray implements Array{
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

    // Get
    public int get(int index) {
        return array[index];
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
    public int find(Integer value) {
        for (int i = 0; i < elemCount; i++) {
            if (array[i] == value) {
                System.out.printf("iter:%d Found %d at index %d \n", i + 1, value, i);
                return i;
            }
        }
        System.out.printf("Can't find %d \n", value);
        return -1;
    }

    // Delete
    public void delete(Integer value) {
        if (value == null) {
            return;
        }
        System.out.println("Finding " + value + " to delete...");
        int rmIndex = find(value);
        if (rmIndex == -1) {
            System.out.println("Value for delete not found");
            return;
        }
        array[rmIndex] = null;
        System.out.println("delete status: success");
        backShift(rmIndex);
        elemCount--;
    }

    protected void backShift(int indexToFill) {
        System.out.println("Shifting back to index " + indexToFill);
        int steps = 0;
        for (int i = indexToFill; i < elemCount - 1; i++) {
            array[i] = array[i + 1];
            array[i + 1] = null;
            steps++;
        }
        System.out.printf("Shifting status: success with %d steps %n", steps);
    }

    public Integer removeMax() {
        if (elemCount == 0) {
            return null;
        }
        int currVal=array[0];
        for (int i = 1; i < elemCount; i++) {
            if (currVal < array[i]) {
                currVal = array[i];
            }
        }
        delete(currVal);
        return currVal;
    }
}