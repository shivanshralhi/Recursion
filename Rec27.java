import java.util.ArrayList;
import java.util.Scanner;
public class Rec27 {
    static ArrayList<Integer> search(int[] arr, int target, int idx){
        if(idx >= arr.length){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer> smallans = search(arr,target,idx+1);
        ans.addAll(smallans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,2,4,2,4};
        int target = 4;
        int idx =0;
        ArrayList<Integer> ans = search(arr,target,idx);
        for(Integer i : ans){
            System.out.println(i);
        }

    }
}
