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
        obj.determineHighest(obj.getNumbers());
    }
    /**
     * A roundabout way of making an array for a test case
     */
    private int[] getNumbers(){
        return new int[]{240,589,865,2031,9210,120391,782,89,230};
    }

    /**
     * Determines the highest value in an array of integers
     * @param arr the arr to be searched of the highest valued element
     */
    private void determineHighest(int[] arr) {
        int highest = arr[0];
        for(int val: arr)
            if (val > highest)
                highest = val;

        printf("%n[INFO] The highest value in the array is: %s", highest);
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