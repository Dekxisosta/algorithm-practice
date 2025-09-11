/* =======================================================
 *          BINARY SEARCH PROGRAM
 * ====================================================== */
/**
 * DISCLAIMER: This program does not reflect the best practices in coding
 *<p></p>
 * This mimics the Binary Search algorithm. In every pass, it prints out the
 * value of the indices, the middle index (sum of both indices / 2), and the array
 * element that uses the middle index
 *<p></p>
 * Only limited to sorted arrays with distinct elements
 */
public class BinarySearch{
    public static void main(String[] args){
        BinarySearch obj = new BinarySearch();
        obj.performSearch(obj.getNumbers(), 5);
        obj.performSearch(obj.getNumbers(), 10);
    }
    private int[] getNumbers(){
        return new int[]{1,2,3,4,5,6,7,8,9,10};
    }
    private void performSearch(int[] arr, int target){
        int indexA = 0; // serves as the low value for the range (indexA, indexB)
        int indexB = arr.length-1; // serves as the high value for the range (indexA, indexB)
        int pass = 0; // determines the number of passes made by the program before termination

        // Banner of Binary Search Passes
        printf("%n%s", "=".repeat(82));
        printf("%n| %44s%-34s |", "VALUES IN EACH PASS", " ");
        printf("%n%s", "=".repeat(82));

        while(indexA<=indexB){
            //Serves as a pointer for accessing elements in the sorted array
            int midIndex = (indexA+indexB)/2;

            printf("%n| PASS %-4s || indexA: %-4s : indexB: %-4s : midIndex: %-4s : arr[midIndex]: %-4s|", ++pass, indexA, indexB, midIndex, arr[midIndex]);

            if(arr[midIndex]==target) {
                //Serves as the last border for the Binary Search Passes table
                printf("%n%s", "=".repeat(82));

                //Prints the target value together with the index
                printf("%n[INFO] Found target value %s at index: %s%n", target, midIndex);
                break;
            }
            //if target is greater than the value of the current element, replace indexA with midIndex + 1
            else if(arr[midIndex]<target)
                indexA = midIndex + 1;
            //if target is less than the value of the current element, replace indexB with midIndex - 1
            else
                indexB = midIndex - 1;
        }
        // If index positions overlapped each other, print an expected error message
        if(indexA>indexB)
            printf("%n[INFO] Unable to find target %s", target);
    }

    /*
     * =======================================================
     *          UTILITIES
     * ======================================================
     */
    private void printf(String format, Object... args){
        System.out.printf(format, args);
    }
}