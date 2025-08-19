package dsa.linkedlist;

public class MainClass {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        LinkedList ll1=new LinkedList();
        ll1.add(110);
        ll1.add(220);
        ll1.add(330);
        ll1.add(440);
        ll1.add(550);
        ll1.add(660);
        ll1.display();
        ReverseLinkedList list = new ReverseLinkedList();
        Node node = list.reverseLinkedList(ll.head);
        ll.display(node);
        MergeLinkedList mergeLinkedList=new MergeLinkedList();
        Node mergeList=mergeLinkedList.mergeList(ll.head,ll1.head);
        System.out.println("MergedList");
        ll.display(mergeList);
    }
}
