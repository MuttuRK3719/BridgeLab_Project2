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
        LinkedList ll1 = new LinkedList();
        ll1.add(110);
        ll1.add(220);
        ll1.add(330);
        ll1.add(440);
        ll1.add(550);
        ll1.add(660);
        ll1.display();
        System.out.println("Sort List");
        SortLinkedList sortLinkedList=new SortLinkedList();

        Node sortedList=sortLinkedList.sortLists(ll.head);
        ll.display(sortedList);

    }
}
