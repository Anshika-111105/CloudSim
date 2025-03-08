import java.util.PriorityQueue;

class Event implements Comparable<Event> {
    long timestamp;
    String type;

    public Event(long timestamp, String type) {
        this.timestamp = timestamp;
        this.type = type;
    }

    @Override
    public int compareTo(Event other) {
        return Long.compare(this.timestamp, other.timestamp);
    }
}

class SimulationManager {
    private PriorityQueue<Event> eventQueue = new PriorityQueue<>();

    public void addEvent(Event event) {
        eventQueue.add(event);
    }

    public void runSimulation() {
        while (!eventQueue.isEmpty()) {
            Event event = eventQueue.poll();
            System.out.println("Processing event: " + event.type + " at " + event.timestamp);
            // Handle event processing logic here
        }
    }
}
