package struktury;

public class Item<T> {
    private T item;
    private Item<T> nextItem;
    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }

    public Item<T> getNextItem() {
        return nextItem;
    }
    public void setNextItem(Item<T> nextItem) {
        this.nextItem = nextItem;
    }

    public Item(T item) {
        this.item = item;
        this.nextItem = null;
    }
    @Override
    public String toString() {
        return item.toString();
    }
}


