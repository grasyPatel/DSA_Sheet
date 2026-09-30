public class DeleteTheElementWithX {
    public Node deleteElement(int x, Node head){
        if(head==null){
            return head;
        }
        if(head.data==x){
            return head=head.next;
        }
        Node temp=head;
        Node pre=null;
        while(temp!=null){

            if(temp.next==null) {
                System.out.println("No element Deleted ");
                return head;
            }

            if(temp.next.data==x){
                temp.next=temp.next.next;
                return head;

            }

            temp=temp.next;
        }
        return head;
    }
}
