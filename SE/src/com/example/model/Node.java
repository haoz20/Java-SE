package com.example.model;

public class Node {
    private String name;
    private Node[] nodes;
    private int childNodeCount = 0;

    public Node (String name) {
        this.name = name;
    }

    public void addNode(Node node) {
        this.nodes[childNodeCount] = node;
        childNodeCount++;
    }


}
