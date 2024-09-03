package com.example.service;

import com.example.model.*;

import java.util.ArrayList;
import java.util.List;

public class SearchShortestPathServce {
    private Node startNode;
    private Node endNode;
    private Graph graph;
    private List<Route> routes;

    public SearchShortestPathServce(Graph graph, Node startNode, Node endNode) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.graph = graph;
        this.routes = new ArrayList<>();
    }

    public void travelEdge(Node currentNode) {
        List<Node> children = this.graph.getChild(currentNode);

        for (Node child : children) {
            Route route = new Route();
            if (child.equals(endNode)) {
                // base case
            }else {
                travelEdge(child);
            }
        }

    }

}
