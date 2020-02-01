import struktury.Item;
import struktury.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<String> stosNapisów = new Stack<String>();
        Item<String> napis1 = new Item<String>("ala");
        Item<String> napis2 = new Item<String>("ma");
        Item<String> napis3 = new Item<String>("kota");
        stosNapisów.push(napis1);
        stosNapisów.push(napis2);
        stosNapisów.push(napis3);
        Item<String> elem1 = stosNapisów.pop();
        System.out.println(elem1);
        Item<String> elem2 = stosNapisów.pop();
        System.out.println(elem2);
        Item<String> napis4 = new Item<String>("i");
        Item<String> napis5 = new Item<String>("psa");
        stosNapisów.push(napis3);
        stosNapisów.push(napis4);
        stosNapisów.push(napis5);
        System.out.println("=== STACK === ");
        while(stosNapisów.getSize() > 0)
            System.out.println(stosNapisów.pop());
    }
}
