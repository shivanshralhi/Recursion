import java.util.Scanner;
public class GCD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x>y) {
            while(x%y !=0){
                int rem = x%y;
                x = y;
                y = rem;
            }
            System.out.println(y);
        }
        else{
            while(y%x !=0){
                int rem = y%x;
                y = x;
                x = rem;
            }
            System.out.println(x );

        }

    }
}
