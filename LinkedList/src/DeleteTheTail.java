public class DeleteTheTail {
    public Node solution(Node head){
        Node temp=head;

        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
}
