package com.myclass.leetcode;

/**
 * LeetCode 101 - Symmetric Tree
 * 
 * Given the root of a binary tree, check whether it is a mirror of itself
 * (i.e., symmetric around its center).
 * 
 * Problem Statement:
 * - Input: root = [1,2,2,3,4,4,3]
 * - Output: true
 * - Explanation: The tree is symmetric around its center
 * 
 * Time Complexity: O(N) where N is number of nodes
 * Space Complexity: O(H) where H is height of tree due to recursion stack
 * 
 * @author Vikas Singh
 * @since February 09, 2025
 * @see https://leetcode.com/problems/symmetric-tree/
 */
class Solution {
    public boolean isSameTree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        return (root1.val == root2.val) && isSameTree(root1.left, root1.right) && isSameTree(root2.left, root2.right);
    }
}

public class L101_SymmetricTree {
    public static void run() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Solution sol = new Solution();
        System.out.println(sol.isSameTree(root, root));
    }
}