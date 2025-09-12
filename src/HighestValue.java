/* =======================================================
 *          DETERMINE HIGHEST PROGRAM
 * ====================================================== */
/**
 * DISCLAIMER: This program does not reflect the best practices in coding
 *<p></p>
 * This determines the highest value in the program with O(n)
 */
public class HighestValue {
    /** Serves as the entry point of the program */
    public static void main(String[] args) {
        try{
            new HighestValue().run();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Runs the actual program. In this case, since it's just algorithm practice,
     * no program loops are involved
     */
    private void run(){
        determineHighest(getNumbers());
    }
    /**
     * A roundabout way of making an array for a test case.
     * Could be modified to create arrays with random numbers
     */
    private int[] getNumbers(){
        return new int[]{240,589,865,2031,9210,120391,782,89,230, 120391};
    }

    /**
     * Determines the highest value in an array of integers
     * @param arr the arr to be searched of the highest valued element
     */
    private void determineHighest(int[] arr) {
        // Sets first index of the array for comparisons in runtime
        // Holds the value of highest in runtime
        int highest = arr[0];

        // Counter variable for the number of duplicate highest values
        int numOccurrences = 1;

        // Determines the highest value and if highest value has multiple occurrences
        for(int val: arr) {
            if (val > highest){
                highest = val;
                numOccurrences = 1;
            }
            else if (val == highest)
                numOccurrences++;
        }

        // Prints a console message based on number of duplicates
        if(numOccurrences == 1)
            printf("%n[INFO] The highest value in the array is: %s", highest);
        else
            printf("%n[INFO] Multiples elements hold the highest value: Value %d with %d duplicates", highest, numOccurrences);
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