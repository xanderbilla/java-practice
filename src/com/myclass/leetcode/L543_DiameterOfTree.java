package com.myclass.leetcode;

/**
 * LeetCode 543 - Diameter of Binary Tree
 * 
 * Given the root of a binary tree, returns the length of the diameter of the
 * tree.
 * The diameter of a binary tree is the length of the longest path between any
 * two nodes in a tree.
 * This path may or may not pass through the root.
 * 
 * Example:
 *                  1
 *                 / \
 *                2   3
 *               / \
 *              4   5
 * 
 * Output: 3 (Path: 4->2->1->3 or 5->2->1->3)
 * 
 * Time Complexity: O(n), where n is the number of nodes in the tree
 * Space Complexity: O(h), where h is the height of the tree (due to recursion
 * stack)
 * 
 * @author Vikas Singh
 * @since February 09, 2025
 * @See https://leetcode.com/problems/diameter-of-binary-tree/
 */
class Solution {
    public static int diameterOfBinaryTree(TreeNode root){
        return 0;
    }
}

/**
 * Main class for LeetCode #543: Diameter of Binary Tree solution
 */
public class L543_DiameterOfTree {
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
        System.out.println("Result: " + Solution.diameterOfBinaryTree(root));
    }
}

