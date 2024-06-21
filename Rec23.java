import java.util.Scanner;
public class Rec23 {
    static int SumOfElements(int[] arr , int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallAns = SumOfElements(arr,idx+1);
        return arr[idx]+smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int idx = 0;
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(SumOfElements(arr,idx));
    }
}
