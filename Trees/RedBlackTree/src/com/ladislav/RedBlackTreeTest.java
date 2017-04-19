package com.ladislav;

import static org.junit.Assert.assertTrue;

/**
 * Created by Ladislav on 4/19/2017.
 */

public class RedBlackTreeTest {
    @org.junit.Test
    public void checkPaths() throws Exception {

        RedBlackTree<Integer, String> tree = new RedBlackTree<>();

        // If tree is empty, returns true
        assertTrue(tree.checkPaths());

        //With one node 2 paths with two black links (root and 2 nulls)
        tree.put(20, "Red");
        assertTrue(tree.checkPaths());

        // With two nodes, node 27 is root(black), 20 is red (3 paths with 2 black links each)
        tree.put(27, "Black");
        assertTrue(tree.checkPaths());

        // With three black nodes, 20 is root (4 paths with 3 black links each)
        tree.put(17, "Tree");
        assertTrue(tree.checkPaths());

        //With 4  nodes, 20 is root, 15 is red (5 paths with 3 black links each)
        tree.put(15, "Two");
        assertTrue(tree.checkPaths());

        //With 5 nodes, 20 is root, 27 becomes red, (6 paths, 3 black links each)
        tree.put(34, "Three");

        //With 6 nodes, 20 is root, subtree rearranged, 5 added to the left (7 paths, 3 black links each)
        assertTrue(tree.checkPaths());
        tree.put(5, "Tree");

    }

}