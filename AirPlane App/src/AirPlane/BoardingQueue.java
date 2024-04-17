package AirPlane;

import java.util.LinkedList;

public class BoardingQueue {
    private LinkedList<Passenger> queue;

    public BoardingQueue() {
        this.queue = new LinkedList<>();
    }

    /**
     * This method is using queues in order to demonstrate a first come, first served type of line
     * Using a queue keeps the boarding process organized, reducing clutter and utilizing space efficiently.
     * It's like forming a line, Quick and efficient, just what we need.
     * This constant-time enqueue operation ensures an efficient use of memory.
     */
    public void enqueueInteractive() {// shows what is added to the queue
        Passenger passenger = Passenger.createPassenger();
        queue.addLast(passenger);
        System.out.println("Added " + passenger.getName() + " to the boarding queue!");
        displayQueue();
    }

    /**
     * Takes the first passenger from the queue.
     * Quick and simple, just like boarding a plane should be.
     * Displays the current state of the boarding queue, so passengers know who's up next.
     * This constant-time dequeue operation ensures an efficient boarding process with minimal memory usage.
     */
    public void dequeueInteractive() {// shows if its empty or shows who is boarding
        if (isEmpty()) {
            System.out.println("Boarding queue is empty!");
        } else {
            Passenger nextPassenger = queue.removeFirst();
            System.out.println("Boarding " + nextPassenger.getName() + " at seat " + nextPassenger.getSeat());
            displayQueue();
        }
    }

    /**
     * Shows who's in the boarding queue right now.
     * Passengers can see if their turn is coming up.
     * This data structure optimally uses memory, making a space-efficient solution for the queue.
     */
    public void displayQueue() {// shows the queue to the user
        if (isEmpty()) {
            System.out.println("Boarding queue is empty!");
        } else {
            System.out.println("Current Boarding Queue:");
            for (Passenger passenger : queue) {
                System.out.println(passenger.getName() + " - Seat: " + passenger.getSeat());
            }
        }
    }

    /**
     * Checks if the boarding queue is empty.
     * efficient queue management with minimal memory.
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
