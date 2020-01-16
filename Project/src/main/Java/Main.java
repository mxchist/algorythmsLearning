import java.lang.System;
public class Main {
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
    }
}
