import java.util.Scanner;
public class Rec32 {
    static void printSSQ(String s , String Currans){
        if(s.length() == 0 ){
            System.out.println(Currans);
            return;
        }


        char curr = s.charAt(0);
        String rest = s.substring(1);



        printSSQ(rest,Currans+curr); // choose to come

        printSSQ(rest,Currans);// choose not to come
    }
    public static void main(String[] args) {
        printSSQ("abc","");

    }
}
