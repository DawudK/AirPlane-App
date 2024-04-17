package AirPlane;

import java.util.ArrayDeque;

public class DisembarkingStack {
    private ArrayDeque<Passenger> stack;

    public DisembarkingStack() {
        this.stack = new ArrayDeque<>();
    }

    /**
     * Adds them to the disembarking stack.
     * Using a stack makes leaving the plane easy as the first person on is the last person off,
     * making people at the front of the plane get off first.
     * This constant-time push operation ensures an efficient use of memory.
     */
    public void pushInteractive() {// used to add passengers to the stack
        Passenger passenger = Passenger.createPassenger();
        stack.push(passenger);
        System.out.println("Added " + passenger.getName() + " to the disembarking stack!");
        displayStack();
    }

    /**
     * Grabs the first passenger from the top of the stack.
     * Displays the current disembarking stack, so passengers can see who's leaving first.
     * This constant-time pop operation ensures an efficient disembarking process with minimal memory usage.
     */
    public void popInteractive() {// shows if the stack is empty or pops current passengers and displays it to the user
        if (isEmpty()) {
            System.out.println("Disembarking stack is empty!");
        } else {
            Passenger nextPassenger = stack.pop();
            System.out.println("Leaving: " + nextPassenger.getName() + " from seat " + nextPassenger.getSeat());
            displayStack();
        }
    }

    /**
     * Shows who's in the stack right now.
     * letting passengers know who's leaving first.
     * This data structure optimally uses memory, making a space-efficient solution for the queue.
     */
    public void displayStack() {// shows the stack to the user or tells if it is empty
        if (isEmpty()) {
            System.out.println("Disembarking stack is empty!");
        } else {
            System.out.println("Current Disembarking Stack:");
            for (Passenger passenger : stack) {
                System.out.println(passenger.getName() + " - Seat: " + passenger.getSeat());
            }
        }
    }

    /**
     * Checks if the disembarking stack is empty.
     */
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
