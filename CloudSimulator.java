public class CloudSimulator {
    public static void main(String[] args) {
        SimulationManager simulationManager = new SimulationManager();
        
        // Example: Add some simulation events
        simulationManager.addEvent(new Event(100, "VM Allocation"));
        simulationManager.addEvent(new Event(200, "Task Scheduling"));

        // Run the simulation
        simulationManager.runSimulation();
    }
}
