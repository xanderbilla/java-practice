import com.myclass.leetcode.*;

/**
 * Main application class for performance monitoring and program execution.
 * This class provides a framework to:
 * - Monitor memory usage before and after program execution
 * - Track execution time of different program modules
 * - Display performance metrics in appropriate units (bytes/KB/MB/GB)
 *
 * Memory usage is calculated as the difference between total and free memory,
 * and execution time is measured in nanoseconds and converted to milliseconds for display.
 *
 * @author Vikas Singh
 * @version 1.0
 * @since January 17, 2025
 *
 * Usage:
 * - Uncomment the desired method call in the main method
 * - Run the program to see performance metrics
 *
 * @throws Exception Handles and displays any runtime errors that occur during execution
 */
public class App {
    /**
     * The main entry point of the application.
     * Executes the program and measures performance metrics.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.getRuntime();
            long startMemory = runtime.totalMemory() - runtime.freeMemory();
            long startTime = System.nanoTime();

            // Program execution
            L094_InorderTraversal.run();

            // Performance measurements
            long endTime = System.nanoTime();
            long endMemory = runtime.totalMemory() - runtime.freeMemory();
            displayPerformanceMetrics(endMemory - startMemory, endTime - startTime);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Displays memory usage and execution time in appropriate units.
     *
     * @param memoryUsed Memory usage in bytes
     * @param duration Execution time in nanoseconds
     */
    private static void displayPerformanceMetrics(long memoryUsed, long duration) {
        String unit;
        double memoryValue;

        if (memoryUsed < 1024) {
            unit = "B";
            memoryValue = memoryUsed;
        } else if (memoryUsed < 1024 * 1024) {
            unit = "KB";
            memoryValue = memoryUsed / 1024.0;
        } else if (memoryUsed < 1024 * 1024 * 1024) {
            unit = "MB";
            memoryValue = memoryUsed / (1024.0 * 1024.0);
        } else {
            unit = "GB";
            memoryValue = memoryUsed / (1024.0 * 1024.0 * 1024.0);
        }

        System.out.printf("\nMemory used: %.2f %s%n", memoryValue, unit);
        System.out.printf("Execution time: %.2f ms%n", duration / 1_000_000.0);
    }
}