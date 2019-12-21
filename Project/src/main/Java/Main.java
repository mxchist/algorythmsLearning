import java.util.Random;
import java.util.Arrays;

public class Main {

    static void deleteElement(int[] array, int position) {
        for (int i = position; i < array.length; i++) {
            array[i] = array[++i];
        }
    }

    static void addElement (int[] array, int position, int element) {
        for (int i = array.length- 1; i > position; i--) {
            array[i] = array[--i];
        }
        array[position] = element;
    }

    static int searchElement(int[] array, int element) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                result = i;
                break;
            }
        }
        return result ;
    }

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
