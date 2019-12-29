

public class MyStack {

    private int maxSize;
    private int[] stack;
    private int items;
    private int marker;

    public MyStack(int maxSize) {
        if (maxSize == 0) {
            throw new IllegalArgumentException();
        }
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
        this.items = 0;
        this.marker = 0;
    }

    public boolean isEmpty() {
        return items == 0;
    }
    public boolean isFull() {
        return items == maxSize;
    }

    public void insert (int a) {
        try {
            stack[marker++] = a;
        }
        catch (IndexOutOfBoundsException e) {
            maxSize += maxSize/10;
            int[] newStack = new int[maxSize];
            System.arraycopy(stack, 0, newStack, 0, items);
            stack = newStack;
            stack[marker] = a;
        }
    }

    public int peek() {
        return stack[marker];
    }

    public int remove() {
        return stack[marker];
    }

}
