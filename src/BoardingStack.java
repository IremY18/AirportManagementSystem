public class BoardingStack {
    private class RecordNode {
        //The data carried by the node
        BoardingRecord record;
        //Reference pointing to the next node
        RecordNode next;

        public RecordNode(BoardingRecord record) {
            this.record = record;
            this.next = null;
        }
    }

    private RecordNode top;
    private int size;

    public BoardingStack() {
        top = null;
        size = 0;
    }

    public void push(BoardingRecord record) {
        RecordNode newNode = new RecordNode(record);

        newNode.next = top;
        top = newNode;

        size++;
    }

    public BoardingRecord pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }

        BoardingRecord removed = top.record;

        top = top.next;

        size--;

        return removed;
    }

    public BoardingRecord peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }
        return top.record;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }

        RecordNode current = top;

        while (current != null) {
            System.out.println(current.record);
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
