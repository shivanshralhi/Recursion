import java.util.Scanner;
public class Rec25 {
    static int search(int[] arr, int target, int idx) {
        if (idx >= arr.length) {
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        }
        return search(arr, target, idx + 1);
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,5};
        int target = 4;
        int idx = 0;
        System.out.println(search(arr,target,idx));

    }

}
