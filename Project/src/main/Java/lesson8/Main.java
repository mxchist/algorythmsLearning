package lesson8;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Метод цепочек");
        ChainingHashMap<Integer, String> map = new ChainingHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

//        System.out.println(map.contains(2));
//        System.out.println(map.get(4));
//        map.put(4,"four4");
//        System.out.println(map.get(4));

//        Random random = new Random();
//        for (int i = 0; i < 35; i++) {
//            map.put(random.nextInt(1000), "");
//        }
//
//        System.out.println(map);

        System.out.println("Вывести содержание таблицы");
        System.out.println(map);
        System.out.println("Удалить значение");
        System.out.println(map.delete(4));
        System.out.println("Вывести содержание таблицы");
        System.out.println(map);

        System.out.println("\nЛинейное пробирование");
        LinearProbingHashMap<Integer, String> map1 = new LinearProbingHashMap(12, -1);

        map1.put(1, "one");
        map1.put(2, "two");
        map1.put(3, "three");
        map1.put(4, "four");
        map1.put(5, "five");

        System.out.println("Вывести содержание таблицы");
        System.out.println(map1);
        System.out.println("Удалить значение");
        System.out.println(map1.delete(4));
        System.out.println("Вывести содержание таблицы");
        System.out.println(map1);

    }


}
