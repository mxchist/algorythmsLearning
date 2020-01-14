public class Link<T> {
    public T value;
    public Link next;

    public Link(T value) {
        this.value = value;
    }

    public void displayLink() {
        System.out.print("{" +  value + "}");
    }
}