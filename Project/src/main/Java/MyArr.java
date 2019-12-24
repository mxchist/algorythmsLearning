import java.util.Random;

public class MyArr {
    private int[] array;
    private int size;
    private Random rand = new Random();

    public MyArr(int size) {
        this.size = size;
        array = new int [size];

        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt();
        }

    }

    void deleteElement(int position) {
        for (int i = position; i < this.array.length; i++) {
            int lastElementPosition = array.length -1;
            array[i] = array[++i];
            array[lastElementPosition] = 0;
        }
    }

    void addElement (int position, int element) {
        for (int i = array.length- 1; i > position; i--) {
            array[i] = array[--i];
        }
        array[position] = element;
    }

    int searchElement(int element) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                result = i;
                break;
            }
        }
        return result ;
    }

    void showArray() {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%15d", array[i]);
            if ( (i +1) % 10 == 0) System.out.println();
        }

        for (int i = 0; i < 130; i++) {System.out.print("="); }
        System.out.print("\n");
    }

    void change (int x, int y) {
        int m = array[x];
        array[x] = array[y];
        array[y] = m;
    }

    void bubbleSort () {
        for (int n = 0; n < array.length; n++) {
            for (int i = 0, j = 1; j < array.length; i++, j++) {
                if (array[i] > array[j]) {
                    change(i, j);
                }
            }
        }
    }



}
