public class BackPack {
    
    MyDoubleLinkedList items;
    public float weight;
    public int price;
    
    public BackPack() {
        items = new MyDoubleLinkedList();
    }

    public boolean insert (Item<Long> item) {
        if (item.weight + getSumWieght() > 1) return false;
        else {
            return this.items.insertFirst(item.weight, item.price);
        }
    }

    public int getSumPrice() {
        int sum =0;
        if (items.isEmpty()) {
            return sum;
        }
        Item<Float> current = items.first;
        while (current != null) {
            sum += current.price;
            current = current.next;
        }
        return  sum;
    }

    public float getSumWieght() {
        int sum =0;
        if (items.isEmpty()) {
            return sum;
        }
        Item<Float> current = items.first;
        while (current != null) {
            sum += current.weight;
            current = current.next;
        }
        return  sum;
    }

}
