
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

    static void fillMyLinkedList(MyDoubleLinkedList myDoubleLinkedList) {
        myDoubleLinkedList.insertFirst("В");
        myDoubleLinkedList.insertFirst("ходе");
        myDoubleLinkedList.insertFirst("обсуждения");
        myDoubleLinkedList.insertFirst("тестов");
        myDoubleLinkedList.insertFirst("планировщика");
        myDoubleLinkedList.insertFirst("задач");
        myDoubleLinkedList.insertFirst(",");
        myDoubleLinkedList.insertFirst("один ");
        myDoubleLinkedList.insertFirst("участников");
        myDoubleLinkedList.insertFirst("дискуссии");
        myDoubleLinkedList.insertFirst("привёл");
        myDoubleLinkedList.insertFirst("пример");
        myDoubleLinkedList.insertFirst("того");

        System.out.println("Весь список");
        myDoubleLinkedList.displayList();
    }

    public static void main(String... args) {

        //Задание 1
        //Односсторонний список
        System.out.println("Задание 1 \n Односторонний список");
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

        //Двусвязный список
        System.out.println("\nДвусвязный список");
        MyDoubleLinkedList<String> myDoubleLinkedList = new MyDoubleLinkedList<String>();
        fillMyLinkedList(myDoubleLinkedList);

        System.out.println("Удаляем первый элемент");
        myDoubleLinkedList.removeFirst();
        myDoubleLinkedList.displayList();

        System.out.println("Вставляем последний элемент");
        myDoubleLinkedList.insertLast("что");
        myDoubleLinkedList.insertLast("несмотря");
        myDoubleLinkedList.insertLast("на");
        myDoubleLinkedList.insertLast("заявления");
        myDoubleLinkedList.insertLast("о");
        myDoubleLinkedList.insertLast("необходимости ");
        myDoubleLinkedList.insertLast("сохранения");
        myDoubleLinkedList.insertLast("совместимости");
        myDoubleLinkedList.insertLast("при");
        myDoubleLinkedList.insertLast("разработке");
        myDoubleLinkedList.insertLast("при");
        myDoubleLinkedList.insertLast("ядра");
        myDoubleLinkedList.insertLast("Linux");
        myDoubleLinkedList.insertLast("недавние");
        myDoubleLinkedList.insertLast("изменения");

        myDoubleLinkedList.displayList();

        System.out.println("Удаляем элемент \"дискуссии\":");
        myDoubleLinkedList.remove("дискуссии");
        myDoubleLinkedList.displayList();


        //Задание 3
        System.out.println("Задание 3 \n Реализация стека");
        MyStack<String> myStack = new MyStack<String>();
        myStack.push("Линус");
        myStack.push("Торвальдс");
        myStack.push("ответил,");
        myStack.push("что");
        myStack.push("принцип");
        myStack.push("не");
        myStack.push("ломать");
        myStack.push("пользователей");
        myStack.push("относится");
        myStack.push("к");
        myStack.push("сохранению");
        myStack.push("внешних");
        myStack.push("интерфейсов");
        myStack.push("ядра,");
        myStack.push("используемых");
        myStack.push("приложениями");
        myStack.push("в");
        myStack.push("пространстве");
        myStack.push("пользователя,");
        myStack.push("а");
        myStack.push("также");
        myStack.push("самого");
        myStack.push("ядра");

        while (!myStack.isEmpty()) {
            System.out.print(" " + myStack.pop().value);
        }
    }
}