public class Node {

    //The data carried by the node
    Passenger passenger;
    //Reference pointing to the next node
    Node next;

    public Node(Passenger passenger) {
        this.passenger = passenger;
        //The next node is null by default
        this.next = null;
    }
}
