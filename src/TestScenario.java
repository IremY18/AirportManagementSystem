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
    }
}
