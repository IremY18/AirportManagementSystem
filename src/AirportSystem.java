public class AirportSystem {

    private PassengerList passengerList;
    private BoardingQueue boardingQueue;
    private BoardingStack boardingStack;

    public AirportSystem() {
        this.passengerList = new PassengerList();
        this.boardingQueue = new BoardingQueue();
        this.boardingStack = new BoardingStack();
    }

    public void addPassenger(Passenger passenger) {
        passengerList.addPassenger(passenger);
        System.out.println("Added passenger: " + passenger);
    }

    public void addBoardingRequest(BoardingRequest request) {
        boardingQueue.enqueue(request);
        System.out.println("Added request: " + request);
    }

    public void addBoardingRecord(BoardingRecord record) {
        boardingStack.push(record);
        System.out.println("Added record: " + record);
    }

    public void processBoardingRequest() {
        BoardingRequest request = boardingQueue.dequeue();
        if (request == null) {
            return;
        }

        Passenger found = passengerList.findPassenger(request.getPassengerID());

        if (found != null) {
            BoardingRecord record = new BoardingRecord(request.getPassengerID(), request.getFlightNumber(), System.currentTimeMillis());
            addBoardingRecord(record);
            System.out.println("Processed: " + found);
        } else {
            System.out.println("Passenger not found!");
        }
    }

    public void printPassengers() {
        System.out.println("\n=== Passengers ===");
        passengerList.printList();
    }

    public void printQueue() {
        System.out.println("\n=== Queue ===");
        boardingQueue.printQueue();
    }

    public void printStack() {
        System.out.println("\n=== Stack ===");
        boardingStack.printStack();
    }

    public void sortPassengersByTicketClass() {
        passengerList.sortByTicketClass();
    }

    public void printSystemState() {
        printPassengers();
        printQueue();
        printStack();
    }
}
