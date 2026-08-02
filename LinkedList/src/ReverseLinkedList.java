public class ReverseLinkedList {
    public Node solution(Node head){
        Node pre=null;
        Node temp=head;

        while(temp!=null){
           Node front=temp.next;
           temp.next=pre;
           pre=temp;
           temp=front;
        }
        return pre;


    }
}
