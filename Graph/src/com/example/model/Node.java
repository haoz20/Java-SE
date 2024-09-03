package com.example.model;

public class Node {
    private String name;

    public boolean equals(Node node) {
        return this.name.equals(node.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
