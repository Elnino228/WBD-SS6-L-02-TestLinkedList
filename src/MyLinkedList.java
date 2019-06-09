public class MyLinkedList {
    private Node head;
    public int numNode=0;

    public MyLinkedList(Object data) {
        head=new Node(data);
        numNode++;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data=data;
        }
        public Object getData() {
            return data;
        }
    }

    public void add(int index, Object data) {
        int i=0;
        Node temp=head;
        while (i<index-1) {
            temp=temp.next;
            i++;
        }
        Node holder=temp.next;
        Node newNode=new Node(data);
        temp.next=newNode;
        temp.next.next=holder;
        numNode++;
    }
    public void addFirst(Object data) {
        Node temp=head;
        head=new Node(data);
        head.next=temp;
        numNode++;
    }
    public Node get(int index) {
        Node temp=head;
        for (int i=0;i<index;i++) {
            temp=temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}