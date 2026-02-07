import java.util.*;
import java.util.Scanner;

public class A_Forked {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int move1 = scn.nextInt();
            int move2 = scn.nextInt();
            scn.nextLine();

            int k1 = scn.nextInt();
            int k2 = scn.nextInt();
            scn.nextLine();
            int q1 = scn.nextInt();
            int q2 = scn.nextInt();
            


            Set<List<Integer>> set= new HashSet<>();

            int fa1 = k1 - move1;
            int fa2 = k2 - move2;
            
            if(!(fa1==q1&&fa2==q2)){
                set.add(Arrays.asList(fa1,fa2));
            }

            fa1 = k1 - move2;
            fa2 = k2 - move1;            
             if(!(fa1==q1&&fa2==q2)){
                set.add(Arrays.asList(fa1,fa2));
            }

            fa1 = k1 - move1;
            fa2 = k2 + move2;            
             if(!(fa1==q1&&fa2==q2)){
                set.add(Arrays.asList(fa1,fa2));
            }

            fa1 = k1 - move2;
            fa2 = k2 + move1;            
             if(!(fa1==q1&&fa2==q2)){
                set.add(Arrays.asList(fa1,fa2));
            }

            fa1 = k1 + move1;
            fa2 = k2 - move2;            
             if(!(fa1==q1&&fa2==q2)){
                set.add(Arrays.asList(fa1,fa2));
            }

            fa1 = k1 + move2;
            fa2 = k2 - move1;            
             if(!(fa1==q1&&fa2==q2)){
                set.add(Arrays.asList(fa1,fa2));
            }

            fa1 = k1 + move1;
            fa2 = k2 + move2;            
             if(!(fa1==q1&&fa2==q2)){
                set.add(Arrays.asList(fa1,fa2));
            }

            fa1 = k1 + move2;
            fa2 = k2 + move1;            
             if(!(fa1==q1&&fa2==q2)){
                set.add(Arrays.asList(fa1,fa2));
            }



            int cnt =0;

            //queen
            fa1 = q1 - move1;
            fa2 = q2 - move2;
            
              if(!(fa1==k1&&fa2==k2)&&set.contains(Arrays.asList(fa1,fa2))){
                cnt++;
                set.remove(Arrays.asList(fa1,fa2));
            }

            fa1 = q1 - move2;
            fa2 = q2 - move1;            
                         if(!(fa1==k1&&fa2==k2)&&set.contains(Arrays.asList(fa1,fa2))){
                cnt++;
                set.remove(Arrays.asList(fa1,fa2));
            }

            fa1 = q1 - move1;
            fa2 = q2 + move2;            
                        if(!(fa1==k1&&fa2==k2)&&set.contains(Arrays.asList(fa1,fa2))){
                cnt++;
                set.remove(Arrays.asList(fa1,fa2));
            }

            fa1 = q1 - move2;
            fa2 = q2 + move1;            
                          if(!(fa1==k1&&fa2==k2)&&set.contains(Arrays.asList(fa1,fa2))){
                cnt++;
                set.remove(Arrays.asList(fa1,fa2));
            }

            fa1 = q1 + move1;
            fa2 = q2 - move2;            
                          if(!(fa1==k1&&fa2==k2)&&set.contains(Arrays.asList(fa1,fa2))){
                cnt++;
                set.remove(Arrays.asList(fa1,fa2));
            }

            fa1 = q1 + move2;
            fa2 = q2 - move1;            
                          if(!(fa1==k1&&fa2==k2)&&set.contains(Arrays.asList(fa1,fa2))){
                cnt++;
                set.remove(Arrays.asList(fa1,fa2));
            }

            fa1 = q1 + move1;
            fa2 = q2 + move2;            
                          if(!(fa1==k1&&fa2==k2)&&set.contains(Arrays.asList(fa1,fa2))){
                cnt++;
                set.remove(Arrays.asList(fa1,fa2));
            }

            fa1 = q1 + move2;
            fa2 = q2 + move1;            
                          if(!(fa1==k1&&fa2==k2)&&set.contains(Arrays.asList(fa1,fa2))){
                cnt++;
                set.remove(Arrays.asList(fa1,fa2));
            }

            System.out.println(cnt);        

        }


    }
}