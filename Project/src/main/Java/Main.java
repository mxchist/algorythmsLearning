import java.lang.System;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String ... args) {
        // 2nd exercise;
        System.out.println("Введите строку:");
        char[] cArray;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        cArray = sc.next().toCharArray();
//        String sc = "Сегодня подобные испытания запрещены, к тому же у большинства владеющих ядерным оружием стран на орбите находится множество спутников, многие из которых будут повреждены достаточно мощным взрывом";
//        System.out.println(sc);
//        cArray = sc.toCharArray();
        MyStack myStack = new MyStack(10);

        for (int i = 0; i < cArray.length; i++) {
            myStack.push(cArray[i]);
        }

        System.out.printf("%n%1s%n", "Результат:");
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
        System.out.println();

        // Exercise 3
        System.out.printf("%1s %n", "Задание 3:");
        String s3 = "Тем временем, разбрасывая во все стороны камешки, Снежок невозмутимо спускался по своему личному оползню. Первые камни ударились о дно каньона всего лишь через мгновение после того, как туда проскакала замыкающая табун лошадь.\n" +
                "Одеревеневший от ужаса и тряски Ринсвинд вгляделся вперед. Каньон заканчивался тупиком, то есть очередной отвесной стеной.\n" +
                "А камни все падали и падали, образуя подобие грубой стены. И когда скатился последний валун, Снежок грациозно приземлился прямо на него.\n" +
                "После чего посмотрел вниз — на запертый в каньоне, сбившийся в кучу табун. Ноздри у Снежка раздувались. Ринсвинд был почти уверен, что лошади не умеют хихикать, но Снежок, похоже, надрывался со смеху.\n";
        cArray = s3.toCharArray();
        MyDeck myDeck = new MyDeck<Character>(11);
        boolean isLeftWasLast = true;

        for (int i = cArray.length-1; i >=0; i--) {
            myDeck.insertLeft(cArray[i]);
            i--;
            isLeftWasLast = true;
            if (i < cArray.length) {
                myDeck.insertRight(cArray[i]);
                isLeftWasLast = false;

            }
        }

        if (!myDeck.isEmpty() && isLeftWasLast == true) {
            System.out.print(myDeck.removeLeft());
        }
        while (!myDeck.isEmpty()) {
            System.out.print(myDeck.removeRight());
            if (!myDeck.isEmpty()) System.out.print(myDeck.removeLeft());
        }
    }
}
