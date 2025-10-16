class queueusingarray{
    int front, rear, currsize;
    int size;
    int[] queue;

    public queueusingarray(int size){
        this.size=size;
        queue=new int[size];
        front=-1;
        rear=-1;
        currsize=0;
    }

    void add(int x){
        if(currsize==size){
            System.out.println("The queue is full");
            return;
        }
        if(currsize==0){
            front=0;
            rear=0;
        }
        else 
        rear=(rear+1)%size;

        queue[rear]=x;
        currsize++;
    }

    int remove(){
        if(currsize==0) {
            System.out.println("The queue is empty");
            return 0;
        }

        int ele = queue[front];

        if(currsize==1){
            front=rear=-1;
        }
        else{
            front=(front+1)%size;
        }
        currsize--;
        return ele;
    }

    int peek(){
        if(currsize==0) 
        {
            System.out.println("The queue is empty so zer output ");
            return 0;
        }
        return queue[front];
    }
    int sizeofqueue(){
        return currsize;
    }
}

public class implementqueusingarray {
    public static void main(String[] args) {
        queueusingarray qu=new queueusingarray(4);
        qu.add(2);
        qu.add(3);
        qu.add(5);
        qu.remove();
        qu.remove();
        qu.add(5);
        qu.add(2);
        qu.peek();
        qu.sizeofqueue();
    }
}
