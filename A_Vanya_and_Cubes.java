import java.util.Scanner;

public class A_Vanya_and_Cubes {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int end = scn.nextInt();

        int sum = 0;
        int i =1;
        int mainsum=0;
        for(;mainsum<end;i++){
            sum+=i;
            mainsum+=sum;
        }
        if(mainsum==end)
            System.out.println(i-1);
        else System.out.println(i-2);
        }
}