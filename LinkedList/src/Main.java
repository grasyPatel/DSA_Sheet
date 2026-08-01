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
        System.out.println();
        InsertionAtHeadOfTheLinkedList obj2=new InsertionAtHeadOfTheLinkedList();
        obj1.head=obj2.solution(obj1.head,11);

        obj1.display();




    }
}