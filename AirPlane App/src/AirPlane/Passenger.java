package AirPlane;

import java.util.Scanner;

public class Passenger {
    private String name;
    private String seat;

    public Passenger(String name, String seat) {
        this.name = name;
        this.seat = seat;
    }

    //method to create a new Passenger
    public static Passenger createPassenger() {// prompts the user for the passenger name and seat number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter passenger name: ");
        String name = scanner.nextLine();
        System.out.println("Enter seat number: ");
        String seat = scanner.nextLine();
        return new Passenger(name, seat);
    }

    public String getName() {
        return name;
    }

    public String getSeat() {
        return seat;
    }
}
