import java.util.Scanner;
public class Rec2 {
    static void PD(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        PD(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PD(n);
    }
}
