import java.util.Scanner;
public class Rec30 {
    static boolean ispalindrome(String s , int l , int r){
        if(l>=r) return true;
        return (s.charAt(l)==s.charAt(r)) && (ispalindrome(s,l+1,r-1));
    }
    static String reverse(String s , int idx){
        if(idx == s.length()) return "";
        return reverse(s,idx+1)+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        String rev = reverse(s,0);
//        if(rev.equals(s)){
//            System.out.println("palindrome");
//        }
//        else{
//            System.out.println("not a palindrome");
//        }
        System.out.println(ispalindrome(s,0,s.length()-1));
    }
}
