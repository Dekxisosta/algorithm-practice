/* =======================================================
 *          DETERMINE PALINDROME NUMBERS PROGRAM
 * ====================================================== */
/**
 * DISCLAIMER: This program does not reflect the best practices in coding
 *<p></p>
 * This determines the odd and even numbers of an array
 */
public class Palindrome {
    /** Serves as the entry point of the program */
    public static void main(String[] args) {
        try{
            new Palindrome().run();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Runs the actual program. In this case, since it's just algorithm practice,
     * no program loops are involved
     */
    private void run(){
        for(int num: getNumbers()){
            if(isPalindrome(num))
                printf("%n[INFO] Palindrome found: %d", num);
            else
                printf("%n[INFO] Attempted value is not a palindrome: %d", num);
        }
    }

    /**
     * A roundabout way of making an array for a test case.
     * Could be modified to create arrays with random numbers
     */
    private int[] getNumbers(){
        return new int[]{0, 121,123454321,153, 600, 370, 371,500};
    }

    /**
     * Determines if a number is a palindrome
     * @param num the number to be checked
     * @return if num is a palindrome, true. Otherwise, false
     */
    private boolean isPalindrome(int num){
        //Gets digits of a number with ordered indices (e.g. 123 = {1,2,3})
        int[] numArr = getDigitArray(num);

        // Serves as pointers for lowest and highest index
        int low = 0;
        int high = numArr.length-1;

        // Checks if low and high are equal in value, if not returns false
        // For every loop, low increments and high decrements
        while(low<high)
            if(numArr[low++]!=numArr[high--])
                return false;

        return true;
    }

    /**
     * Gets the number of digits in a number and puts it in an array, ordered
     * as follows (e.g. 123 = {1,2,3})
     * @param num the number to be made a digit array of
     */
    private int[] getDigitArray(int num){
        // Serves as a temporary storage to prevent overwriting arr values
        int temp = num;

        // Counter variable for number of digits, also used for power computation
        int numDigits = 1;

        // Determines the number of digits of the integer element
        for(;temp>=10;numDigits++)
            temp /= 10;

        // Creates a new container for the split integers of value
        int[] numArr = new int[numDigits];

        // Reallocate value to temporary storage
        temp = num;

        // Stores digits in the earlier container
        for(int i=numDigits-1;i>=0;i--){
            numArr[i] = temp%10;
            temp /= 10;
        }

        return numArr;
    }

    /*======================================================
     *          UTILITIES
     *======================================================*/
    /** Shorthand printf method */
    private void printf(String format, Object... args) {
        System.out.printf(format, args);
    }
}