import java.util.Scanner;

public class A_Competitive_Programmer {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
            scn.nextLine();
        while (t--!=0) {
            String n = scn.nextLine();
            int sum =0;
            int zero = 0;
            boolean two =false;
            for(int i =0;i<n.length();i++){
                char ch = n.charAt(i);
                int no = ch-'0';
                if(no == 0) zero++;
                sum+=no;
                if(no%2==0&&no!=0) two = true;
            }
            if(sum%3==0&&(zero>1||(zero==1&&two)))
                System.out.println("red");
            
            else System.out.println("cyan");

        }
    }
}