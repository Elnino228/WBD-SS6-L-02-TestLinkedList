public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList =new MyLinkedList(10);
//        System.out.println(myLinkedList.numNode);
        myLinkedList.addFirst(11);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);

        myLinkedList.add(4,9);
        myLinkedList.add(4,9);

        myLinkedList.printList();
        System.out.println(myLinkedList.numNode);

    }
}
