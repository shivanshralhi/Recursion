import java.util.Scanner;
public class Rec19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(find(n));
    }
    public static int find(int n){
        if(n==0) return 0;
        else{
            return (n%2+10*find(n/2));
        }
    }
}
