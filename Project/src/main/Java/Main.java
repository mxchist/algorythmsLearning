import java.lang.System;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String ... args) {
        System.out.println("Введите строку:");
        char[] cArray;
//        Scanner sc = new Scanner(System.in);
//        sc.useDelimiter("\n");
//        cArray = sc.next().toCharArray();
        String sc = "Сегодня подобные испытания запрещены, к тому же у большинства владеющих ядерным оружием стран на орбите находится множество спутников, многие из которых будут повреждены достаточно мощным взрывом";
        System.out.println(sc);
        cArray = sc.toCharArray();
        MyStack myStack = new MyStack(10);

        for (int i = 0; i < cArray.length; i++) {
            myStack.insert(cArray[i]);
        }

        System.out.printf("%n%1s%n", "Результат:");
        while (!myStack.isEmpty()) {
            System.out.print(myStack.remove());
        }
    }
}
