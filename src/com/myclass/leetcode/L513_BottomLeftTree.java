package com.myclass.leetcode;

import java.util.List;
import java.util.ArrayList;

/**
 * LeetCode 513 - Find Bottom Left Tree Value
 * 
 * Given the root of a binary tree, return the leftmost value in the last row of the tree.
 * 
 * Problem Statement:
 * - Input: root = [2,1,3]
 * - Output: 1
 * - Input: root = [1,2,3,4,null,5,6,null,null,7]
 * - Output: 7
 * 
 * Approach:
 * - Use level order traversal to store nodes level by level
 * - Return first element from last level
 * 
 * Time Complexity: O(N) where N is number of nodes 
 * Space Complexity: O(W) where W is maximum width of tree
 * 
 * @author Vikas Singh
 * @since February 09, 2025
 * @see https://leetcode.com/problems/find-bottom-left-tree-value/
 */
class Solution {
    public void levelOrder(TreeNode root, int level, List<List<Integer>> res){
        if(root == null) return;

        if(res.size() <= level){
            res.add(new ArrayList<>());
        }

        res.get(level).add(root.val);

        levelOrder(root.left, level +1, res);
        levelOrder(root.right, level + 1, res);
    }

    public int bottomLeft(TreeNode root) {
        if(root == null){
            return 0;
        }
        List<List<Integer>> res = new ArrayList<>();
        levelOrder(root, 0, res);
        return res.get(res.size()-1).get(0);        
    }    
}

public class L513_BottomLeftTree {
        public static void run(){
            TreeNode root = new TreeNode(2);
            root.left = new TreeNode(1);
            root.right = new TreeNode(3);
            Solution sol = new Solution();
            System.out.println(sol.bottomLeft(root));
        }
}
