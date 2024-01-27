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
        int[] array = Arrays.stream(ordArray).mapToInt(o -> (Integer)o).distinct().sorted().toArray();
        System.out.println(Arrays.toString(array));




    }
}
