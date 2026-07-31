public class ImplementStackUsingArray {
    int size;
    int arrStack[];
    int index=-1;
    public void solution(int capacity){
        size=capacity;
        arrStack=new int[size];




    }
    public void push(int x){
        if(size-1==index) {
            int arr[] = new int[size + 10];
            size = size + 10;
            for (int i = 0; i < arrStack.length; i++) {
                arr[i] = arrStack[i];
            }
            arrStack=arr;

        }
        index++;
        arrStack[index]=x;


    }
    public int  pop(){
        if(!isEmpty()) {
            int value = arrStack[index];
            index--;
            return value;
        }
        return -1;

    }
    public boolean isEmpty(){
        return index==-1;
    }
    public int top(){
        if(index==-1){
            return -1;
        }
        return arrStack[index];
    }

    public int sizeOfStack(){
        return index;
    }
}
