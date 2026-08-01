//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreateLinkedList obj1=new CreateLinkedList();
        obj1.createList(10);
        obj1.createList(30);
        obj1.createList(4);
        obj1.createList(67);
        obj1.createList(88);
        obj1.display();
//        Q1-----------------------
        System.out.println();
        InsertionAtHeadOfTheLinkedList obj2=new InsertionAtHeadOfTheLinkedList();
        obj1.head=obj2.solution(obj1.head,11);
        obj1.display();
//        Q2-----------------------
        System.out.println();
        DeleteTheHeadOfLinkedList obj3=new DeleteTheHeadOfLinkedList();
        obj1.head=obj3.solution(obj1.head);
        obj1.display();

//        Q3-----------------------
        System.out.println();
        LengthOfTheLinkedList obj4 =new LengthOfTheLinkedList();
        int len=obj4.solution(obj1.head);
        System.out.println("Length: "+len);

//        Q4-----------------------
        SearchInLinkedList obj5=new SearchInLinkedList();
        System.out.println("Is Present: "+obj5.solution(obj1.head,9));






    }
}