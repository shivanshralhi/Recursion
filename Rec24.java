import java.util.Scanner;
public class Rec24 {
    static boolean search(int[] arr, int target, int idx){
        if(idx >= arr.length){
            return false;
        }
        if(arr[idx] == target){
            return true;
        }
       return search(arr,target,idx+1);


    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,5};
        int target = 4;
        int idx = 0;
        if(search(arr,target,idx)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
