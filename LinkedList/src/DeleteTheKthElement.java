public class DeleteTheKthElement {
    public Node deleteElement(int k, Node head){
        Node temp=head;
        if(head==null){
            return head;
        }
        if(k==1){
            head=head.next;
            return head;
        }
        int i=1;
        while(i<k-1 && temp!=null){
            i++;
            temp=temp.next;

            if(temp.next==null){
                System.out.println("NO Element deleted");
                return head;
            }
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }

        return head;

    }
}
