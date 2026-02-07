    import java.util.*;

    public class A_Doremy_s_Paint_3 {

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int t = scn.nextInt();
            while (t--!=0) {
                scn.nextLine();
                int n = scn.nextInt();
                scn.nextLine();
                Map<Integer,Integer>map = new HashMap<>();
                int arr[]= new int[n];
                for(int i =0;i<n;i++){
                    int k =arr[i]= scn.nextInt();
                    if(map.containsKey(k))
                        map.put(k, map.get(k)+1);
                    else map.put(k,1);
                }
                int cnt =0;
                boolean found = false;
                    if(arr.length==2){
                        found = true;
                        System.out.println("Yes");
                    }else if(arr.length==3&&map.size()<3){
                        System.out.println("Yes");
                        found = true;
                    }else if(map.size()>2){
                        System.out.println("No");
                        found = true;
                    }
                    else if(map.size()<=2){
                        if(map.size()==1)System.out.println("Yes");
                        else{int  k=0 ;
                            int i =0;
                            for(int x:map.keySet()){
                                if(i==0){
                                    k = map.get(x);
                                }else if(i==1){
                                    int k2 = map.get(x);
                                    if(Math.max(k,k2)-Math.min(k,k2)<=1) System.out.println("Yes");
                                    else System.out.println("No");
                                    // System.out.println(k+" k "+k2);
                                }                        
                                i++;
                            }
                        }
                    }           
                }        
        }
    }