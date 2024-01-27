import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.stream.Collectors;

public class BinarySearch {
    public static void main(String[] args) {

        // Init ordered array
        Integer[] ordArray = new Integer[150];
        Random random = new Random();
        for (int i = 0; i < ordArray.length; i++) {
            ordArray[i] = random.nextInt(998) + 1;
        }
        int[] array = Arrays.stream(ordArray).mapToInt(o -> o).distinct().sorted().toArray();
        System.out.println(Arrays.toString(array));
        Integer[] arr = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33};

        // BiSearch
        int value = 8;
        int lowBound = 0;
        int upBound = array.length - 1;
        int steps = 1;
        while (lowBound <= upBound) {
            int currIn = (upBound + lowBound) / 2;
            if (value == array[currIn]) {
                System.out.printf("index:%d, steps:%d %n", currIn, steps);
                break;
            } else if (value > array[currIn]) {
                lowBound = currIn + 1;
                steps++;
            } else {
                upBound = currIn - 1;
                steps++;
            }
        }
        System.out.printf("index:not found, steps:%d %n", steps);
    }
}
