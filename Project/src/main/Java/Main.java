
class Main {

    static void fillMyLinkedList(MyLinkedList myLinkedList) {
        myLinkedList.insert("Кроме");
        myLinkedList.insert("полей");
        myLinkedList.insert("данных");
        myLinkedList.insert(",");
        myLinkedList.insert("класс");
        myLinkedList.insert("содержит");
        myLinkedList.insert("конструктор");
        myLinkedList.insert("и");
        myLinkedList.insert("метод");

        System.out.println("Весь список");
        myLinkedList.displayList();
    }

    static void fillMyLinkedList(MyTwoSideLinkedList myTwoSideLinkedList) {
        myTwoSideLinkedList.insertFirst("Кроме");
        myTwoSideLinkedList.insertFirst("полей");
        myTwoSideLinkedList.insertFirst("данных");
        myTwoSideLinkedList.insertFirst(",");
        myTwoSideLinkedList.insertFirst("класс");
        myTwoSideLinkedList.insertFirst("содержит");
        myTwoSideLinkedList.insertFirst("конструктор");
        myTwoSideLinkedList.insertFirst("и");
        myTwoSideLinkedList.insertFirst("метод");

        System.out.println("Весь список");
        myTwoSideLinkedList.displayList();
    }

    public static void main(String... args) {

        //Задание 1
        //Односсторонний список
        System.out.println("Задание 1 \n Односсторонний список");
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        fillMyLinkedList(myLinkedList);

        System.out.println("Удаляем первый элемент");
        myLinkedList.removeFirst();
        myLinkedList.displayList();

        while (!myLinkedList.isEmpty()) {
            myLinkedList.removeFirst().displayLink();
            myLinkedList.displayList();
        }

        System.out.println();
        fillMyLinkedList(myLinkedList);
        System.out.println("Находим элемент");
        System.out.println("полей  "
                 + (myLinkedList.find("полей") == null ? "" : myLinkedList.find("полей").value)
        );
        System.out.println("нет такого элемента  "
                + (myLinkedList.find("нет такого элемента") == null ? "" : myLinkedList.find("нет такого элемента").value)
        );


        System.out.println("Удаляем элемент");
        System.out.print("конструктор  ");
        myLinkedList.remove("конструктор").displayLink();
        System.out.println();

        System.out.println("Весь список");
        myLinkedList.displayList();

        //Двусторонний список
         System.out.println("\nДвусторонний список");
        MyTwoSideLinkedList<String> myTwoSideLinkedList = new MyTwoSideLinkedList<>();
        fillMyLinkedList(myTwoSideLinkedList);

        System.out.println("Удаляем первый элемент");
        myTwoSideLinkedList.removeFirst();
        myTwoSideLinkedList.displayList();

        System.out.println("Вставляем последний элемент");
        myTwoSideLinkedList.insertLast("для");
        myTwoSideLinkedList.insertLast("вывода");
        myTwoSideLinkedList.insertLast("данных");
        myTwoSideLinkedList.displayList();

        myTwoSideLinkedList.remove("вывода");
        myTwoSideLinkedList.displayList();

    }
}