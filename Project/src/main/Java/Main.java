public class Main {

    public static void main (String ... args) {
        int arrayLength = 1000000;
        MyArr array1 = new MyArr(arrayLength);
        MyArr array2 = new MyArr(arrayLength);
        MyArr array3 = new MyArr(arrayLength);

        array1.showArray();
        array1.bubbleSort();
        array1.showArray();
    }
}
