import java.util.Scanner;

public class C_Prepend_and_Append {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
            scn.nextLine();
        while (t--!=0) {
            int n = scn.nextInt();scn.nextLine();
            String s = scn.nextLine();
            int i =0,j = n-1;
            boolean found = false;
            while (i<j) {
                if(s.charAt(i)==s.charAt(j)){
                    found = true;
                    System.out.println(j-i+1);
                    break;
                }         
                else{
                    i++;
                    j--;
                }       
            }
            if(i==j&& !found){
                System.out.println(1);
            } 
            else if(i!=j && !found) System.out.println(0);

        }


    }
}