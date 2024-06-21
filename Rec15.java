import java.util.Scanner;
public class Rec15 {
    static int recgcd(int x, int y){
        if(y==0) return x;
        return recgcd(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(recgcd(x,y));
    }
}
