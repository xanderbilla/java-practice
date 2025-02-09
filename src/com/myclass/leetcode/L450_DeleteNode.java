package com.myclass.leetcode;

/**
 * LeetCode 450 - Delete Node in a Binary Search Tree
 * 
 * Given a Binary Search Tree (BST) and a key value, delete the node with given
 * key
 * from the BST and return the root node reference.
 * 
 * Problem Statement:
 * - Input: root = [3,9,20,null,null,15,7], key = 7
 * - Output: [3,9,20,null,null,15]
 * 
 * The deletion must maintain the properties of a BST where:
 * - Left subtree contains only nodes less than the root
 * - Right subtree contains only nodes greater than the root
 * - Both left and right subtrees must also be BSTs
 * 
 * Time Complexity: O(H) where H is height of tree
 * Space Complexity: O(H) for recursion stack
 * 
 * @author Vikas Singh
 * @since February 09, 2025
 * @see https://leetcode.com/problems/delete-node-in-a-bst/
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            // No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // single child
            if (root.left == null || root.right == null) {
                return root.left != null ? root.left : root.right;
            }

            // Two child
            int min = findMin(root.right);
            root.val = min;
            root.right = deleteNode(root.right, min);
        }
        return root;
    }

    public int findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }
}

public class L450_DeleteNode {
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
        solution.deleteNode(root, 7);
        // System.out.println("Result: " + solution.prodOfTree(root));
    }
}