import java.util.*;

public class E_The_Robotic_Rush {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
            scn.nextLine();
        while (t--!=0) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            int k = scn.nextInt();
            
            Set<Integer>bot = new HashSet<>();
            Set<Integer>spike = new HashSet<>();
            scn.nextLine();
            for(int i=0;i<n;i++){
                bot.add(scn.nextInt());
            }
            scn.nextLine();
            for(int i=0;i<m;i++){
                spike.add(scn.nextInt());
            }
            scn.nextLine();
            String s = scn.nextLine();

            for(int i=0;i<k;i++){
                char ch = s.charAt(i);
                int cnt=0;
                 Set<Integer> nextBot = new HashSet<>();
                Iterator<Integer> it = bot.iterator();
                while(it.hasNext()){
                    int botval = it.next();
                        it.remove();
            if (ch == 'L') {
                if (!spike.contains(botval - 1)) {
                    nextBot.add(botval - 1);
             }
            } else {
                if (!spike.contains(botval + 1)) {
                    nextBot.add(botval + 1);
                }
             }
                }
                bot = nextBot;
                System.out.print(nextBot.size()+" ");
                
            }
            System.out.println();

            
        }
    }
}