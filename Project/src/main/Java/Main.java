
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
        System.out.print("полей  "
                 + myLinkedList.find("полей") == null ? "" : myLinkedList.find("полей").value
        );
        System.out.println("нет такого элемента  "
                + myLinkedList.find("нет такого элемента") == null ? "" : myLinkedList.find("нет такого элемента").value
        );


        System.out.println("Удаляем элемент");
        System.out.print("конструктор  ");
        myLinkedList.remove("конструктор").displayLink();
        System.out.println();

        System.out.println("Весь список");
        myLinkedList.displayList();

        //Двусторонний список
         System.out.println("\nДвусторонний список");
         
    }
}