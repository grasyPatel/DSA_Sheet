public class LengthOfTheLinkedList {
    public int solution(Node head){
        int len=0;
        Node temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;

        }
        return len;
    }
}
