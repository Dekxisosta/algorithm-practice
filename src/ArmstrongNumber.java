/* =======================================================
 *          DETERMINE ARMSTRONG NUMBERS PROGRAM
 * ====================================================== */
/**
 * DISCLAIMER: This program does not reflect the best practices in coding
 *<p></p>
 * This determines the odd and even numbers of an array
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.determineArmstrongNumbers(obj.getNumbers());
    }
    /** A roundabout way of making an array for a test case */
    private int[] getNumbers(){
        return new int[]{0, 153, 600, 370, 371,500};
    }

    /**
     * Determines armstrong numbers, if not armstrong, display accordingly.
     * Does not use Java built-in libraries
     * @param arr the array to be checked of armstrong numbers
     */
    private void determineArmstrongNumbers(int[] arr){

        // Loops through values of the array argument, checks each element if armstrong or not
        for(int val: arr){
            // Serves as a temporary storage to prevent overwriting arr values
            int temp = val;

            // Counter variable for number of digits, also used for power computation
            int numDigits = 1;

            // Determines the number of digits of the integer element
            for(;temp>=10;numDigits++)
                temp /= 10;

            // Creates a new container for the split integers of value
            int[] numArr = new int[numDigits];

            // Reallocate value to temporary storage
            temp = val;

            // Stores digits in the earlier container
            for(int i=numDigits-1;i>=0;i--){
                numArr[i] = temp%10;
                temp /= 10;
            }

            // Gets the sum of the digits raised to the number of digits (numDigits)
            int sum = 0;
            for (int num: numArr) {
                int power= 1;
                for(int i=0; i<numDigits; i++)
                    power *= num;
                sum += power;
            }

            // If value is armstrong or not, display on console accordingly
            if(val == sum){
                printf("%n[INFO] Armstrong number found: %s", val);
            }else{
                printf("%n[INFO] Attempted value is not an Armstrong number: %s", val);
            }
        }
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