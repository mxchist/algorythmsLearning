//Third exercise

public class MyDeck<T> {
    private int maxSize;
    private T[] deck;
    private int leftMarker, begin;
    private int rightMarker;
    private int operationsQty;

    public MyDeck(int maxSize) {
        if (maxSize == 0) {
            throw new IllegalArgumentException();
        }
        this.maxSize = maxSize;
        this.deck = (T[]) new Object[maxSize];
        this.leftMarker = begin = maxSize/2;
        this.rightMarker = this.leftMarker +1;
        operationsQty = 1;

    }

    public boolean isEmpty() {
        return (
            leftMarker == begin & rightMarker == begin + 1 && deck[leftMarker] == null && deck[rightMarker] == null
        );
    }
    public boolean isFull() {
        return leftMarker == -1 || rightMarker == maxSize;
    }

//    private void shrinkStack() {
//        if (isEmpty() == true || isFull() == true ) return;
//        maxSize -= maxSize/1.2;
//        T[] newStack = (T[]) new Object[maxSize];
//        System.arraycopy(deck, 0, newStack, 0, marker);
//        deck = newStack;
//    }

    private void enlargeStackRight() {
        maxSize += maxSize/10;
        T[] newStack = (T[]) new Object[maxSize];
        System.arraycopy(deck, 0, newStack, 0, rightMarker);
        deck = newStack;
    }

    private void enlargeStackLeft() {
        int delta = maxSize/10;
        maxSize += delta;
        T[] newStack = (T[]) new Object[maxSize];
        System.arraycopy(deck, 0, newStack, delta, rightMarker);
        deck = newStack;
    }

    public void insertLeft (T a) {
        try {
            deck[leftMarker--] = a;
        }
        catch (IndexOutOfBoundsException e) {
            enlargeStackLeft();
            deck[leftMarker] = a;
        }
    }

    public void insertRight (T a) {
        try {
            deck[rightMarker++] = a;
        }
        catch (IndexOutOfBoundsException e) {
            enlargeStackRight();
            deck[rightMarker] = a;
        }
    }

    public T removeLeft() {
        operationsQty++;
//        if (operationsQty% 1000 == 0 && marker < maxSize - maxSize / 1.2) {
//            shrinkStack();
//        }
        return deck[++leftMarker];
    }

    public T removeRight() {
        operationsQty++;
//        if (operationsQty% 1000 == 0 && marker < maxSize - maxSize / 1.2) {
//            shrinkStack();
//        }
        return deck[--rightMarker];
    }

    public T peekLeft() {
        return deck[leftMarker+1];
    }

    public T peekRight() {
        return deck[leftMarker-1];
    }

}
