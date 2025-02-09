package com.myclass.leetcode;

import java.util.List;
import java.util.ArrayList;

/**
 * LeetCode 94 - Binary Tree Inorder Traversal
 * 
 * Given the root of a binary tree, return the inorder traversal of its nodes'
 * values.
 * 
 * Problem Statement:
 * - Input: root = [1,null,2,3]
 * - Output: [1,3,2]
 * 
 * Approach:
 * - Use recursive inorder traversal (left -> root -> right)
 * - Store values in list during traversal
 * 
 * Time Complexity: O(N) where N is number of nodes
 * Space Complexity: O(N) for recursive call stack
 * 
 * @author Vikas Singh
 * @since February 09, 2024
 * @see https://leetcode.com/problems/binary-tree-inorder-traversal/
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}

public class L094_InorderTraversal {
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
        List<Integer> result = solution.inorderTraversal(root);
        System.out.println("Result: " + result);
    }
}