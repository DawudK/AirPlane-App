package AirPlane;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AirplaneBoardingApp {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {// main method implementing queue and stack and passenger
        Pair.myHeader(5);

        // Instances of the boarding que and disembarking stack
        BoardingQueue boardingQueue = new BoardingQueue();
        DisembarkingStack disembarkingStack = new DisembarkingStack();

        boolean exit = false;

        while (!exit) {
            try {// gives the user the menu to pick if they are boarding or disembarking
                System.out.println("Main Menu: \n1. Boarding\n2. Disembarking\n3. Exit");
                System.out.println("Enter your choice: ");

                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        boardingMenu(boardingQueue);
                        break;
                    case 2:
                        disembarkingMenu(disembarkingStack);
                        break;
                    case 3:
                        exit = true;
                        System.out.println("Goodbye!");
                        break;
                    default:// makes the user enter and actual option from the menu
                        System.out.println("Invalid choice! Please enter a number between 1 and 3.");
                        break;
                }
            } catch (InputMismatchException e) {
                input.nextLine(); // catches the invalid input and asks the user to pick a number
                System.out.println("Invalid input! Please enter a number between 1 and 3.");
            }
        }

        Pair.myFooter(5);
    }

    private static void boardingMenu(BoardingQueue boardingQueue) throws InputMismatchException {
        boolean boardingExit = false;
        while (!boardingExit) {
            // gives the user a menu to pick from one of the options
            System.out.println("Boarding Menu: \n1. Enqueue Passenger\n2. Dequeue Passenger\n3. Display Boarding Queue\n4. Back to Main Menu");
            System.out.println("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    boardingQueue.enqueueInteractive();
                    break;
                case 2:
                    boardingQueue.dequeueInteractive();
                    break;
                case 3:
                    boardingQueue.displayQueue();
                    break;
                case 4:
                    boardingExit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                    break;
            }
        }
    }

    private static void disembarkingMenu(DisembarkingStack disembarkingStack) {
        boolean disembarkingExit = false;
        while (!disembarkingExit) {
            try {// gives the user the menu to pick from
                System.out.println("Disembarking Menu: \n1. Push Passenger\n2. Pop Passenger\n3. Display Disembarking Stack\n4. Back to Main Menu");
                System.out.println("Enter your choice: ");

                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        disembarkingStack.pushInteractive();
                        break;
                    case 2:
                        disembarkingStack.popInteractive();
                        break;
                    case 3:
                        disembarkingStack.displayStack();
                        break;
                    case 4:
                        disembarkingExit = true;
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                        break;
                }
            } catch (InputMismatchException e) {
                input.nextLine(); // catches the invalid input and asks the user to pick a number
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
            }
        }
    }
}
