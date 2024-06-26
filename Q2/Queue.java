package Q1;

public class Queue {
    int front;
    int rear;
    int maxSize
            ;
    PatronReq[] queue;
    int count;
    Queue(int size) {
        maxSize = size;
        queue = new PatronReq[maxSize];
        front = 0;
        rear =
                -1;
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

    void Append(PatronReq item)
    {
        if (IsQueueFull())
        {
            System.out.printf("\nQueue is full\n");
        }
        else {
            queue[++rear] = item;
            count++;
        }
    }

    PatronReq Serve() {
        if (IsQueueEmpty()) {
            System.out.printf("\nQueue is empty\n");
            return null;
        }
        else {
            PatronReq x = queue[front++];
            count--;
            return x;
        }
    }



}
