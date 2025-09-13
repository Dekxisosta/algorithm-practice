/* =======================================================
 *          DETERMINE MULTIPLES PROGRAM
 * ====================================================== */
/**
 * DISCLAIMER: This program does not reflect the best practices in coding
 *<p></p>
 * This determines if numbers in an array are multiples of a target value
 */
public class Multiples {
    /** Serves as the entry point of the program */
    public static void main(String[] args) {
        try{
            new Multiples().run();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Runs the actual program. In this case, since it's just algorithm practice,
     * no program loops are involved
     */
    private void run(){
        for(int val: new int[]{2,3,4,5,6,1, -226}){
            printf("%n[SYSTEM] Displaying multiples with counter for %d", val);
            displayMultiplesAndCounter(getNumbers(), val);
        }

    }
    /** A roundabout way of making an array for a test case */
    private int[] getNumbers(){
        return new int[]{22,413,524,312,243,423,561,15,75,81,78,5109,421,132,251,321,532,1,10};
    }

    /**
     * Determines if elements of an array are multiples of a target value
     * @param arr the arr to be searched of multiples
     * @param target the basis of multiples
     */
    private void displayMultiplesAndCounter(int[] arr, int target) {
        if(target == 0){
            printf("%n[ERROR] Arithmetic Exception, cannot perform modulus with 0");
            return;
        }else if(target<0){
            printf("%n[ERROR] Target value must not be negative");
            return;
        }

        // Serves as a counter for multiples
        int multipleCounter=0;

        // Displays multiples of target
        printf("%n[INFO] Multiples of %d: ", target);
        for(int val: arr)
            if(isMultiple(val, target)){
                printf("%d ", val);
                multipleCounter++;
            }

        //Displays count of multiples
        if (multipleCounter==0)
            printf("none");
        else
            printf("%n[INFO] Multiple count: %d", multipleCounter);

        //Prints a space in preparation of next console printout
        printf("%n");
    }

    private boolean isMultiple(int num, int target){
        return num % target == 0;
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