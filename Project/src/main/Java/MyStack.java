

public class MyStack {

    private int maxSize;
    private char[] stack;
    private int marker;
    private int operationsQty;

    public MyStack(int maxSize) {
        if (maxSize == 0) {
            throw new IllegalArgumentException();
        }
        this.maxSize = maxSize;
        this.stack = new char[maxSize];
        this.marker = 0;
        operationsQty = 1;

    }

    public boolean isEmpty() {
        return marker == 0;
    }
    public boolean isFull() {
        return marker == maxSize - 1;
    }

    private void shrinkStack() {
        if (marker == 0 ) return;
        maxSize -= maxSize/1.2;
        char[] newStack = new char[maxSize];
        System.arraycopy(stack, 0, newStack, 0, marker);
        stack = newStack;

    }
    private void enlargeStack() {
        maxSize += maxSize/10;
        char[] newStack = new char[maxSize];
        System.arraycopy(stack, 0, newStack, 0, marker);
        stack = newStack;

    }

    public void insert (char a) {
        try {
            stack[marker] = a;
            marker++;
        }
        catch (IndexOutOfBoundsException e) {
            enlargeStack();
            stack[marker++] = a;
        }
    }

    public char peek() {
        return stack[marker];
    }

    public char remove() {
        operationsQty++;
        if (operationsQty% 1000 == 0 && marker < maxSize / 1.1) {
            shrinkStack();
        }
        return stack[--marker];

    }

}
