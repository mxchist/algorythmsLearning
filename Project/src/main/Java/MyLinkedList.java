public class MyLinkedList<T> {
    public int size;
    public Link first;

    public MyLinkedList() {
        this.size = 0;
        this.first = null;
    }

    boolean isEmpty() {
        return first == null ? true : false;
    }

    public boolean insertFirst(T value) {
        Link tempLink = new Link(value);
        if (isEmpty()) {
            first = tempLink;
        }
        else {
            return  false;
        }

        size++;
        return true;
    }

    public boolean insert(T value) {
        if (isEmpty()) {
            return insertFirst(value);
        }
        else {
            Link tempLink = new Link(value);
            tempLink.next = first;
            first = tempLink;
        }
        size++;
        return true;
    }

    public Link removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Link tempLink = first;
        first = first.next;
        return tempLink;
    }

    public void displayList() {
        if (this.isEmpty() == false) {
            System.out.print("[");
            Link<T> current = first;
            while (current != null) {
                System.out.print(" ");
                System.out.print(current.value);
                current = current.next;
            }
            System.out.println("]");
        }
    }

}