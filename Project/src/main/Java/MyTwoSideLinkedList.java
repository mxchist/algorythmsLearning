class MyTwoSideLinkedList<T extends Object> extends MyLinkedList {
    public Link last;

    public MyTwoSideLinkedList() {
        super();
        this.last = null;
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public Link getFirst() {
        return super.getFirst();
    }

    public boolean insertFirst(T value) {
        this.last = first;
        return super.insertFirst(value);
    }
}