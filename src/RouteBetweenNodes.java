import java.util.LinkedList;

/**
 *
 * Given a directed graph, design an algorithm to find out whether there is a route between
 * two nodes.
 *
 * Can be done by a simple graph traversal, such as DFS or BFS.
 * Created by neilbarooah on 18/09/16.
 */
public class RouteBetweenNodes {

    enum State {Unvisited, Visited, Visiting};

    boolean search(Graph g, Node start, Node end) {
        if (start == end) {
            return true;
        }

        // operates as a queue
        LinkedList<Node> q = new LinkedList<Node>();
        for (Node u : g.getNodes()) {
            u.state = State.Unvisited;
        }
        start.state = State.Visiting;
        q.add(start);
        Node u;
        while (!q.isEmpty()) {
            u = q.removeFirst();  // dequeue()
            if (u != null) {
                for (Node v : u.getAdjacent()) {
                    if (v.state == State.Unvisited) {
                        if (v == end) {
                            return true;
                        } else {
                            v.state = State.Visiting;
                            q.add(v);
                        }
                    }
                }
                u.state = State.Visited;
            }
        }
        return false;
    }



}
