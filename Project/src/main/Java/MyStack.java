class MyStack<T> {
    MyDoubleLinkedList<T> stack;
    public MyStack() {
        this.stack = new MyDoubleLinkedList<>();
    }

    boolean isEmpty() {
        return this.stack.isEmpty();
    }

    boolean isFull() {
        return !this.stack.isEmpty();
    }

    public void push (T value) {
        this.stack.insertFirst(value);
    }

    public LinkD pop() {
        return this.stack.removeLast();
    }

    public void printStack() {
        this.stack.displayList();
    }
}