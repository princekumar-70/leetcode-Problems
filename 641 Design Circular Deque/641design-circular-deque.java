class MyCircularDeque {
    int[] queue;
    int size;
    int count ;
    int front;
    int rear;

    public MyCircularDeque(int k) {
        queue = new int[k];
        size = k;
        count =0;
        front = 0; 
        rear = -1;

        
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
       if(isEmpty()){
        front =0;
        rear = 0;
       }
       else{
        front = (front-1+size)%size;
       }
       queue[front]=value;
        count++;
        return true;
        
    }
    
  public boolean insertLast(int value) {
    if (isFull()) return false;

    if (isEmpty()) {
        front = 0;
        rear = 0;
    } else {
        rear = (rear + 1) % size;
    }

    queue[rear] = value;
    count++;
    return true;
 }

    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        if(front==rear){
            front = -1;
            rear = -1;
        }else{
            front = (front+1)%size;
        }
        count--;
        return true;

        
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        if(front==rear){
            front = -1;
            rear = -1;
        }else{
            rear = (rear-1+size)%size;
        }
        count--;
        return true;

    }
    
   public int getFront() {
      if (isEmpty()) return -1;
     return queue[front];
   }

    
    public int getRear() {
        if (isEmpty()) return -1;
        return queue[rear];

        
    }
    
    public boolean isEmpty() {
        if(count==0) return true;
        return false;
        
    }
    
    public boolean isFull() {
        if(size==count) return true;
        return false;

        
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */