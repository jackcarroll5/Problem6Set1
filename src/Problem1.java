import java.util.Scanner;

/**
 * Created by T00194823 on 19/09/2017.
 */
//This problem will display the exchange rate in euros from pounds by using
// a data-sentinel while loop.

public class Problem1 {
    public static void main(String[] args) {

        float money = 1;

        Scanner input = new Scanner(System.in);

        while (money != 0)
        {
            System.out.print("\n\nPlease enter a currency value in GB £ to convert to €:");
            money = input.nextFloat();


            System.out.printf("\nThe exchange rate of £" + String.format("%.2f",money) + " in pounds is €" +
            String.format("%.2f",currencyRate(money)) + " in euros");
        }
        System.out.println("\nThanks for using the system! Goodbye! ");
    }

    public static float currencyRate(float money)
    {
        return money * 1.13f;
    }
}
