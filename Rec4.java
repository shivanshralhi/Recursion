import java.util.Scanner;
public class Rec4 {
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = fib(n);
        System.out.println(a);
    }
}
