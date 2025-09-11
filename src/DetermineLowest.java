/* =======================================================
 *          DETERMINE LOWEST PROGRAM
 * ====================================================== */
/**
 * DISCLAIMER: This program does not reflect the best practices in coding
 *<p></p>
 * This determines the lowest value in the program with O(n)
 */
public class DetermineLowest {
    public static void main(String[] args) {
        DetermineLowest obj = new DetermineLowest();
        obj.determineLowest(obj.getNumbers());
    }
    /** A roundabout way of making an array for a test case */
    private int[] getNumbers(){
        return new int[]{240,589,865,2031,9210,120391,782,89,230};
    }

    /**
     * Determines the lowest value in an array of integers
     * @param arr the arr to be searched of the highest valued element
     */
    private void determineLowest(int[] arr) {
        int lowest = arr[0];
        for(int val: arr)
            if (val < lowest)
                lowest = val;

        printf("%n[INFO] The lowest value in the array is: %s", lowest);
    }


    /*
     * =======================================================
     *          UTILITIES
     * ======================================================
     */
    /** Shorthand printf method */
    private void printf(String format, Object... args) {
        System.out.printf(format, args);
    }
}