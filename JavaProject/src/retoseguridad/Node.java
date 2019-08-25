package retoseguridad;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String city;
    private List adjacents = new ArrayList();
 
    public Node(String city) {
        this.city = city;
    }
 
    public void addEdge(Edge edge) {
        adjacents.add(edge);
    }
 
    public List getAdjacents() {
        return adjacents;
    }
 
    public String getCity() {
        return city;
    }
 
    @Override
    public String toString() {
        return "Node [city=" + city + ", adjacents=" + adjacents + "]";
    }
}
