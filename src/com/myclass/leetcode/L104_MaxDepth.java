package com.myclass.leetcode;

/**
 * LeetCode 104 - Maximum Depth of Binary Tree
 * 
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest 
 * path from the root node down to the farthest leaf node.
 * 
 * Problem Statement:
 * - Input: root = [3,9,20,null,null,15,7]
 * - Output: 3
 * Explanation: The binary tree has a maximum depth of 3
 *             3
 *            / \
 *           9  20
 *              / \
 *             15  7
 * 
 * Time Complexity: O(N) where N is number of nodes
 * Space Complexity: O(H) where H is height of tree
 * 
 * @author Vikas Singh
 * @since February 09, 2025
 * @see https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

}

public class L104_MaxDepth {
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
        int result = solution.maxDepth(root);
        System.out.println("Result: " + result);
    }
}
