import struktury.Item;
import struktury.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> listaNapisów = new List<String>();
        Item<String> napis1 = new Item<String>("ala");
        Item<String> napis2 = new Item<String>("ma");
        Item<String> napis3 = new Item<String>("kota");
        listaNapisów.pushBack(napis1);
        listaNapisów.pushBack(napis2);
        listaNapisów.pushBack(napis3);
        listaNapisów.showList();
        Item<String> napis4 = new Item<String>("i");
        Item<String> napis5 = new Item<String>("psa");
        listaNapisów.deleteItem(2);
        listaNapisów.pushBack(napis5);
        listaNapisów.pushBack(napis4);
        listaNapisów.pushBack(napis3);
        listaNapisów.showList();
        listaNapisów.pushFront("adam");
        Item<String> elem = listaNapisów.popBack();
        System.out.println("Pop from back of list: " + elem.getItem());
        listaNapisów.showList();
        elem = listaNapisów.popFront();
        System.out.println("Pop from front of list: " + elem.getItem());
        listaNapisów.showList();
    }
}
