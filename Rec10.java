import java.util.Scanner;
public class Rec10 {
    static void printmul(int num, int k){
        if(k==1){
            System.out.println(num);
            return;
        }
        printmul(num,k-1);
        System.out.println(num*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        printmul(num,k);
    }
}
