import java.util.*;
public class B_Intercepted_Inputs {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T=scn.nextInt();

        while (T--!=0) {
            int n=scn.nextInt();
            int m=n;
            int arr[]=new int[n];
            int i =0;
            while(n--!=0){
                arr[i++]=scn.nextInt();
            }
            n=m;
            boolean flag=true;
            HashMap<Integer,Integer>set=new HashMap<>();
            for(i =0;i<arr.length;i++){
                int key = arr[i];
                if(!set.containsKey(key)) 
                set.put(arr[i],1);
                else{
                    set.put(arr[i],2);
                    if((n-2)%key==0&&set.containsKey((n-2)/key)&&(key==(n-2)/key)&&set.get(key)==2){
                        System.out.println(key+" "+(n-2)/key);
                        break;
                    }
                }
                if((n-2)%key==0&&set.containsKey((n-2)/key)&&(key!=(n-2)/key)){
                    System.out.println(key+" "+(n-2)/key);
                    break;
                }
            }
        }
    }
}