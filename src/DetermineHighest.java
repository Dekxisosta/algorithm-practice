/* =======================================================
 *          BINARY SEARCH PROGRAM
 * ====================================================== */
/**
 * DISCLAIMER: This program does not reflect the best practices in coding
 *<p></p>
 * This determines the highest value in the program with O(n)
 */
public class DetermineHighest {
    public static void main(String[] args) {
        DetermineHighest obj = new DetermineHighest();
        obj.performSearch(obj.getNumbers(), 5);
        obj.performSearch(obj.getNumbers(), 10);
    }

    private int[] getNumbers() {
        return new int[]{20, 392, 1283, 495, 2302, 103234, 203, 504};
    }


    /*
     * =======================================================
     *          UTILITIES
     * ======================================================
     */
    private void printf(String format, Object... args) {
        System.out.printf(format, args);
    }
}