/* =======================================================
 *          BINARY SEARCH PROGRAM
 * ====================================================== */
/**
 * DISCLAIMER: This program does not reflect the best practices in coding
 *<p></p>
 * This determines the odd and even numbers of an array
 */
public class DetermineOddEven {
    public static void main(String[] args) {
        DetermineOddEven obj = new DetermineOddEven();
        obj.displayOddAndEvenNums(obj.getNumbers());
    }
    /** A roundabout way of making an array for a test case */
    private int[] getNumbers(){
        return new int[]{240,589,865,2031,9210,120391,782,89,230};
    }

    /**
     * Determines the odd and even numbers in an array of integers
     * @param arr the arr to be searched of the highest valued element
     */
    private void displayOddAndEvenNums(int[] arr) {
        int[] oddArr = new int[arr.length]; // stores the values of odd numbers
        int[] evenArr = new int[arr.length]; // stores the values of even numbers
        int oddCounter = 0, evenCounter = 0; // stores the count of odd/even numbers

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
                //If even number, then add to corresponding array with counter post-increment
                evenArr[evenCounter++] = arr[i];
            else
                //If not even number (odd number), then add to corresponding array with counter post-increment
                oddArr[oddCounter++] = arr[i];
        }

        //Displays count of odd numbers
        printf("%nOdd number count: %s", oddCounter);

        //Displays all odd numbers in the array
        printf("%nOdd numbers: ");
        for(int i = 0; i < oddCounter; i++)
            printf("%d%s", oddArr[i], (i < oddCounter - 1) ? ", " : "");

        //Displays count of even numbers
        printf("%nEven number count: %s", evenCounter);

        //Displays all even numbers in the array
        printf("%nEven numbers: ");
        for(int i = 0; i < evenCounter; i++)
            printf("%d%s", evenArr[i], (i < evenCounter - 1) ? ", " : "");
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