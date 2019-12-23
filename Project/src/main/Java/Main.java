import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main (String ... args) {
        int arrayLength = 1000000;
        int[] array1 = new int[arrayLength];
        int[] array2 = new int[arrayLength];
        int[] array3 = new int[arrayLength];
        Random rand = new Random();

        for (int i = 0; i < arrayLength; i++) {
            array1[i] = rand.nextInt();
            array2[i] = rand.nextInt();
            array3[i] = rand.nextInt();
        }

    }
}
