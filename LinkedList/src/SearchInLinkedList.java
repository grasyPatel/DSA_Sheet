public class SearchInLinkedList {
    public boolean solution(Node head, int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                i++;
                System.out.println("Index: "+ i);
                return true;
            }
            i++;
            temp=temp.next;
        }

        return false;
    }


}
