import java.util.Scanner;

public class A_Soldier_and_Bananas {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double cost = scn.nextDouble();    // Cost of the first banana
        double dollars = scn.nextDouble(); // Dollars the soldier currently has
        double n = scn.nextDouble();       // Number of bananas

        // Correct AP formula with proper grouping and floating-point division
        double totalCost = (n /2* (2 * cost + (n - 1) * cost));
        int totalCost1=0;
        for(int i =1;i<=n;i++){
            totalCost1+=i*cost;
        }
        System.out.println(totalCost1);
        System.out.println(totalCost);


        
        // if(totalCost-dolar<0)
        // System.out.println(0);
        // else
        // System.out.println(totalCost-dolar);

    }
}