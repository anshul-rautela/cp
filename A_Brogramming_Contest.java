import java.util.Scanner;

public class A_Brogramming_Contest {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        scn.nextLine();
        while (T--!=0) {
            int n = scn.nextInt();
            scn.nextLine();
            String s = scn.nextLine();
            Character start = s.charAt(0);
            Character end = s.charAt(n-1);
            
            int delta=-1;
            int cnt =0;

            for(int i =0;i<n;i++){
                if(s.charAt(i)!=delta){
                    delta=s.charAt(i);
                    cnt++;
                }
            }
            if(cnt ==1 ){
                if(start=='1'&&end=='1'){
                    System.out.println(1);
                }
                else if(start=='0'&&end=='0'){
                    System.out.println(0);
                }
            }
            else{
                if(start=='0'&&end=='1'){
                    System.out.println(cnt-1);
                }
                else if(start=='1'&&end=='0')
                    System.out.println(cnt);
                else if(start=='1'&&end=='1')
                    System.out.println(cnt);
                else if(start=='0'&&end=='0')
                    System.out.println(cnt-1);
            }
            
        }
    }
}