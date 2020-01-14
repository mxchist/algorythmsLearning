class LinkD<T>  {
    public T value;
    public LinkD next;
    public LinkD previous;

    public LinkD(T value) {
        this.value = value;
    }

    public void displayLink() {
        System.out.print("{" +  value + "}");
    }
}