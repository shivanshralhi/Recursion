import java.util.Scanner;
public class Rec35 {
    static void combination(String dig, String res,String[] kp){
        if(dig.length() == 0){
            System.out.print(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';//2
        String CurrChoices = kp[currNum];//abc
        for(int i=0;i<CurrChoices.length();i++){
            combination(dig.substring(1),res+ CurrChoices.charAt(i),kp);
        }




    }
    public static void main(String[] args) {
        String s = "23";
        String[] kp = {"", "","abc", "def", "ghi", "jkl", "mno","pqrs", "tuv","wxyz"};
        combination(s,"",kp);
    }
}
