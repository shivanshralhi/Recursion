import java.util.Scanner;
public class rec17 {
    static int recmul(int x ,int y){
        if(y==1){
            return x;
        }
        return recmul(x,y-1)+x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(recmul(x,y));
    }
}
