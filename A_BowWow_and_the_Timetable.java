import java.util.Scanner;

public class A_BowWow_and_the_Timetable {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int sol = s.length()/2;
        
        boolean oneadd = false;
        for(int i = 1;i<s.length()&&s.length()%2!=0;i++){
            if(s.charAt(i)=='1') {oneadd= true; break;}
        }
        if(!oneadd)
        System.out.println(sol);
        else System.out.println(sol+1);
    }
}