import java.util.Scanner;

public class A_Only_One_Digit {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        int n = scn.nextInt();
        scn.nextLine();
        while (n--!=0) {
            String s = scn.nextLine();
            char mini = s.charAt(0);
            for(int i =1;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch<mini){
                    mini =ch;
                }
            }
            System.out.println(mini);
        }

    }
}