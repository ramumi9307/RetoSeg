package retoseguridad;

import java.util.ArrayList;
import java.util.List;
 

public class Graph {
 
    private List nodes = new ArrayList();
 
    public void addNode(Node node) {
        nodes.add(node);
    }
 
    public List getNodes() {
        return nodes;
    }
 
    @Override
    public String toString() {
        return "Graph [nodes=" + nodes + "]";
    }

    List getNodes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
