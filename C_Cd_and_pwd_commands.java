import java.util.*;

public class C_Cd_and_pwd_commands {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        Deque<StringBuilder> q = new ArrayDeque<>();
        // q.add(new StringBuilder("/"));
        for(int i =0;i<n;i++){
            StringBuilder sb = new StringBuilder(scn.nextLine());
            if(sb.toString().equals("pwd")){
                for (StringBuilder sb1 : q) {
                    System.out.print("/");
                    System.out.print(sb1+"");
                }
                System.out.println("/");
            }
            else{
                StringBuilder s = new StringBuilder("");        
                for(int j =3;j<sb.length();j++){
                    char ch = sb.charAt(j);
                    if(j==3&&ch=='/'){ q = new ArrayDeque<>(); continue;}
                    if(ch=='/'){
                        q.addLast(s);
                        s = new StringBuilder("");
                    }
                    else if(ch=='.'){
                        q.removeLast();
                        j+=2;
                    }
                    else{
                        s.append(ch);
                    }
                }
                if(!s.toString().equals(""))
                    q.addLast(s);
            }    
        }    
    }
}