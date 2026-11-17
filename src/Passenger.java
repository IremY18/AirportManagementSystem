public class Passenger {

    private int passengerID;
    private String name;
    private String flightNumber;
    private String ticketClass;
    private int boardingGroup;

    // Getters


    public int getPassengerID() {
        return passengerID;
    }

    public String getName() {
        return name;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public int getBoardingGroup() {
        return boardingGroup;
    }

    //Constructor
    public Passenger(int passengerID, String name, String flightNumber, String ticketClass, int boardingGroup) {

        this.passengerID = passengerID;
        this.name = name;
        this.flightNumber = flightNumber;
        this.ticketClass = ticketClass;
        this.boardingGroup = boardingGroup;
    }

    //Overriding the toString method makes it easier to print passenger information

    @Override

    public String toString() {
        return "ID: " + passengerID + "  |  Name: " + name + "  |  Flight: " + flightNumber + "  |  Class: " + ticketClass + "  |  Group: " + boardingGroup;
    }
}
