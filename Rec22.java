import java.util.Scanner;
public class Rec22 {
    static int arraymax(int[] arr , int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int mx = arraymax(arr,idx+1);
        if(arr[idx]>mx){
            mx = arr[idx];
        }
        return mx;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        System.out.println(arraymax(arr,idx));

    }
}
