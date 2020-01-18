public class MyDoubleLinkedList<T>  {
    public int size;
    public Item first;
    public Item last;

    public MyDoubleLinkedList() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    boolean isEmpty() {
        return first == null ? true : false;
    }

    public Item getFirst() {
        return first;
    }

    public Item getLast() {
        return last;
    }

    public boolean insertFirst(T weight, int price) {
        Item tempLink = new Item(weight, price);
        if (isEmpty()) {
            first = tempLink;
            last = tempLink;
        }
        else {
            tempLink.next = first;
            first.previous = tempLink;
            first = tempLink;
        }

        size++;
        return true;
    }

    public boolean insertLast(T weight, int price) {
        if (isEmpty()) {
            return insertFirst(weight, price);
        }
        else {
            Item tempLink = new Item(weight, price);
            last.next = tempLink;
            tempLink.previous = last;
            last = tempLink;
        }
        size++;
        return true;
    }

    public Item removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Item tempLink = first;
        if (size == 1) {
            first = last = null;
        }
        else {
            first.next.previous = null;
            first = first.next;
        }
        size--;
        return tempLink;
    }

    public Item removeLast() {
        if (isEmpty()) {
            return null;
        }
        Item tempLink = last;
        if (size == 1) {
            first = last = null;
        }
        else {
            last.previous.next = null;
            last = last.previous;
        }
        size--;
        return tempLink;
    }

    public Item remove(T weight) {
        if (isEmpty()) {
            return null;
        }

        Item<T> current = last;
        if (current.weight.equals(weight)) {
            removeLast();
            return current;
        }
        current = first;
        if (current.weight.equals(weight)) {
            removeFirst();
            return current;
        }
        current = current.next;
        while (current != null) {
            if (current.weight.equals(weight)) {
                current.previous.next = current.next;
                current.next.previous = current.previous;
                this.size--;
                return current;
            }
            current = current.next;
        }
        return  null;
    }

    public Item find(T weight) {
        if (isEmpty()) {
            return null;
        }
        Item<T> current = first;
        while (current != null) {
            if (current.weight.equals(weight)) return current;
            current = current.next;
        }
        return  null;
    }

    public void displayList() {
        if (this.isEmpty() == false) {
            System.out.print("[");
            Item<T> current = first;
            while (current != null) {
                System.out.print(" ");
                System.out.print(current.weight);
                current = current.next;
            }
            System.out.println(" ]");
        }
    }

    public void clear() {
        while (!this.isEmpty()) {
            removeLast();
        }
    }

}
