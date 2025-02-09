package com.myclass.leetcode;

import java.util.List;

/**
 * LeetCode 1752 - Check if Array Is Sorted and Rotated
 * 
 * Given an array nums, return true if the array was originally sorted in non-decreasing order, 
 * then rotated some number of positions (including zero). Otherwise, return false.
 *
 * Problem Statement:
 * - Input: nums = [3,4,5,1,2]
 * - Output: true
 * - Explanation: [1,2,3,4,5] is the original sorted array.
 * You can rotate the array by x = 3 positions to begin on the element of value 3: [3,4,5,1,2]
 * 
 * Time Complexity: O(N) where N is length of input array
 * Space Complexity: O(1)
 * 
 * @author Vikas Singh
 * @since February 09, 2025
 * @see https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 */
class Solution {
    public boolean check(List<Integer> nums) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > nums.get((i + 1) % nums.size())) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    };
}

public class L1752_SortedRotated {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> nums = List.of(3, 4, 5, 1, 2, 9);
        System.out.println(solution.check(nums));   // Output: true
    }
}