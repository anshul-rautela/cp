import java.util.Scanner;

public class E_Number_Maze {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
             
            int t1[] = new int[]{12,21};
            
            int t2[] = new int[]{123,132,213,231,312,321};
            
            
            int t3[] = new int[]{
    1234, 1243, 1324, 1342, 1423, 1432,
    2134, 2143, 2314, 2341, 2413, 2431,
    3124, 3142, 3214, 3241, 3412, 3421,
    4123, 4132, 4213, 4231, 4312, 4321};

            int t = scn.nextInt();
            while (t--!=0) {
                scn.nextLine();
                int n = scn.nextInt();
                int j = scn.nextInt();
                int k = scn.nextInt();

                int k1,k2;
                if(n==12){
                    k1 = t1[j-1];
                    k2 = t1[k-1];
                }
                else if(n==123){
                    k1 = t2[j-1];
                    k2 = t2[k-1];                       
                }
                else{
                    k1 = t3[j-1];
                    k2 = t3[k-1];                       
                }
                int n1 = k1,n2 = k2;
                // System.out.println(k1+" "+k2);
                int dig=0,cnt=0;
                while (n1!=0) {
                    dig++;
                    int rem1 = n1%10;
                    int rem2 = n2%10;
                    if(rem1==rem2)cnt++;
                    n1/=10;
                    n2/=10;
                }
                System.out.println(cnt+"A"+(dig-cnt)+"B");

            }
        }
    
}