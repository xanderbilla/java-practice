package com.myclass.pep_classes;

/**
 * This class implements the Tower of Hanoi puzzle solution using recursion.
 * The Tower of Hanoi is a mathematical game or puzzle consisting of three rods and a number of disks
 * of different sizes which can slide onto any rod.
 * 
 * @author Vikas Singh
 * @version 1.0
 * @since January 21, 2025
 */
public class P1_TowerOfHanoi {

    /**
     * Recursively solves the Tower of Hanoi puzzle.
     * The method prints the sequence of moves required to move n disks from the source rod to the destination rod
     * using an auxiliary rod, following the rules:
     * 1. Only one disk can be moved at a time
     * 2. A larger disk cannot be placed on top of a smaller disk
     * 3. All disks must be moved according to these rules
     *
     * @param n The number of disks to be moved
     * @param fromRod The source rod from which disks are moved (typically 'A')
     * @param toRod The destination rod to which disks are moved (typically 'C')
     * @param auxRod The auxiliary rod used for intermediate moves (typically 'B')
     */

    public static void towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }

        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }
}