package Q1;

public class Queue {
    int front;
    int rear;
    int maxSize
            ;
    Order[] queue;
    int count;
    Queue(int size) {
        maxSize = size;
        queue = new Order[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    boolean IsQueueEmpty() {
        if (rear<front )
            return true;
        else
            return false;
    }

    boolean IsQueueFull() {
        if (rear == maxSize - 1) {
            return true;
        }
        return false;
    }

    void Append(Order item)
    {
        if (IsQueueFull())
        {
            System.out.printf("\nQueue is full\n");
        }
        else {
            System.out.println("x");
            queue[++rear] = item;
            count++;
        }
    }

    Order Serve() {
        if (IsQueueEmpty()) {
            System.out.printf("\nQueue is empty\n");
            return null;
        }
        else {
            Order x = queue[front++];
            count--;
            return x;
        }
    }

    int queueSize(){
        return count;
    }

}
