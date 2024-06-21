import java.util.Scanner;
public class Rec21 {
    static void printarray(int [] arr , int idx){
        int n = arr.length;
        if(idx == n) return;
        System.out.print(arr[idx] + " ");
        printarray(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();

        }
        int idx = 0;
        printarray(arr,idx);
    }
}
