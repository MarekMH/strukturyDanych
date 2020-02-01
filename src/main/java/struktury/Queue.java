package struktury;

public class Queue<T> {
    private Item<T> head;
    private Item<T> tail;
    private int size;

    public Queue() {
        size = 0;
        head = null;
        tail = null;
    }

    public void addItem(Item<T> item) {
        size++;
        if (head == null) {
            head = item;
            tail = head;
        } else {
            tail.setNextItem(item);
            tail = item;
        }
    }

    public void showItems() {
        System.out.println("=== QUEUE ===");
        Item<T> it = head;
        while (it != null) {
            System.out.println(it.getItem());
            it = it.getNextItem();
        }
    }
    public Item<T> pop() {
        if (size == 0)
            return null;
        Item<T> item = head;
        head = head.getNextItem();
        return item;
    }
}
