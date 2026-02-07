import java.util.*;
public class A_Blackboard_Game {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while(n--!=0){
            scn.nextLine();
            int an = scn.nextInt();
            int sol = (an-4)%4;
            if(sol==0){
                System.out.println("Bob");
            }
            else{
            System.out.println("Alice");
        }
        }
    }
}