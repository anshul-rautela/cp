import java.util.Scanner;

public class B_Rooms_and_Staircases {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();        
        scn.nextLine();
        while (t--!=0) {  
        int n = scn.nextInt();
        scn.nextLine();
        String s = scn.nextLine();
    
        boolean first = false;

        int firstone = -1;
        int secondone = -1;

        for(int i =0;i<n;i++){
            if(s.charAt(i)=='1' && !first){
                first = true;
                firstone = n-i;
            }
            if(s.charAt(i)=='1'){
                secondone = i+1;
            }
        }
        if(!first){
            System.out.println(n);
        }
        else{
            System.out.println(2*Math.max(firstone, secondone));
        }
    }

    }
}