package retoseguridad;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
 
/*import com.raidentrance.graphs.Edge;
import com.raidentrance.graphs.Graph;
import com.raidentrance.graphs.Node;
import com.raidentrance.map.MapBuilder;*/

public class GraphExampleApplication {
    private Graph graph;
 
    public GraphExampleApplication() {
        graph = MapBuilder.getGraph();
    }
 
    private Optional getNode(String city) {
        List nodes = graph.getNodes();
        for (Node node : nodes) {
            if (node.getCity().equals(city)) {
                return Optional.of(node);
            }
        }
        return Optional.empty();
    }
 
    public boolean hasPathDfs(String source, String destination) {
        Optional start = getNode(source);
        Optional end = getNode(destination);
        if (start.isPresent() && end.isPresent()) {
            return hasPathDfs(start.get(), end.get(), new HashSet());
        } else {
            return false;
        }
    }
 
    private boolean hasPathDfs(Node source, Node destination, HashSet visited) {
        if (visited.contains(source.getCity())) {
            return false;
        }
        visited.add(source.getCity());
        if (source == destination) {
            return true;
        }
        for (Edge edge : source.getAdjacents()) {
            if (hasPathDfs(edge.getDestination(), destination, visited)) {
                return true;
            }
        }
        return false;
    }
}
