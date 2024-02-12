/**
 * javasortprogram
 */
public class javasortprogram {

    public static void main(String[] args) {
        //define the array
        int[] arr={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};
        //print out the array before starting to sort
        for (int i = 15; i > 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("sorting...");
        //n is the length of your array
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                //seeing if the number currently being looked at in the array is in the correct position
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    //if it is, swap them around
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //print out the finished sorted array
        for (int i = 15; i > 0; i--) {
            System.out.println(arr[i]);
        }
    }
}