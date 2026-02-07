import java.util.Scanner;

public class B_Yet_Another_Broken_Keyboard {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.nextLine();
        String s = scn.nextLine();
        String valid  = scn.nextLine();
        boolean typeable[] = new boolean[26];

        for(int i =0;i<valid.length();i++){
            char ch = valid.charAt(i);
            if(ch!=' '){
                typeable[ch-'a']= true;;
            }
        }
        int arr[] = new int[n+1];
        long sum =0;
        arr[0]=0;

        for(int i =1;i<s.length()+1;i++){
            if(typeable[s.charAt(i-1)-'a']){
                arr[i]+= arr[i-1]+1;
            }else arr[i] = 0;

            sum += arr[i];
        }
        System.out.println(sum);
    }
}