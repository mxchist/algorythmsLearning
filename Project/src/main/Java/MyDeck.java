//Third exercise

public class MyDeck<T> {
    private int maxSize;
    private T[] deck;
    private int leftMarker;
    private int rightMarker;
    private int operationsQty;

    public MyDeck(int maxSize) {
        if (maxSize < 10) {
            throw new IllegalArgumentException();
        }
        this.maxSize = maxSize;
        this.deck = (T[]) new Object[maxSize];
        this.rightMarker = maxSize/2;
        this.leftMarker = this.rightMarker +1;
        operationsQty = 1;
    }

    public boolean isEmpty() {
        return (
            this.leftMarker > this.rightMarker
        );
    }
    public boolean isFull() {
        return leftMarker == 0 || rightMarker == maxSize -1;
    }

//    private void shrinkDeck() {
//        if (isEmpty() == true || isFull() == true ) return;
//        maxSize -= maxSize/1.2;
//        T[] newDeck = (T[]) new Object[maxSize];
//        System.arraycopy(deck, 0, newDeck, 0, marker);
//        deck = newDeck;
//    }

    private void enlargeDeckRight() {
        maxSize += maxSize/10;
        T[] newDeck = (T[]) new Object[maxSize];
        System.arraycopy(deck, leftMarker, newDeck, leftMarker, rightMarker -leftMarker);
        deck = newDeck;
    }

    private void enlargeDeckLeft() {
        int delta = maxSize/10;
        maxSize += delta;
        T[] newDeck = (T[]) new Object[maxSize];
        leftMarker += delta;
        rightMarker += delta;
        System.arraycopy(deck, 0, newDeck, delta, rightMarker-leftMarker);
        deck = newDeck;
    }

    public void insertLeft (T a) {
        try {
            deck[--leftMarker] = a;
        }
        catch (IndexOutOfBoundsException e) {
            enlargeDeckLeft();
            deck[leftMarker] = a;
        }
    }

    public void insertRight (T a) {
        try {
            deck[++rightMarker] = a;
        }
        catch (IndexOutOfBoundsException e) {
            enlargeDeckRight();
            deck[rightMarker] = a;
        }
    }

    public T removeLeft() {
        operationsQty++;
//        if (operationsQty% 1000 == 0 && marker < maxSize - maxSize / 1.2) {
//            shrinkDeck();
//        }
        return deck[leftMarker++];
    }

    public T removeRight() {
        operationsQty++;
//        if (operationsQty% 1000 == 0 && marker < maxSize - maxSize / 1.2) {
//            shrinkDeck();
//        }
        return deck[rightMarker--];
    }

    public T peekLeft() {
        return deck[leftMarker];
    }

    public T peekRight() {
        return deck[leftMarker];
    }

}
