public class DeleteTheHeadOfLinkedList {
    public Node solution(Node head){
        head=head.next;
        return head;
    }
}
