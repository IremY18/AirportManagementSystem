public class TestScenario {
    public static void main (String[] args) {
        PassengerList passengerList = new PassengerList();
        Passenger p1 = new Passenger(101, "İrem Yılmaz", "TK419", "First", 2);
        passengerList.addPassenger(p1);
        Passenger p2 = new Passenger(158, "Hatice Sena Açıkgöz", "TK58", "Business", 1);
        passengerList.addPassenger(p2);
        Passenger p3 = new Passenger(216, "Furkan Kaan Alkan", "TK90", "Economy", 3);
        passengerList.addPassenger(p3);
        Passenger p4 = new Passenger(161, "Buğse Sena Aydın", "TK1343", "Business", 2);
        passengerList.addPassenger(p4);
        Passenger p5 = new Passenger(312, "Mert Karagöz", "TK1323", "First", 1);
        passengerList.addPassenger(p5);

        System.out.println("\n===== TASK 1: PASSENGER LIST =====");

        System.out.println("\n=== Initial List ===");
        passengerList.printList();

        System.out.println("\n=== Removing Passenger 216 ===");
        passengerList.removePassenger(216);

        System.out.println("\n=== Searching passenger 101 ===");
        Passenger found = passengerList.findPassenger(101);
        if (found != null) {
            System.out.println("Found: " + found);
        }
        else {
            System.out.println("Passenger not found.");
        }

        System.out.println("\n=== Final List ===");
        passengerList.printList();

        System.out.println("\n===== TASK 2: BOARDING QUEUE =====");

        BoardingQueue queue = new BoardingQueue();

        queue.enqueue(new BoardingRequest(181, "TK2505", System.currentTimeMillis()));
        queue.enqueue(new BoardingRequest(183, "TK1881", System.currentTimeMillis()));
        queue.enqueue(new BoardingRequest(216, "TK53  ", System.currentTimeMillis()));
        queue.enqueue(new BoardingRequest(312, "TK589 ", System.currentTimeMillis()));
        queue.enqueue(new BoardingRequest(456, "TK102 ", System.currentTimeMillis()));
        queue.enqueue(new BoardingRequest(104, "TK25  ", System.currentTimeMillis()));
        queue.enqueue(new BoardingRequest(343, "TK489 ", System.currentTimeMillis()));
        queue.enqueue(new BoardingRequest(107, "TK90  ", System.currentTimeMillis()));

        System.out.println("\n=== Initial Queue ===");

        queue.printQueue();

        System.out.println("\nQueue size: " + queue.size());

        System.out.println("\n=== Dequeue 3 passengers ===");

        BoardingRequest processed = queue.dequeue();

        System.out.println("Processing: " + processed);

        processed = queue.dequeue();

        System.out.println("Processing: " + processed);

        processed = queue.dequeue();

        System.out.println("Processing: " + processed);

        System.out.println("\n=== Remaining Queue ===");

        queue.printQueue();

        System.out.println("\nQueue size: " + queue.size());
    }
}
