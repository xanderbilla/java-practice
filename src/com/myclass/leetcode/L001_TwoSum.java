package com.myclass.leetcode;

/**
 * LeetCode 1 - Two Sum
 * 
 * Given an array of integers nums and an integer target, this method finds two numbers in the array
 * that add up to the target and returns their indices.
 * 
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: nums[0] + nums[1] = 2 + 7 = 9
 * 
 * Time Complexity: O(n^2) where n is the length of input array
 * Space Complexity: O(1) as we only use a fixed-size array of 2 elements * 
 * 
 * @author Vikas Singh
 * @since February 09, 2025
 * @See https://leetcode.com/problems/two-sum/
 */
class Solution {
    /**
     * Finds two numbers in the array that add up to the target and returns their indices.
     *
     * @param nums   Array of integers
     * @param target Target sum to find
     * @return Array containing indices of the two numbers that sum to target
     * @Time Complexity: O(n^2) where n is the length of input array
     * @Space Complexity: O(1) as we only use a fixed-size array of 2 elements
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}

/**
 * Test class for Two Sum problem
 */
/**
 * Test class for the Two Sum problem solution.
 * Contains main method with multiple test cases to verify the functionality.
 */
public class L001_TwoSum {
    public static void main(String[] args) {
        // Create instance of Solution class
        Solution solution = new Solution();
        
        // Test cases
        runTestCase(solution, new int[]{2, 7, 11, 15}, 9, 1);
        runTestCase(solution, new int[]{3, 2, 4}, 6, 2);
        runTestCase(solution, new int[]{3, 3}, 6, 3);
    }
    
    /**
     * Helper method to run a test case and print results
     * @param solution Solution instance
     * @param nums Input array
     * @param target Target sum
     * @param caseNumber Test case number
     */
    private static void runTestCase(Solution solution, int[] nums, int target, int caseNumber) {
        int[] result = solution.twoSum(nums, target);
        System.out.printf("Test Case %d: [%d,%d]%n", caseNumber, result[0], result[1]);
    }
}