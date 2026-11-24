public class BoardingRecord {
    private int passengerID;
    private String flightNumber;
    private long requestTime;

    // Constructor
    public BoardingRecord(int passengerID, String flightNumber, long requestTime) {
        this.passengerID = passengerID;
        this.flightNumber = flightNumber;
        this.requestTime = requestTime;
    }

    // Getters
    public int getPassengerID() {
        return passengerID;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public long getRequestTime() {
        return requestTime;
    }

    @Override
    // toString method
    public String toString() {
        return "ID: " + passengerID + "  |  Flight: " + flightNumber + "  |  Time: " + new java.util.Date(requestTime);
    }
}
