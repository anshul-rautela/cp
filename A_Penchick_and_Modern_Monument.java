    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;

    public class A_Penchick_and_Modern_Monument {
        public static void main(String[] args) {
            Scanner scn  =new Scanner(System.in);
            int T = scn.nextInt();
            while(T--!=0){
                int n=scn.nextInt();
                int m =n;
                long arr[]=new long[n];
                int i =0;
                while(n--!=0){
                    arr[i++]=scn.nextInt();
                }
                i=0;int sol=0;
                long swap = arr[0];
                HashMap<Long,Long>map = new HashMap<>();
                for(;   i<m;i++){
                    long key = arr[i];
                    if(map.containsKey(key)){
                        map.put(key,map.get(key)+1);
                    }
                    else map.put(key, 1L);
                }
                // Find the entry with the maximum value
            Map.Entry<Long, Long> maxEntry = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);
                

                System.out.println(m-maxEntry.getValue());
            }
        }
        
    }