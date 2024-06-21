import java.util.Scanner;
public class Rec26 {
    static void search(int[] arr, int target, int idx) {
        if (idx >= arr.length) {
            return;
        }
        if (arr[idx] == target) {
            System.out.println(idx);
        }
        search(arr, target, idx + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,3,2};
        int target = 2;
        int idx=0;
        search(arr,target,idx);

    }
}
