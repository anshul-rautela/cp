import java.util.Scanner;

public class A_Erasing_Zeroes {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();
        while (T--!=0) {
            String s = scn.nextLine();
            int cnt =0;
            int start1=-1,end1=-1;

            for(int i =0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    start1=i;
                    break;
                }
            }
            for(int i =s.length()-1;i>=0;i--){
                if(s.charAt(i)=='1'){
                    end1=i;
                    break;
                }
            }
            for(int i =start1;i<=end1&&i>-1;i++){
                if(s.charAt(i)=='0')
                    cnt++;
            }
            System.out.println(cnt);
        }
    }
}