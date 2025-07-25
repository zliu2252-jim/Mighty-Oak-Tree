package org.example;

/**
 * This class represents the node in a binary tree that stores the Squirrel object.
 * Each node may have a left and right child node.
 */
public class Node {
    /**
     * The Squirrel data stored in this node.
     */
    Squirrel data;
    /**
     * Reference to the left child node.
     */
    Node left;
    /**
     * Reference to the right child node.
     */
    Node right;

    /**
     * Constructs a new Node with the Squirrel data.
     * The left and right children are initially set to null.
     *
     * @param data the Squirrel object to store in this node
     */
    public Node(Squirrel data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    /**
     * Sets the left child of this node.
     *
     * @param left the node to set as the left child
     */
    public void set_left(Node left) {
        this.left = left;
    }

    /**
     * Sets the right child of this node.
     *
     * @param right the node to set as the right child
     */
    public void set_right(Node right) {
        this.right = right;
    }

    /**
     * Returns the left child of this node.
     *
     * @return the left child node, or null if none exists
     */
    public Node left() {
        return this.left;
    }

    /**
     * Returns the right child of this node.
     *
     * @return the right child node, or null if none exists
     */
    public Node right() {
        return this.right;
    }

    /**
     * Returns the Squirrel object stored in this node.
     *
     * @return the Squirrel data in this node
     */
    public Squirrel getData() {
        return data;
    }
}