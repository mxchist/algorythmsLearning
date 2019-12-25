import java.lang.System;
import java.util.ArrayList;

public class Main {
    static long t;
    static ArrayList<Long> al = new ArrayList();

    static void saveTime () {
        al.add(System.currentTimeMillis() - t);
        t= System.currentTimeMillis();
    }

    public static void main (String ... args) {
        int arrayLength = 1000000;
        MyArr array1 = new MyArr(arrayLength);
        MyArr array2 = new MyArr(arrayLength);
        MyArr array3 = new MyArr(arrayLength);

        t= System.currentTimeMillis();

        array1.showArray();
        array1.bubbleSort();
        saveTime();
        if (array1.isSorted()) {
            array1.showArray();
        }
        else return;

        t= System.currentTimeMillis();
        array2.sortSelect();
        saveTime();
        if (array2.isSorted()) {
            array2.showArray();
        }
        else return;



        for (long t1 : al) {
            System.out.print(t1);
        }
    }
}
