package org.example;

/**
 * This class serves the driver program for showing
 * the use of the Node and Squirrel classes to construct and
 * interact with a simple binary tree.
 */
public class App {

    /**
     * The main method creates Squirrel and Node objects,
     * attaches the nodes as left and right children, and
     * prints the names of the left and right child squirrels
     * of the root node.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create Squirrel objects with names
        Squirrel cheeks = new Squirrel("Cheeks");
        Node nodeOne = new Node(cheeks);

        Squirrel squeaks = new Squirrel("Squeaks");
        Node nodeTwo = new Node(squeaks);

        Squirrel fluffybutt = new Squirrel("Mr. Fluffy Butt");
        Node nodeThree = new Node(fluffybutt);

        // Attach nodeTwo as the left child and nodeThree as the right child of nodeOne
        nodeOne.set_left(nodeTwo);
        nodeOne.set_right(nodeThree);

        // Retrieve the left and right children of nodeOne
        Node retrievedLeft = nodeOne.left();
        Node retrievedRight = nodeOne.right();

        // Print the names of the left and right children
        System.out.println(retrievedLeft.getData().getName());
        System.out.println(retrievedRight.getData().getName());
    }
}
