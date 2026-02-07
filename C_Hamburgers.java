import java.util.Scanner;

public class C_Hamburgers {
    static boolean check(int[]need,int inventory[],int price[],long mid,long rouble,long start){
        long ingNeeded[]= new long[3];
        if(need[0]!=0 && mid*need[0]>inventory[0])
        ingNeeded[0]= (mid*need[0]-inventory[0])*price[0];
        if(need[1]!=0&& mid*need[1]>inventory[1])
        ingNeeded[1]= (mid*need[1]-inventory[1])*price[1];
        if(need[2]!=0&& mid*need[2]>inventory[2])
        ingNeeded[2]= (mid*need[2]-inventory[2])*price[2];
        
        long neededprice =0;

        for(int i =0;i<3;i++){
            neededprice+=ingNeeded[i];
        }
        

        if(neededprice<=rouble)return true;
        return false;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();
        int inventory[]= new int[3];
        inventory[0]=scn.nextInt();
        inventory[1]=scn.nextInt();
        inventory[2]=scn.nextInt();
        
        int need[]= new int[3];
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='B') need[0]++;
            if(s.charAt(i)=='S') need[1]++;
            if(s.charAt(i)=='C') need[2]++;
        }
       
        scn.nextLine();
        int price[] = new int[3];
        price[0]= scn.nextInt();
        price[1]= scn.nextInt();
        price[2]= scn.nextInt();

        scn.nextLine();
        long rouble = scn.nextLong();
        int initHam= Integer.MAX_VALUE;
                
        for(int i =0;i<3;i++){
            if(need[i]!=0)
            initHam= Math.min(initHam, inventory[i]/need[i]);
        }

        long start = initHam;
        long end = start+rouble;

        long sol = start;
        while (start<=end) {
            long mid = (start+end)/2;
            if(check(need,inventory,price,mid,rouble,start)){
                sol = mid;
                start = mid+1;
            }
            else end = mid-1;
        }
        System.out.println(sol);
    }
}