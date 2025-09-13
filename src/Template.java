/* =======================================================
 *          XXX NAME PROGRAM
 * ====================================================== */
/**
 * DISCLAIMER: This program does not reflect the best practices in coding
 *<p></p>
 * Description of the program
 */
public class Template {
    /**
     * A roundabout way of making an array for a test case.
     * Could be modified to create arrays with random numbers
     */
    private int[] getNumbers(){
        return new int[]{0, 121,123454321,153, 600, 370, 371,500};
    }

    /** Serves as the entry point of the program */
    public static void main(String[] args) {
        try{
            new Template().run();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Runs the actual program. In this case, since it's just algorithm practice,
     * no program loops are involved
     */
    private void run(){
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
