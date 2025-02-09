package com.myclass.learn_dsa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * A class representing a tree data structure.
 * 
 * This class provides the basic framework for implementing tree-based
 * operations
 * and algorithms. Trees are hierarchical data structures consisting of nodes
 * connected by edges.
 * 
 * @author Vikas Singh
 * @version 1.0
 * @since 09 February, 2025
 * 
 */

/**
 * The TreeNode class represents a node in a binary tree data structure.
 * Each node contains an integer value and references to its left and right child nodes.
 */
/**
 * The integer value stored in this node.
 */
/**
 * Reference to the left child node.
 */
/**
 * Reference to the right child node.
 */
/**
 * Default constructor that creates an empty TreeNode.
 */
/**
 * Constructor that initializes a TreeNode with a specified value.
 * @param val The integer value to be stored in the node
 */
/**
 * Constructor that initializes a TreeNode with a value and child nodes.
 * 
 * @param val   The integer value to be stored in the node
 * @param left  Reference to the left child node
 * @param right Reference to the right child node
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

/**
 * Solution class containing methods for binary tree operations.
 * This class provides functionality to do operations on a binary tree
 * structure.
 */
class Solution {
    /**
     * The root node of the tree structure.
     * This private field serves as the entry point to the entire tree.
     * All tree operations start from this main root node.
     */
    private TreeNode mainRoot;

    /**
     * Performs a pre-order traversal of the binary tree starting from the given
     * root node.
     * Pre-order traversal visits the current node first, then the left subtree, and
     * finally the right subtree.
     * The traversal path is printed in the format: "node -> node -> ... -> null"
     *
     * @param root The root node from which to start the traversal. Can be null for
     *             an empty tree.
     *             If it's the main root of the tree, "null" will be printed at the
     *             end of traversal.
     * 
     *             Example:
     *             For tree: 1
     *             / \
     *             2 3
     *             Output: 1 -> 2 -> 3 -> null
     * 
     *             Time Complexity: O(n) where n is the number of nodes in the tree
     *             Space Complexity: O(h) where h is the height of the tree due to
     *             recursive call stack
     */
    public void preOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " -> ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        if (root == mainRoot) {
            System.out.println("null");
        }
    }

    /**
     * Performs an in-order traversal of the binary tree starting from the given
     * root node.
     * In-order traversal visits nodes in the following order: left subtree, root,
     * right subtree.
     * 
     * The traversal prints each node's value followed by " -> " and ends with
     * "null" when complete.
     * Uses mainRoot to track the original root for proper termination of output.
     * 
     * @param root The root node of the tree/subtree to traverse
     *             For tree:
     *             1
     *             / \
     *             2 3
     *             Output would be:
     *             Example output format: 1 -> 2 -> 3 -> null
     */
    public void inOrderTraversal(TreeNode root) {
        if (mainRoot == null)
            mainRoot = root;
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " -> ");
        inOrderTraversal(root.right);
        if (root == mainRoot) {
            System.out.println("null");
            mainRoot = null;
        }
    }

    /**
     * Performs a post-order traversal of the binary tree starting from the given
     * root node.
     * In post-order traversal, we first traverse the left subtree, then the right
     * subtree,
     * and finally visit the root node. The traversal pattern is: Left -> Right ->
     * Root
     * 
     * @param root The root node of the binary tree (or subtree) to traverse
     * 
     *             Example output format:
     *             For tree: 1
     *             / \
     *             2 3
     *             Output would be: 2 -> 3 -> 1 -> null
     * 
     *             Note: The method uses a class field 'mainRoot' to track the
     *             original root
     *             for proper null termination in the output
     */
    public void postOrderTraversal(TreeNode root) {
        if (mainRoot == null)
            mainRoot = root;
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " -> ");
        if (root == mainRoot) {
            System.out.println("null");
            mainRoot = null;
        }
    }

    /**
     * Calculates and returns the total number of nodes in the binary tree.
     * 
     * @param root The root node of the binary tree
     * @return The total count of nodes in the tree (0 if tree is empty)
     */
    public int sizeOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sizeOfTree(root.left) + sizeOfTree(root.right) + 1;
    }

    /**
     * Finds the maximum value in a binary tree recursively.
     * 
     * @param root The root node of the binary tree
     * @return The maximum value found in the tree. Returns 0 if the tree is empty
     */
    public int maxOfTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(Math.max(maxOfTree(root.left), maxOfTree(root.right)), root.val);
    }

    /**
     * Calculates the sum of all node values in a binary tree.
     * 
     * @param root The root node of the binary tree
     * @return The sum of all values in the tree. Returns 0 if tree is empty.
     * 
     *         Example:
     *         1
     *         / \
     *         2 3
     *         For this tree, it returns 6 (1 + 2 + 3)
     */
    public int sumOfTree(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return sumOfTree(root.left) + sumOfTree(root.right) + root.val;
    }

    /**
     * Calculates the height (maximum depth) of a binary tree.
     * The height is defined as the number of edges in the longest path from the
     * root node to a leaf node.
     * For an empty tree (null root), the height is 0.
     *
     * @param root The root node of the binary tree
     * @return The height of the tree. Returns 0 if the tree is empty.
     * 
     *         Time Complexity: O(n) where n is the number of nodes in the tree
     *         Space Complexity: O(h) where h is the height of the tree due to
     *         recursive call stack
     */
    public int heightOfTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }

    /**
     * Finds the minimum value in a binary tree.
     * 
     * This method traverses the entire binary tree recursively and compares each
     * node's value
     * to find the smallest value present in the tree.
     *
     * @param root The root node of the binary tree to search
     * @return The minimum value found in the tree, or Integer.MAX_VALUE if the tree
     *         is empty
     */
    public int minOfTree(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(Math.min(minOfTree(root.left), minOfTree(root.right)), root.val);
    }

    /**
     * Calculates the product of all node values in a binary tree.
     * 
     * @param root The root node of the binary tree
     * @return The product of all node values in the tree. Returns 1 if tree is
     *         empty.
     */
    public int prodOfTree(TreeNode root) {
        if (root == null) {
            return 1;
        }
        return prodOfTree(root.left) * prodOfTree(root.right) * root.val;
    }

    /**
     * Prints all nodes at a specified level in a binary tree using recursive
     * traversal.
     * Level 1 represents the root node, level 2 represents the children of root,
     * and so on.
     *
     * @param root  The root node of the binary tree (or subtree)
     * @param level The level at which nodes should be printed (1-based indexing)
     * 
     *              Example:
     *                      1          <- level 1
     *                     / \
     *                    2   3        <- level 2
     *                   /   / \
     *                  4   6   7      <- level 3
     * 
     *              printNthLevel(root, 3) would print: 4 6 7
     */
    public void printNthLevel(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.val + " ");
            return;
        }
        printNthLevel(root.left, level - 1);
        printNthLevel(root.right, level - 1);
    }

    /**
     * Performs a level-order traversal of the binary tree using a level-by-level
     * approach.
     * This implementation uses a combination of tree height calculation and
     * printing nodes at each level.
     * 
     * The method prints each level of the tree on a new line, starting from the
     * root (level 1)
     * down to the leaves. If the tree is empty (root is null), the method returns
     * without printing.
     * 
     * Time Complexity: O(n^2) where n is the number of nodes in the tree
     * Space Complexity: O(1) as no extra space is used
     * 
     * @param root The root node of the binary tree to traverse
     */
    public void levelOrderTraversal_A1(TreeNode root) {
        if (root == null) {
            return;
        }
        int height = heightOfTree(root);
        for (int i = 1; i <= height + 1; i++) {
            printNthLevel(root, i);
            System.out.println();
        }
    }

    /**
     * Performs a level-order traversal of a binary tree with line breaks between
     * levels.
     * This method prints the tree level by level, with leaf nodes handling
     * differently.
     * 
     * @param root  The root node of the binary tree to traverse
     * @param level The current level in the tree (0-based)
     * 
     *              Algorithm:
     *              1. If root is null, return
     *              2. If node is a leaf node (no children), print its value and
     *              return
     *              3. For non-leaf nodes:
     *              - Print current node value
     *              - Print a line break
     *              - Recursively traverse left subtree
     *              - Recursively traverse right subtree
     */
    public void levelOrderTraversal_A2(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (root.left == null || root.right == null) {
            System.out.print(root.val + " ");
            return;
        }
        System.out.print(root.val + " ");
        System.out.println();
        levelOrderTraversal_A2(root.left, level + 1);
        levelOrderTraversal_A2(root.right, level + 1);
    }

    /**
     * Performs a level-order traversal (breadth-first search) of a binary tree.
     * 
     * This method visits all nodes of the tree level by level, from left to right,
     * using a queue data structure to keep track of nodes to be processed.
     * 
     * @param root The root node of the binary tree to traverse
     * @throws NullPointerException if the root node is null
     * 
     * Time Complexity: O(n) where n is the number of nodes in the tree
     * Space Complexity: O(w) where w is the maximum width of the tree
     */
    public void levelOrderTraversal_A3(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
            TreeNode temp = queue.peek();
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
            System.out.println(temp.val + " ");
            queue.remove();
        }
    }

}

/**
 * A class demonstrating tree data structure implementation.
 * This class creates a binary tree with predefined nodes and provides
 * functionality to display it.
 * 
 * The tree structure is initialized with the following layout:
 *       3
 *      / \
 *     9   20
 *         / \
 *       15   7
 *
 * The class uses a static initializer block to construct the tree structure.
 * 
 * @author Vikas Singh
 * @version 1.0
 * @see TreeNode
 * @see Solution
 */
public class S4_Tree {
    private static final Solution solution = new Solution();
    private static final TreeNode root;

    static {
        root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
    }

    public static void run() {
        solution.levelOrderTraversal_A2(root, 0);
        // System.out.println("Result: " + solution.prodOfTree(root));
    }
}
