public class PassengerList {

    //Starting point of the list
    private Node head;

    public PassengerList() {
        //The list is empty initially
        this.head = null;
    }

    //Add passenger
    public void addPassenger(Passenger pass) {
        Node newNode = new Node(pass);
        //If the list is empty, new node becomes the head
        if (head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            //Traverse to the last node

            while (current.next != null) {
                current = current.next;
            }

            //Link the new node at the end
            current.next = newNode;
        }
    }

    //Remove passenger by ID
    public void removePassenger(int id) {
        if (head == null) {
            return;
        }

        //If the head node is the one to be removed
        if (head.passenger.getPassengerID() == id) {
            head = head.next;
            return;
        }

        Node current = head;

        //Traverse to find the node right before the one we want to remove
        while (current.next != null && current.next.passenger.getPassengerID() != id) {
            current = current.next;
        }

        //If we found the passenger, bypass the node to remove it
        if (current.next != null) {
            current.next = current.next.next;
        }
        else{
            System.out.println("Passenger with ID " + id + " not found.");
        }
    }

    //Find passenger by ID
    public Passenger findPassenger(int id) {
        Node current = head;

        //Traverse the list to find the matching ID
        while (current != null) {
            if (current.passenger.getPassengerID() == id) {
                return current.passenger;
            }
            current = current.next;
        }
        //Passenger not found
        return null;
    }

    //Print all passengers in the list
    public void printList() {
        Node current = head;

        if (current == null) {
            System.out.println("Passenger list is empty.");
            return;
        }

        while (current != null) {
            System.out.println(current.passenger.toString());
            current = current.next;
        }
    }

    // ==== TASK 4 ====

    private int getClassPriority(String ticketClass) {
        if (ticketClass.equalsIgnoreCase("First")) {
            return 1;
        }
        if (ticketClass.equalsIgnoreCase("Business")) {
            return 2;
        }
        if (ticketClass.equalsIgnoreCase("Economy")) {
            return 3;
        }
        return 999;
    }

    public void sortByTicketClass() {
        if(head == null || head.next == null) {
            return;
        }

        boolean swapped;

        do {
            swapped = false;
            Node current = head;
            while (current.next != null) {

                if (getClassPriority(current.passenger.getTicketClass()) > getClassPriority(current.next.passenger.getTicketClass())) {
                    Passenger temp = current.passenger;
                    current.passenger = current.next.passenger;
                    current.next.passenger = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }
}
