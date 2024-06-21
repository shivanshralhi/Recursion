import java .util.Scanner;

public class Rec9 {
    static int pow(int p, int q){
        if(q==0){
            return 1;
        }
        if(q%2==0){
            int smallans = pow(p,q/2);
            return smallans * smallans;
        }

        int small = pow(p,q/2);
        return small * small * p;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(pow(p,q));
    }
}
