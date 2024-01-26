package Arrays;

public class SimpleArrayNoDoubles extends SimpleArray {

    public SimpleArrayNoDoubles(int maxCapacity) {
        super(maxCapacity);
    }

    @Override
    public void insert(int value) {
        if (elemCount == array.length) {
            System.out.println("Array is full");
        } else if (find(value) != -1) {
            System.out.println("No doubles");
        } else {
            array[elemCount] = value;
            elemCount++;
        }
    }
}
