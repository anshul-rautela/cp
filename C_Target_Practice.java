import java.util.Scanner;

public class C_Target_Practice {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t  = scn.nextInt();scn.nextLine();
        int n =10;
        while (t--!=0) {
            
        int sol =0;
        for(int i=0;i<n;i++){
            String s = scn.nextLine();
            for(int j =0;j<n;j++){
                char ch = s.charAt(j);
                if(ch=='X'){
                    int point = 1;
                    if(i>=4&&i<6&&j>=4&&j<6){
                        point = 5;
                    }
                    else if(i>=3&&i<7&&j>=3&&j<7){
                        point = 4;
                    }
                    else if(i>=2&&i<8&&j>=2&&j<8){
                        point = 3;
                    }
                    else if(i>=1&&i<9&&j>=1&&j<9){
                        point = 2;
                    }
                    sol+=point;
                }
            }
        }
        System.out.println(sol);
    }
    }
}