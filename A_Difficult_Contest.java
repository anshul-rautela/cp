import java.util.Scanner;

public class A_Difficult_Contest {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        scn.nextLine();
        while (t--!=0) {
            String s = scn.nextLine();
            boolean change = false;
            int n = s.length();
            for(int i =0;i<s.length();i++){
                if(s.charAt(i)=='N'&&i+2<n&&s.charAt(i+1)=='T'&&s.charAt(i+2)=='T'){
                    change = true; 
                    break;
                }
                else if(s.charAt(i)=='F'&&i+2<n&&s.charAt(i+1)=='F'&&s.charAt(i+2)=='T'){
                    change = true; 
                    break;
                }              
            }


            if(change){
                    int tcount = 0;

                for(int i =0;i<n;i++){
                    if(s.charAt(i)=='T'){
                        tcount++;
                    }
                }
                
                while (tcount--!=0) {
                    System.out.print('T');
                }

                for(int i =0;i<n;i++){
                    if(s.charAt(i)!='T'){
                        System.out.print(s.charAt(i));
                    }
                }

            }   
            else{
                System.out.print(s);
            }
            System.out.println();
        }
    }
}