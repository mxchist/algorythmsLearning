import java.lang.System;
import java.util.ArrayList;

public class Main {
    static long t;
    static ArrayList<Float> al = new ArrayList();

    static void saveTime () {
        al.add( (System.currentTimeMillis() - t) / 1000f);
        t= System.currentTimeMillis();
    }

    public static void main (String ... args) {
        int arrayLength = 1000000;
        MyArr array1 = new MyArr(arrayLength);
        MyArr array2 = new MyArr(arrayLength);
        MyArr array3 = new MyArr(arrayLength);

        t= System.currentTimeMillis();

        array1.showArray();
        array1.sortBubble();
        saveTime();
        if (array1.isSorted()) {
            array1.showArray();
        }
        else return;

        t= System.currentTimeMillis();
        array2.showArray();
        array2.sortSelect();
        saveTime();
        if (array2.isSorted()) {
            array2.showArray();
        }
        else return;

        t= System.currentTimeMillis();
        array3.showArray();
        array3.sortInsert();
        saveTime();
        if (array3.isSorted()) {
            array3.showArray();
        }
        else return;


        for (float t1 : al) {
            System.out.printf( "Время сортировки: %6.3f секунд %n", t1);
        }
    }
}
