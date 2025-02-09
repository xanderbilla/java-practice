package com.myclass.learn_dsa;

import java.util.ArrayList;

/**
 * A utility class containing various recursive implementations for common mathematical operations.
 * 
 * This class provides methods to:
 * - Print natural numbers in ascending and descending order
 * - Calculate factorial of a number
 * - Generate Fibonacci numbers
 * 
 * All implementations use recursive approaches demonstrating fundamental recursive problem-solving techniques.
 * 
 * Note: Due to the recursive nature of these implementations, they may cause stack overflow
 * for very large input values.
 * 
 * @author Vikas Singh
 * @version 1.0
 * @since February 09, 2024
 */

class Solution {
    /**
     * Prints all natural numbers from 1 to the specified number using recursion.
     * The numbers are printed in ascending order using a recursive approach.
     * 
     * The method works by:
     * 1. First recursively calling itself with (n-1) until it reaches 1
     * 2. Then printing numbers while backtracking from the recursive calls
     * 
     * Time Complexity: O(n) where n is the input number
     * Space Complexity: O(n) due to recursive call stack
     * 
     * @param num The upper limit of natural numbers to print (must be positive)
     * @throws StackOverflowError if num is too large causing stack overflow
     * 
     *                            Example:
     *                            Input: num = 5
     *                            Output: 1 2 3 4 5
     */
    public void printNum(int num) {
        if (num == 1) {
            System.out.print(num + " ");
            return;
        }
        printNum(num - 1);
        System.out.print(num + " ");
    }

    /**
     * Prints numbers in reverse order from the given number down to 1.
     * Uses recursion to print each number followed by a space.
     * 
     * @param num The starting number from which to print backwards
     *            Must be a positive integer greater than or equal to 1
     */
    public void printRevNum(int num) {
        if (num == 1) {
            System.out.print(num + " ");
            return;
        }
        System.out.print(num + " ");
        printRevNum(num - 1);
    }

    /*
     * Calculate the factorial of a number using recursion.
     * 
     * Factorial (n!) is the product of all positive integers up to n.
     * For example: 5! = 5 × 4 × 3 × 2 × 1 = 120
     * 
     * Edge cases:
     * - 0! = 1 (by definition)
     * - 1! = 1
     */
    public int factorial(int num) {
        if (num == 0)
            return 1;
        int res = num * factorial(num - 1);
        return res;
    }

    /**
     * Calculates the nth Fibonacci number using recursion.
     * 
     * Fibonacci numbers are a sequence where each number is the sum of the previous
     * two numbers, starting with 0 and 1.
     * 
     * Example:
     * Position: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
     * Numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
     * 
     * Formula: F(n) = F(n-1) + F(n-2)
     * Base cases: F(0) = 0, F(1) = 1
     * 
     * @param num the index in the Fibonacci sequence (must be non-negative)
     * @return the Fibonacci number at the specified index
     * @throws IllegalArgumentException if num is negative
     */
    public int fibonacci(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Index cannot be negative");
        }
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        int res = fibonacci(num - 1) + fibonacci(num - 2);
        return res;
    }

    /**
     * Calculates the sum of all digits in a given number using recursion.
     * For example: 123 = 1 + 2 + 3 = 6
     *
     * @param num The integer number whose digits need to be summed
     * @return The sum of all individual digits in the number
     * @throws IllegalArgumentException if the input number is negative
     *
     *                                  Example Usage:
     *                                  sumOfDigits(123) returns 6
     *                                  sumOfDigits(54) returns 9
     *                                  sumOfDigits(7) returns 7
     */
    public int sumOfDigits(int num) {
        if (num == 0 || num <= 9)
            return num;
        return sumOfDigits(num % 10) + (num / 10);
    }

    /**
     * Calculates the exponential value of a base number raised to a given power
     * using recursion.
     * 
     * @param base  The base number to be raised to the power
     * @param power The exponent (non-negative integer) to which the base is raised
     * @return The result of base raised to the power
     * @throws IllegalArgumentException if power is negative
     * 
     *                                  Examples:
     *                                  exponentVal(2, 3) returns 8 (2^3 = 2 * 2 * 2
     *                                  = 8)
     *                                  exponentVal(5, 0) returns 1 (any number
     *                                  raised to power 0 is 1)
     */
    public int exponentVal(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return exponentVal(base, power - 1) * base;
    }

    /**
     * Prints the first k multiples of a given number in ascending order using
     * recursion.
     * For example, if num=3 and k=4, it will print "3 6 9 12 "
     *
     * @param num The number whose multiples need to be printed
     * @param k   The count of multiples to be printed
     */
    public void mutlipleOfNum(int num, int k) {
        if (k == 1) {
            System.out.print(num + " ");
            return;
        }
        mutlipleOfNum(num, k - 1);
        System.out.print(num * k + " ");
    }

    /**
     * Calculates the sum of natural numbers from 1 to the given number,
     * including only even numbers in the sum.
     *
     * @param num The upper limit of natural numbers (must be positive)
     * @return The sum of all even numbers from 1 to num, inclusive
     * @throws IllegalArgumentException if num is less than 0
     *
     *                                  Example:
     *                                  For num = 5:
     *                                  Returns 2 + 4 = 6
     *                                  For num = 3:
     *                                  Returns 2 = 2
     */
    public int sumOfNum(int num) {
        if (num == 0)
            return 0;
        return num % 2 == 0 ? sumOfNum(num - 1) - num : sumOfNum(num - 1) + num;
    }

    /**
     * Calculates the Greatest Common Divisor (GCD) of two numbers.
     * The GCD is the largest positive integer that divides both numbers without a
     * remainder.
     * This implementation uses Euclidean algorithm.
     *
     * @param num1 The first positive integer
     * @param num2 The second positive integer
     * @return The greatest common divisor of num1 and num2
     * @throws IllegalArgumentException if either number is negative
     *
     *                                  Example:
     *                                  gcd(48, 18) returns 6
     *                                  gcd(54, 24) returns 6
     *                                  gcd(7, 13) returns 1 (co-prime numbers)
     *
     *                                  Time Complexity: O(log(min(a,b)))
     *                                  Space Complexity: O(log(min(a,b))) due to
     *                                  recursive stack
     */
    public int gcdItr(int num1, int num2) {
        int min = Math.min(num1, num2);
        while (min > 0) {
            if (num1 % min == 0 && num2 % min == 0) {
                return min;
            }
            min--;
        }
        return 1;
    }

    /**
     * Calculates the Greatest Common Divisor (GCD) of two numbers using Euclidean
     * algorithm.
     * Uses recursion by repeatedly applying: gcd(a,b) = gcd(b, a mod b)
     * 
     * Euclidean Algorithm states that GCD of two numbers doesn't change if the
     * larger
     * number is replaced by its remainder when divided by the smaller number.
     *
     * @param num1 The first positive integer
     * @param num2 The second positive integer
     * @return The GCD of num1 and num2
     * 
     *         Example:
     *         gcd(48, 18):
     *         = gcd(18, 48%18) = gcd(18, 12)
     *         = gcd(12, 18%12) = gcd(12, 6)
     *         = gcd(6, 12%6) = gcd(6, 0)
     *         = 6
     */
    public int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }

    /**
     * Recursively prints the elements of an integer array.
     * Each element is printed on a new line starting from the given index.
     * 
     * @param nums The integer array to print
     * @param idx  The starting index from which to begin printing
     * @return void
     * 
     *         Example usage:
     *         int[] arr = {1, 2, 3};
     *         printArr(arr, 0); // Prints 1, 2, 3 each on new line
     */
    public void printArr(int[] nums, int idx) {
        if (idx == nums.length) {
            return;
        }
        System.out.println(nums[idx]);
        printArr(nums, idx + 1);
    }

    public void printArr(int[] nums) {
        printArr(nums, 0);
    }

    /**
     * Finds the maximum element in an array using recursion.
     * 
     * @param nums The input array of integers to find maximum element from
     * @param idx  The current index position in recursive traversal, start with 0
     * @return The maximum element found in the array
     * 
     *         Example usage:
     *         int[] arr = {1, 5, 3, 9, 2};
     *         int max = maxElement(arr, 0); // Returns 9
     * 
     *         Time Complexity: O(n) where n is length of input array
     *         Space Complexity: O(n) due to recursive call stack
     */
    public int maxElement(int[] nums, int idx) {
        if (idx == nums.length) {
            return 0;
        }
        return Math.max(maxElement(nums, idx + 1), nums[idx]);

    }

    public int maxElement(int[] nums) {
        return maxElement(nums, 0);
    }

    /**
     * Calculates the sum of all elements in an array using recursion.
     * 
     * @param nums the input array of integers to sum
     * @param idx  the current index in the recursive call, should be 0 for first
     *             call
     * @return the sum of all elements in the array
     * 
     *         Example usage:
     *         int[] arr = {1, 2, 3, 4, 5};
     *         int sum = sumOfArr(arr, 0); // Returns 15
     */
    public int sumOfArr(int[] nums, int idx) {
        if (idx == nums.length) {
            return 0;
        }
        return sumOfArr(nums, idx + 1) + nums[idx];
    }

    public int sumOfArr(int[] nums) {
        return sumOfArr(nums, 0);
    }

    /**
     * Searches for a specific element in an array using recursion.
     * 
     * This method checks whether a given key exists in the array by recursively
     * checking each element starting from the specified index.
     *
     * @param key  The value to search for in the array
     * @param nums The array to search in
     * @param idx  The starting index for the search (used in recursive calls)
     * @return true if the key is found in the array, false otherwise
     * 
     *         Example usage:
     *         int[] arr = {1, 2, 3, 4, 5};
     *         boolean exists = elementExist(3, arr, 0); // Returns true
     *         boolean exists = elementExist(6, arr, 0); // Returns false
     * 
     *         Time Complexity: O(n) where n is the length of the array
     *         Space Complexity: O(n) due to recursive call stack
     */
    public boolean elementExist(int key, int[] nums, int idx) {
        if (idx == nums.length) {
            return false;
        }
        return nums[idx] == key ? true : elementExist(key, nums, idx + 1);
    }

    public boolean elementExist(int key, int[] nums) {
        return elementExist(key, nums, 0);
    }

    /**
     * Prints all indices where a specific key is found in an array using recursion.
     * This method traverses through the array recursively and prints the indices
     * where the key matches the array element.
     * 
     * @param key  The value to search for in the array
     * @param nums The array to search through
     * @param idx  The current index position in the recursive call (start with 0)
     */
    public void keyIndex(int key, int[] nums, int idx) {
        if (idx == nums.length) {
            System.out.println();
            return;
        }
        if (nums[idx] == key) {
            System.out.print(idx + " ");
        }
        keyIndex(key, nums, idx + 1);
    }

    public void keyIndex(int key, int[] nums) {
        keyIndex(key, nums, 0);
    }

    /**
     * Recursively removes a specified character from a string and prints the
     * resulting string.
     * The characters are printed one by one, excluding the specified character.
     *
     * @param ch  The character to be removed from the string (represented as int
     *            for ASCII value)
     * @param str The input string from which the character needs to be removed
     * @param idx The current index position in the string (start with 0)
     */
    public void rmvString(int ch, String str, int idx) {
        if (idx == str.length()) {
            System.out.println();
            return;
        }
        if (str.charAt(idx) != ch) {
            System.out.print(str.charAt(idx));
        }
        rmvString(ch, str, idx + 1);
    }

    public void rmvString() {
        String str = "practice";
        char ch = 'p';
        rmvString(ch, str, 0);
    }

    /**
     * Returns a string in reverse order using recursion.
     * The method processes the string by recursively moving to the end of the
     * string and builds the reversed string while backtracking.
     *
     * @param str The input string to be reversed
     * @param idx The current index position in the string (start with 0)
     * @return The reversed string
     * 
     *         Example usage:
     *         revString("hello", 0) will return "olleh"
     */
    public String revString(String str, int idx) {
        if (idx == str.length()) {
            return "";
        }
        return revString(str, idx + 1) + str.charAt(idx);
    }

    public String revString() {
        String str = "practice";
        return revString(str, 0);
    }

    /**
     * Checks if a string is a palindrome.
     * A palindrome is a word that reads the same forwards and backwards.
     * Uses helper method revString() to reverse the input string and compare.
     *
     * @return true if the string is a palindrome, false otherwise
     */
    public boolean isPalindrome() {
        String str = "dad";
        String revStr = revString(str, 0);
        return str.equals(revStr);
    }

    /**
     * Checks if a given string is a palindrome using recursive approach.
     * A palindrome reads the same forwards and backwards.
     * 
     * @param str  The input string to check for palindrome
     * @param lptr Left pointer index starting from beginning of string
     * @param rptr Right pointer index starting from end of string
     * @return true if the string is palindrome, false otherwise
     * 
     *         Example:
     *         isPalindrome("radar", 0, 4) returns true
     *         isPalindrome("hello", 0, 4) returns false
     */
    public boolean isPalindrome(String str, int lptr, int rptr) {
        if (lptr >= rptr) {
            return true;
        }
        return str.charAt(rptr) == str.charAt(lptr) ? isPalindrome(str, lptr + 1, rptr - 1) : false;
    }

    public boolean isPalindrome(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    /**
     * Generates all possible subsequences of a given string using recursion.
     * A subsequence is a sequence that can be derived from another sequence by
     * deleting some or no elements without changing the order of the remaining
     * elements.
     * 
     * For example, for input string "abc":
     * Output will be ["", "c", "b", "bc", "a", "ac", "ab", "abc"]
     * 
     * @param str The input string from which subsequences need to be generated
     * @return ArrayList<String> containing all possible subsequences of the input
     *         string
     *         including empty string
     * 
     * @throws None
     * 
     *              Time Complexity: O(2^n) where n is the length of input string
     *              Space Complexity: O(2^n) to store all subsequences
     */
    public ArrayList<String> getSubSeq(String str) {
        ArrayList<String> finalSeq = new ArrayList<>();
        if (str.length() == 0) {
            finalSeq.add("");
            return finalSeq;
        }
        ArrayList<String> subSeq = getSubSeq(str.substring(1));
        for (String seq : subSeq) {
            finalSeq.add(seq);
            finalSeq.add(str.charAt(0) + seq);
        }
        return finalSeq;
    }

    /**
     * Prints all possible subsequences of a given string using recursion.
     * A subsequence is a sequence that can be derived from another sequence by
     * deleting some or no elements without changing the order of the remaining
     * elements.
     *
     * @param str     The input string from which subsequences need to be generated
     * @param currRes The current subsequence being built (accumulator)
     * @throws StringIndexOutOfBoundsException if the input string is empty
     * 
     *                                         Example:
     *                                         For input string "abc":
     *                                         Subsequences would be: "", "a", "b",
     *                                         "c", "ab", "ac", "bc", "abc"
     */
    public void printSubSeq(String str, String currRes) {
        if (str.length() == 0) {
            System.out.println(currRes + " ");
            return;
        }
        char curr = str.charAt(0);
        String remStr = str.substring(1);
        printSubSeq(remStr, currRes + curr);
        printSubSeq(remStr, currRes);
    }

    public void printSubSeq(String str){
        printSubSeq(str, "");
    }
}

public class S3_Recursion {
    public static void run() {
        Solution solution = new Solution();
        // int[] arr = new int[] { 3, 15, 3, 7, 22, 9 };
        String str = "Lays";
        solution.printSubSeq(str);
        // ArrayList<String> result = solution.getSubSeq(str);
        // System.out.println("Result: " + result.size());
    }
}
