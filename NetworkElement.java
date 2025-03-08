import java.util.*;

class NetworkElement {
    int id;
    Map<Integer, Integer> latencyMap = new HashMap<>();

    public NetworkElement(int id) {
        this.id = id;
    }

    public void addLink(int targetId, int latency) {
        latencyMap.put(targetId, latency);
    }

    public int getLatency(int targetId) {
        return latencyMap.getOrDefault(targetId, Integer.MAX_VALUE);
    }
}
