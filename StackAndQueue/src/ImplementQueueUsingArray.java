public class ImplementQueueUsingArray {
    int size=-1;
    int[] arr;
    int frontIndex=-1;
    int rareIndex=-1;

    public ImplementQueueUsingArray(int capacity){
        this.size=capacity;
        arr=new int[capacity];
    }
    public void push(int x){
        if(frontIndex==size-1){
            int newarr[]=new int[size+10];
            size=size+10;
            for(int i=0;i<arr.length;i++){
                newarr[i]=arr[i];
            }
            arr=newarr;
            frontIndex++;
            arr[frontIndex]=x;
            return;
        }
        if(rareIndex==-1){
            rareIndex=0;
        }
        frontIndex++;
        arr[frontIndex]=x;

    }
    public int pop(){
        int value=0;
        if(!isEmpty()){
            value=arr[rareIndex];
            rareIndex++;
            return value;

        }
        return -1;
    }

    public int peek(){
        if(!isEmpty()){
            return arr[rareIndex];
        }
        return -1;
    }
    public boolean isEmpty(){
        return rareIndex==-1 || rareIndex==frontIndex;
    }
}
