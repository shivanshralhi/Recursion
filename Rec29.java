import java.util.Scanner;
public class Rec29 {
    static String reverse(String s , int idx){
        if(idx == s.length()) return "";
        return reverse(s,idx+1)+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s,0));
    }
}
