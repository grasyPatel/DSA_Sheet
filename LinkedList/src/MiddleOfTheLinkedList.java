public class MiddleOfTheLinkedList {
    public int solution(Node head){
        int n=0;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null && slow!=null ) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.data;


    }
}
