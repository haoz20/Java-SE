package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Edge> edges;

    public Graph() {
        this.edges = new ArrayList<>();
    }

    public List<Node> getChild(Node node) {
        List<Node> children = new ArrayList<>();
        for (Edge edge : this.edges) {
            if ((edge.startNode.equals(node))) {
                children.add(edge.endNode);
            }
        }
        return children;
    }


}
