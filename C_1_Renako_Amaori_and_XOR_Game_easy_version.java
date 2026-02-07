import java.util.Scanner;

public class C_1_Renako_Amaori_and_XOR_Game_easy_version {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int t = scn.nextInt();
            while (t--!=0) {
                scn.nextLine();
                int n = scn.nextInt();
                scn.nextLine();
                int a[] = new int[n];
                for(int i =0;i<n;i++){
                    a[i] = scn.nextInt();
                }
                
                scn.nextLine();
                int b[] = new int[n];

                for(int i =0;i<n;i++){
                    b[i] = scn.nextInt();
                }
                
                int turn = 1;
                int cnt1=0,cnt2=0;

                for(int i =0;i<n;i++){
                    int k1 = a[i];
                    int k2 = b[i];
                    if(k1==1) cnt1++;
                    if(k2==1) cnt2++;
                }
                
                
                for(int i =0;i<n;i++){
                    int k1 = a[i];
                    int k2 = b[i];

                    if(k1!=k2){
                        if(turn)
                    }

                }
                




            }
        }
    
}