import java.util.Scanner;

public class A_Gennady_and_a_Card_Game {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String mains = scn.next();
       Character first = mains.charAt(0);
        Character second =mains.charAt(1);
        scn.nextLine();
        boolean sol=false;
        String arr[] = new String[5];
        for(int i =0;i<5;i++){
            arr[i]= scn.next(); 
            if(arr[i].charAt(0)==first||arr[i].charAt(1)==second){
                System.out.println("YES");
                sol=true;
                break;
            }
        }
        if(!sol) System.out.println("NO");

    }
}