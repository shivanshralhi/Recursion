import java.util.Scanner;
public class Rec14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(rec(n,m));
    }
    public static int rec(int n , int m){
        if(m==1){
            return sumofn(n);
        }
        int sum = rec(n,m-1);
        return sumofn(sum);
    }
    public static int sumofn(int n){
        int ans = 0;
        if(n==1){
            ans++;
            return ans;
        }
        ans += n + sumofn(n-1);
        return ans;
    }
}
