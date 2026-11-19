//It is a class that works with FIFO principle
public class BoardingQueue {
    private class RequestNode {
        BoardingRequest request;
        RequestNode next;

        //Constructor
        RequestNode (BoardingRequest request) {
            this.request = request;
            this.next = null;
        }
    }
    //Front is the removal end of the queue
    private RequestNode front;
    //Rear is the end of the queue
    private RequestNode rear;
    //Size of the queue
    private int size;

    //Creates an empty queue
    public BoardingQueue() {
        front = rear = null;
        size = 0;
    }

    //It adds a request to the end of the queue
    public void enqueue(BoardingRequest request) {
        RequestNode newNode = new RequestNode(request);

        //If the queue is empty, newNode will be the first node in the queue
        if (front == null) {
            front = rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    //If the queue is empty, it will return null
    public BoardingRequest dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }

        //Because of FIFO, the request is removed from the front
        BoardingRequest removed = front.request;
        front = front.next;

        //If front became null, rear has to be null too
        if (isEmpty()) {
            rear = null;
        }
        size--;
        return removed;
    }

    //Return the number of requests in the queue
    public int size() {
        return size;
    }

    //It does not remove anything
    public void printQueue() {
        RequestNode current = front;
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        //This loop traverses the whole queue for printing it until the queue's end
        while (current != null){
            System.out.println(current.request);
            current = current.next;
        }
    }

    //It returns true if the queue has no elements
    public boolean isEmpty() {
        return front == null;
    }
}
