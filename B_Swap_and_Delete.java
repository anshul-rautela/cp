import java.util.Scanner;

public class B_Swap_and_Delete {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        scn.nextLine();
            
        while (t--!=0) {
            String s = scn.nextLine();
            int one = 0;
            int zero = 0;
            for(int i =0;i<s.length();i++){
                if(s.charAt(i)=='0') zero++;
                else one++;
            }

                int sol = 0;
            if(s.length()==1) System.out.println(1);//unecessary
            else if(s.length()==0) System.out.println(0);
            else if(one==zero)    System.out.println(0);
            // else if(one ==0 ||zero==0) System.out.println();
            else{
                // one =0;
                // zero = 0;
                int n = s.length();
                int left = -1;
                int right = -1;
                while(left<n-1 && right<n-1){
                    // if(left == -1){
                        int i;
                        for(i = right+1;i<n && s.charAt(right+1)==s.charAt(i);i++){
                            left=i;
                        }
                        // left--;
                        for(i = left+1;i<n && s.charAt(left+1)==s.charAt(i);i++){
                            right=i;
                        }
                        // right--;
                    // }
                    if(right>=left) sol+=right-left;
                    else sol+=left;
                    right = n;
                    left = n;
                }
            System.out.println(sol);
            }
        }
    }
}