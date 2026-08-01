public class InsertionAtHeadOfTheLinkedList {
    public Node solution(Node head, int data){
        Node newNode=new Node(data);
        newNode.next=head;
        return newNode;
    }


}
