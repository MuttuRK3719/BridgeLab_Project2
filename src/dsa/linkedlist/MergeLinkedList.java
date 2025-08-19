package dsa.linkedlist;

public class MergeLinkedList {
    Node mergeList(Node list1, Node list2) {
        Node dummy = new Node(0);
        Node mergedList = dummy;

        while (list1 != null && list2 != null) {
            if (list1.value > list2.value) {
                mergedList.next = list2;
                list2 = list2.next;
            } else {
                mergedList.next = list1;
                list1 = list1.next;
            }
            mergedList = mergedList.next;
        }
        if (list1 != null) mergedList.next = list1;
        if (list2 != null) mergedList.next = list2;
        return dummy.next;
    }
}
