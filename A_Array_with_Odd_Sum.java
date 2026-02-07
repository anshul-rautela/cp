    import java.util.Scanner;

    public class A_Array_with_Odd_Sum {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int T = scn.nextInt();
            scn.nextLine();
            while (T--!=0) {
                int n = scn.nextInt();
                scn.nextLine();
                int sum = 0;
                boolean odd = false;
                boolean even = false;
                for(int i =0;i<n;i++){
                    int k = scn.nextInt();
                    if(k%2==0){
                        even= true;
                    }
                    else odd = true;
                    sum+=k;
                }
                if(odd&&even) System.out.println("YES");
                else if(sum%2!=0)System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }