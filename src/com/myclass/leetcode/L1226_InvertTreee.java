package com.myclass.leetcode;

/**
 * LeetCode 226 - Invert Binary Tree
 * 
 * Given the root of a binary tree, invert the tree, and return its root.
 * Inverting a binary tree means swapping every left and right child.
 * 
 * Problem Statement:
 * - Input: root = [4,2,7,1,3,6,9]
 * - Output: [4,7,2,9,6,3,1]
 * 
 * Example:
 *      4                 4
 *    /   \     =>     /   \
 *   2     7          7     2
 *  / \   / \        / \   / \
 * 1   3 6   9      9   6 3   1
 * 
 * Time Complexity: O(N) where N is number of nodes
 * Space Complexity: O(H) where H is height of tree due to recursion stack
 * 
 * @author Vikas Singh
 * @since February 09, 2025
 * @see https://leetcode.com/problems/invert-binary-tree/
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {        
        if(root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root; 
    }
}
public class L1226_InvertTreee {
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
            Solution solution = new Solution();
            System.out.println("Result: " + solution.invertTree(root));
        }
    }
}