public class Item<T>  {
    public T weight;
    public int price;
    public Item next;
    public Item previous;

    public Item(T weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public void displayLink() {
        System.out.print("{" +  weight + "}");
    }
}

