public class BoardingRequest {

    private int passengerID;
    private String flightNumber;
    private long requestTime;

    //Getters
    public int getPassengerID() {
        return passengerID;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public long getRequestTime() {
        return requestTime;
    }

    //Constructor
    public BoardingRequest(int passengerID, String flightNumber, long requestTime) {
        this.passengerID = passengerID;
        this.flightNumber = flightNumber;
        this.requestTime = requestTime;
    }

    @Override

    public String toString() {
        new java.util.Date(requestTime);
        return "ID: " + passengerID + "  |  Flight: " + flightNumber + "  |  Time: " + new java.util.Date(requestTime);

    }

}
