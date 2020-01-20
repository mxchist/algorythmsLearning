import java.lang.System;

public class Main {

    private static void fillMyRoom(MyDoubleLinkedList myRoom) {
        myRoom.insertFirst( 0.24347675f, 1);
        myRoom.insertFirst( 0.08593426f, 11);
        myRoom.insertFirst( 0.019733986f, 17);
        myRoom.insertFirst( 0.0813724f, 9);
        myRoom.insertFirst( 0.2729363f, 15);
        myRoom.insertFirst( 0.12353703f, 20);
        myRoom.insertFirst( 0.28542763f, 9);
        myRoom.insertFirst( 0.23832822f, 1);
        myRoom.insertFirst( 0.09575228f, 14);
        myRoom.insertFirst( 0.30541566f, 19);
        myRoom.insertFirst( 0.0027587016f, 10);
        myRoom.insertFirst( 0.14687414f, 9);
        myRoom.insertFirst( 0.010444641f, 10);
        myRoom.insertFirst( 0.30757037f, 11);
        myRoom.insertFirst( 0.32070124f, 11);
        myRoom.insertFirst( 0.266927f, 3);
        myRoom.insertFirst( 0.14563428f, 17);
        myRoom.insertFirst( 0.27158314f, 16);
        myRoom.insertFirst( 0.07174373f, 11);
        myRoom.insertFirst( 0.31900486f, 14);
        myRoom.insertFirst( 0.07202464f, 18);
        myRoom.insertFirst( 0.13173413f, 13);
        myRoom.insertFirst( 0.099648f, 20);
        myRoom.insertFirst( 0.15768355f, 15);
        myRoom.insertFirst( 0.12580715f, 4);
        myRoom.insertFirst( 0.21922815f, 2);
        myRoom.insertFirst( 0.08562424f, 16);
        myRoom.insertFirst( 0.2568846f, 10);
        myRoom.insertFirst( 0.26430076f, 13);
        myRoom.insertFirst( 0.27138975f, 9);
        myRoom.insertFirst( 0.28243706f, 15);
        myRoom.insertFirst( 0.16548567f, 20);
        myRoom.insertFirst( 0.16298379f, 5);
        myRoom.insertFirst( 0.08338598f, 6);
        myRoom.insertFirst( 0.25117996f, 9);
        myRoom.insertFirst( 0.073318124f, 1);
        myRoom.insertFirst( 0.1618375f, 18);
        myRoom.insertFirst( 0.24348606f, 4);
        myRoom.insertFirst( 0.22442572f, 2);
        myRoom.insertFirst( 0.0029433172f, 5);
        myRoom.insertFirst( 0.24476875f, 3);
        myRoom.insertFirst( 0.023401776f, 3);
        myRoom.insertFirst( 0.092182316f, 2);
        myRoom.insertFirst( 0.111673795f, 20);
        myRoom.insertFirst( 0.15547448f, 8);
        myRoom.insertFirst( 0.21953528f, 18);
        myRoom.insertFirst( 0.22355558f, 8);
        myRoom.insertFirst( 0.1511317f, 20);
        myRoom.insertFirst( 0.01645732f, 9);
        myRoom.insertFirst( 0.22566263f, 20);
        myRoom.insertFirst( 0.06390669f, 1);
        myRoom.insertFirst( 0.2882121f, 3);
        myRoom.insertFirst( 0.09166503f, 16);
        myRoom.insertFirst( 0.19603099f, 17);
        myRoom.insertFirst( 0.017931879f, 4);
        myRoom.insertFirst( 0.24164367f, 11);
        myRoom.insertFirst( 0.2840723f, 1);
        myRoom.insertFirst( 0.16338147f, 15);
        myRoom.insertFirst( 0.21014582f, 17);
        myRoom.insertFirst( 0.032416523f, 7);
        myRoom.insertFirst( 0.25412014f, 13);
        myRoom.insertFirst( 0.07569411f, 11);
        myRoom.insertFirst( 0.3057212f, 11);
        myRoom.insertFirst( 0.25083685f, 17);
        myRoom.insertFirst( 0.016607502f, 2);
        myRoom.insertFirst( 0.24181764f, 18);
        myRoom.insertFirst( 0.009859244f, 7);
        myRoom.insertFirst( 0.27454534f, 12);
        myRoom.insertFirst( 0.18905999f, 15);
        myRoom.insertFirst( 0.29626477f, 2);
        myRoom.insertFirst( 0.14283645f, 17);
        myRoom.insertFirst( 0.33049467f, 13);
        myRoom.insertFirst( 0.05711283f, 1);
        myRoom.insertFirst( 0.17398687f, 17);
        myRoom.insertFirst( 0.31059444f, 4);
        myRoom.insertFirst( 0.012956142f, 3);
        myRoom.insertFirst( 0.29204196f, 2);
        myRoom.insertFirst( 0.06022642f, 11);
        myRoom.insertFirst( 0.15721147f, 20);
        myRoom.insertFirst( 0.18245266f, 8);
        myRoom.insertFirst( 0.16892384f, 10);
        myRoom.insertFirst( 0.18191226f, 5);
        myRoom.insertFirst( 0.32914835f, 9);
        myRoom.insertFirst( 0.07708881f, 8);
        myRoom.insertFirst( 0.15766682f, 18);
        myRoom.insertFirst( 0.3021802f, 14);
        myRoom.insertFirst( 0.26846665f, 19);
        myRoom.insertFirst( 0.30140945f, 19);
        myRoom.insertFirst( 0.1266705f, 16);
        myRoom.insertFirst( 0.20180191f, 10);
        myRoom.insertFirst( 0.11660472f, 8);
        myRoom.insertFirst( 0.11865908f, 4);
        myRoom.insertFirst( 0.11013242f, 10);
        myRoom.insertFirst( 0.28058884f, 14);
        myRoom.insertFirst( 0.0184352f, 15);
        myRoom.insertFirst( 0.16014074f, 2);
        myRoom.insertFirst( 0.31170088f, 3);
        myRoom.insertFirst( 0.021538595f, 9);
        myRoom.insertFirst( 0.30154938f, 9);
        myRoom.insertFirst( 0.28028113f, 7);
    }

    public static void main (String ... args) {
        System.out.println("Задание 1");
        System.out.println("Простой метод возведения в степень");

        long time;

        System.out.printf("%1$s", " ");
        for (int j = 2; j < 10; j++) {
            System.out.printf("%1$,15d", j);
        }
        System.out.println();

        for (float i = 2; i < 10; i++) {
            System.out.printf("%1$.0f", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1$,15.0f", MyMath.GetPower(i, j));
            }
            System.out.println();
        }

        System.out.printf("%n" + "Усовершенствованный метод возведения в степень %n");
        System.out.printf("%1$s", " ");
        for (int j = 2; j < 10; j++) {
            System.out.printf("%1$,15d", j);
        }
        System.out.println();

        for (float i = 2; i < 10; i++) {
            System.out.printf("%1$.0f", i);
            for (int j = 2; j < 10; j++) {
                System.out.printf("%1$,15.0f", MyMath.GetPowerExt(i, j));
            }
            System.out.println();
        }
        System.out.println("\n\n");

        time = System.currentTimeMillis();
        System.out.println("Замер времени: простой метод возведения в степень");
        for (float i = 2; i < 1800; i++) {
            for (int j = 2; j < 1800; j++) {
                MyMath.GetPower(i, j);
            }
        }

        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();
        System.out.println("Замер времени: усовершенствованный метод возведения в степень");
        for (float i = 2; i < 1800; i++) {
            for (int j = 2; j < 1800; j++) {
                MyMath.GetPower(i, j);
            }
        }
        System.out.println(System.currentTimeMillis() - time);

        // Задание 2
        System.out.println("\n\nЗадание 2");
        MyDoubleLinkedList<Float> myRoom = new MyDoubleLinkedList<Float>();

        BackPack bestBackPack;


    }

    static void shiftItems(MyDoubleLinkedList<Float> myRoom) {
        Item tempItem = myRoom.removeLast();
        myRoom.insertFirst(tempItem);
    }
}
