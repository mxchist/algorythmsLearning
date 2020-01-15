import java.util.ListIterator;

class MyDoubleLinkedList<T>  {
    public int size;
    public LinkD first;
    public LinkD last;

    public MyDoubleLinkedList() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    boolean isEmpty() {
        return first == null ? true : false;
    }

    public LinkD getFirst() {
        return first;
    }

    public LinkD getLast() {
        return last;
    }

    public boolean insertFirst(T value) {
        LinkD tempLink = new LinkD(value);
        if (isEmpty()) {
            first = tempLink;
            last = tempLink;
        }
        else {
            tempLink.next = first;
            first.previous = first;
            first = tempLink;
        }

        size++;
        return true;
    }

    public boolean insertLast(T value) {
        if (isEmpty()) {
            return insertFirst(value);
        }
        else {
            LinkD tempLink = new LinkD(value);
            last.next = tempLink;
            tempLink.previous = last;
            last = tempLink;
        }
        size++;
        return true;
    }

    public LinkD removeFirst() {
        if (isEmpty()) {
            return null;
        }
        LinkD tempLink = first;
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

    public LinkD removeLast() {
        if (isEmpty()) {
            return null;
        }
        LinkD tempLink = last;
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

    public LinkD remove(T value) {
        if (isEmpty()) {
            return null;
        }

        LinkD<T> current = last;
        if (current.value.equals(value)) {
            removeLast();
            return current;
        }
        current = first;
        if (current.value.equals(value)) {
            removeFirst();
            return current;
        }
        current = current.next;
        while (current != null) {
            if (current.value.equals(value)) {
                current.previous.next = current.next;
                current.next.previous = current.previous;
                this.size--;
                return current;
            }
            current = current.next;
        }
        return  null;
    }

    public LinkD find(T value) {
        if (isEmpty()) {
            return null;
        }
        LinkD<T> current = first;
        while (current != null) {
            if (current.value.equals(value)) return current;
            current = current.next;
        }
        return  null;
    }

    public void displayList() {
        if (this.isEmpty() == false) {
            System.out.print("[");
            LinkD<T> current = first;
            while (current != null) {
                System.out.print(" ");
                System.out.print(current.value);
                current = current.next;
            }
            System.out.println(" ]");
        }
    }

}