package com.myclass.leetcode;

import java.util.List;
import java.util.ArrayList;

/**
 * LeetCode 102 - Binary Tree Level Order Traversal
 * 
 * Given the root of a binary tree, return the level order traversal of its nodes' values.
 * (i.e., from left to right, level by level).
 * 
 * Problem Statement:
 * - Input: root = [3,9,20,null,null,15,7]
 * - Output: [[3],[9,20],[15,7]]
 * 
 * Time Complexity: O(N) where N is number of nodes
 * Space Complexity: O(N) due to the result list storing all nodes
 * 
 * @author Vikas Singh  
 * @since February 09, 2025
 * @see https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
class Solution {
    public void levelOrderSol(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) {
            return;
        }
        
        if (res.size() <= level) {
            res.add(new ArrayList<>());
        }

        res.get(level).add(root.val);

        levelOrderSol(root.left, level + 1, res);
        levelOrderSol(root.right, level + 1, res);
    }

    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        levelOrderSol(root, 0, res);
        return res;
    }
}

public class L102_LevelOrder { 
    public static void run() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        
        Solution sol = new Solution();
        System.out.println(sol.levelOrder(root));
    }
}