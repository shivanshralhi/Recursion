import java.util.Scanner;
public class Rec16 {
    static  int count(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        return count(n/10)+1;
    }
    static int pow(int n ,int m){
        if(m==0) return 1;
        return pow(n,m-1)*n;
    }
    static int Armstrong(int n,int digits){

        if(n>=0 && n<=9 && digits == 1){
            return n;
        }
        if(n>=0 && n<=9 && digits != 1){
            return pow(n,digits);
        }
        return Armstrong(n/10,digits)+pow(n%10,digits);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits  = count(n);
        int a = Armstrong(n,digits);
        if (a == n) {
            System.out.println("it is an armstrong number ");
        }
        else{
            System.out.println("not an armstrong number");
        }
    }

}
