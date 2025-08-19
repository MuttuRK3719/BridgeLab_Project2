package dsa.linkedlist;

public class MainClass {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(80);
        ll.add(-10);
        ll.add(40);
        ll.add(20);
        ll.add(50);
        SearchElement searchElement = new SearchElement();

        System.out.println(searchElement.searchElement(ll.head, 7
                0));

    }
}
