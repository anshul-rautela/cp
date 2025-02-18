import java.util.Scanner;

public class B_Skibidus_and_Ohio {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
        while(t--!=0){
            String s = scn.nextLine();
            boolean same = false;
            for(int i =1;i<s.length();i++){
                if(s.charAt(i)==s.charAt(i-1)){
                    same = true;
                    break;
                }
            }
            if(same) System.out.println(1);
            else System.out.println(s.length());
        }
    }
}