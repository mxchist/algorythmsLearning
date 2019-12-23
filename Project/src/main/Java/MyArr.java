public class MyArr {
    private int[] array;
    private int size;

    public MyArr(int size) {
        this.size = size;
        array = new int [size];
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

}
