import java.util.Scanner;
public class Rec28 {
    static String remove(String str , int idx){
        if(idx == str.length()) return "";
        String small = remove(str,idx+1);
        char  curr = str.charAt(idx);
        if(curr != ' '){
              return curr+small;
        }
        else{
            return small;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(remove(str,0));
    }
}
