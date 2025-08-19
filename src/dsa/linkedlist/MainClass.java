package dsa.linkedlist;

public class MainClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(80);
        list.add(-10);
        list.add(40);
        list.add(20);
        list.add(50);
        SearchElement searchElement = new SearchElement();

        System.out.println(searchElement.searchElement(list.head, 70));

    }
}
