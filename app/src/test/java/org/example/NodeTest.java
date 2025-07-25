package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * This class contains unit tests for the Node class.
 */
public class NodeTest {

    /**
     * Tests that a Node correctly stores a Squirrel object
     * and the stored data can be retrieved using getData().
     */
    @Test
    void testNodeStoresSquirrelData() {
        Squirrel squirrel = new Squirrel("Cheeks");
        Node node = new Node(squirrel);
        assertEquals("Cheeks", node.getData().getName());
    }

    /**
     * Tests that a left child node can be attached to a parent node,
     * and that the left child can be retrieved correctly.
     */
    @Test
    void testLeftChildAttachment() {
        Squirrel parentSquirrel = new Squirrel("Cheeks");
        Squirrel leftSquirrel = new Squirrel("Squeaks");
        Node parent = new Node(parentSquirrel);
        Node leftChild = new Node(leftSquirrel);
        parent.set_left(leftChild);
        assertEquals("Squeaks", parent.left().getData().getName());
    }

    /**
     * Tests that a right child node can be attached to a parent node,
     * and that the right child can be retrieved correctly.
     */
    @Test
    void testRightChildAttachment() {
        Squirrel parentSquirrel = new Squirrel("Cheeks");
        Squirrel rightSquirrel = new Squirrel("Mr. Fluffy Butt");
        Node parent = new Node(parentSquirrel);
        Node rightChild = new Node(rightSquirrel);
        parent.set_right(rightChild);
        assertEquals("Mr. Fluffy Butt", parent.right().getData().getName());
    }

    /**
     * Tests that a newly created node with no children
     * returns null for both left() and right() methods.
     */
    @Test
    void testLeafNodeHasNoChildren() {
        Squirrel squirrel = new Squirrel("Squeaks");
        Node node = new Node(squirrel);
        assertNull(node.left());
        assertNull(node.right());
    }
}