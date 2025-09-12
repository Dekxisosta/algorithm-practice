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
        for(int val: new int[]{2,3,4,5,6,1})
            displayMultiples(getNumbers(), val);
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
    private void displayMultiples(int[] arr, int target) {
        int[] multiples = new int[arr.length];
        int multipleCounter = 0;
        for(int val: arr)
            if(val % target == 0)
                multiples[multipleCounter++] = val;

        //Displays all multiples
        printf("%nMultiples of %s: ", target);
        for(int i = 0; i < multipleCounter; i++)
            printf("%d%s", multiples[i], (i < multipleCounter - 1) ? ", " : "");

        //Displays count of multiples
        printf("%nMultiple count: %s", multipleCounter);

        //Prints a space in preparation of next console printout
        printf("%n");
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