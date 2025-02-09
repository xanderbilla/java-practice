package com.myclass.leetcode;

/**
 * LeetCode 129 - Sum Root to Leaf Numbers
 * 
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path 
 * could represent a number. Calculate the total sum of all root-to-leaf numbers.
 * 
 * Problem Statement:
 * - Input: [1,2,3]  
 *     1
 *    / \
 *   2   3
 * - Output: 25 (The root-to-leaf path 1->2 represents the number 12, 
 *   and path 1->3 represents 13. Therefore, sum = 12 + 13 = 25)
 * 
 * Time Complexity: O(N) where N is number of nodes
 * Space Complexity: O(H) where H is height of tree due to recursion stack
 * 
 * @author Vikas Singh 
 * @since February 09, 2025
 * @see https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        return sumNumbersSol(root, 0);
    }

    public int sumNumbersSol(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return sumNumbersSol(root.left, sum) + sumNumbersSol(root.right, sum);
    }
}

public class L129_SumLeaf {
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
        int result = solution.sumNumbers(root);
        System.out.println("Result: " + result);
    }
}