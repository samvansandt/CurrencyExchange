
package currencyexchange;
import java.util.Scanner;
/**
 *
 * @author SamVanSandt
 */
public class CurrencyExchange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner (System.in);
        
//prompt user to enter the exchange rate from dollars to RMB
        System.out.println("Enter the exchange rate from dollars to RMB:");
        double exchange = input.nextDouble();
        
        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
        double dollarsorrmb = input.nextInt();
        
        if (dollarsorrmb == 0){ //if user wants to exchange American to Chinease
         System.out.println("Enter dollar amount:");
        double dollars = input.nextDouble();
        double exchangetochinease = exchange * dollars;
        System.out.println ("$" + dollars + " is " + exchangetochinease + "yuan" );
        }
        
        else if (dollarsorrmb == 1){ //if user wants to exchange Chinease to American
         System.out.println("Enter RMB amount:");
        double rmb = input.nextDouble();
        double exchangetoamerican = exchange * rmb;
        System.out.println (rmb + " yuan is " + exchangetoamerican + "dollars" );
                }
        
        else // if input other than 1 or 0, display wrong status
         System.out.println("improper input, use 1 or 0:rerun and try again");   
        
    }
    
}

    
    

