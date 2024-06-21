import java.util.Scanner;
public class GCD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int min  = 0 ;
        if(x<y) min =x;
        min=y;
        int ans = 0;
        for(int i = min;i>=1;i--){

            if(x % i == 0 && y % i == 0){
                ans = i;
                break;
            }
        }
        System.out.println("GCD : "+ ans);
    }
}
