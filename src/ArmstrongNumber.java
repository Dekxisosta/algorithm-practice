/* =======================================================
 *          DETERMINE ARMSTRONG NUMBERS PROGRAM
 * ====================================================== */
/**
 * DISCLAIMER: This program does not reflect the best practices in coding
 *<p></p>
 * This determines the odd and even numbers of an array
 */
public class ArmstrongNumber {
    /**
     * A roundabout way of making an array for a test case.
     * Could be modified to create arrays with random numbers
     */
    private int[] getNumbers(){
        return new int[]{0, 153, 600, 370, 371,500};
    }

    /** Serves as the entry point of the program */
    public static void main(String[] args) {
        try{
            new ArmstrongNumber().run();
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
            showMessage(ConsoleTag.SYSTEM, "Determining %d if armstrong", num);
            if(isArmstrong(num))
                showMessage(ConsoleTag.INFO, "Armstrong number found: %d", num);
            else
                showMessage(ConsoleTag.INFO, "Attempted value is not an armstrong: %d", num);
            println();
        }
    }

    /**
     * Determines armstrong numbers, if not armstrong, display accordingly.
     * Does not use Java built-in libraries
     * @param num the number to be checked if armstrong or not
     */
    private boolean isArmstrong(int num){
        // A container of digits of a number with ordered indices (e.g. 123 = {1,2,3})
        int numberOfDigits = getNumberOfDigits(num);
        int temp = num;

        // Gets the sum of a number's digits powered by the number of digits
        int sum = 0;
        for(int i =0; i<numberOfDigits; i++){
            sum +=pow(temp%10,numberOfDigits);
            showMessage(ConsoleTag.DEBUG, "%ds Digit: %s", pow(10, i), temp%10);
            temp/=10;
        }

        showMessage(ConsoleTag.DEBUG, "Sum of powered digits: %s", sum);

        // If value is armstrong, then number should be equal to the sum
        return num==sum;
    }

    /**
     * Calculates the power based on base and exponent. Uses
     * bitwise operator for faster calculation
     * <p></p>
     * @param base the number to be multiplied with itself for n times
     * @param exp the times the base is multiplied to itself
     * @return the power
     */
    private int pow(int base, int exp){
        int result =1;
        while(exp>0){
            if((exp & 1) == 1) result *= base;
            base *= base;
            exp >>=1;
        }
        return result;
    }

    /**
     * Gets the number of digits of a number
     * @param num the number to be counted of its digits
     */
    private int getNumberOfDigits(int num){
        int numberOfDigits = (num == 0)? 1: 0;
        while(num>0){
            numberOfDigits++;
            num/=10;
        }
        showMessage(ConsoleTag.DEBUG, "Number of digits: %d", numberOfDigits);
        return numberOfDigits;
    }

    /*======================================================
     *          UTILITIES
     *======================================================*/
    private void showMessage(ConsoleTag tag, String format, Object... args){
        printf("%n%s ", tag.label());
        printf(format, args);
    }

    /**
     * Tag system for better logging of console outputs
     */
    private enum ConsoleTag{
        INFO("[INFO]"),
        DEBUG("[DEBUG]"),
        SYSTEM("[SYSTEM]");

        // Field for Console Tag labels
        private String tag;

        // Enum constructor
        ConsoleTag(String tag){this.tag = tag;}

        // Returns the string field for the constant used
        private String label(){return tag;}

    }

    /** Shorthand printf method */
    private void printf(String format, Object... args) {
        System.out.printf(format, args);
    }

    /** Shorthand println method */
    private void println(){
        System.out.println();
    }
}