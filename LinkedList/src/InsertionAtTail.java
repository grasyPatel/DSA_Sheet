public class InsertionAtTail {
    public Node solution(int x, Node head){
        Node temp=head;
        Node newNode =new Node(x);

        if(head==null){
            return newNode;

        }
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;

        return head;
    }
}
