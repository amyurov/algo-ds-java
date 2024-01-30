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
        Integer[] arr = new Integer[]{0, 1, 2, 4, 5, 6, 7, 9, 0, 0};

        // BiSearch
        int value = 8;
        int lowBound = 0;
        int upBound = arr.length - 1;
        int steps = 1;
        int currIn = 0;
        while (lowBound <= upBound) {
            currIn = (upBound + lowBound) / 2;
            if (value == arr[currIn]) {
                System.out.printf("index:%d, steps:%d %n", currIn, steps);
                break;
            } else if (value > arr[currIn]) {
                lowBound = currIn + 1;
                steps++;
            } else {
                upBound = currIn - 1;
                steps++;
            }
        }
        System.out.println("nearest: " + currIn);
        System.out.printf("index:not found, steps:%d %n", steps);
    }
}
