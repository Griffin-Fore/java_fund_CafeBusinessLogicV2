import java.util.ArrayList;
import java.text.NumberFormat;

public class CafeUtil {
    public int getStreakGoal() {
        int streakGoal = 0;
        for(int i = 1; i <= 10; i++){
            streakGoal += i;
        }
        return streakGoal;
    }

    public double getOrderTotal(double[] prices){
        double totalPrice = 0;
        for(int i = 0; i < prices.length; i++){
            totalPrice += prices[i];
        }
        return totalPrice;
    }
    
    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i ++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello " + username);
        System.out.println("There are "+ customers.size() + " ahead of you.");
        customers.add(username);
        for(int i = 0; i < customers.size(); i++){
            System.out.println(customers.get(i));
        }
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        double total = 0;
        System.out.println("Product: " + product);
        for(int i = 1; i <= maxQuantity;  i++){
            total = (price * i) - ((i - 1) * .50);
            NumberFormat formatter = NumberFormat.getCurrencyInstance();
            System.out.println(i + " - " + formatter.format(total));
        }
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if(menuItems.size() != prices.size()){
            System.out.println("false");
            return false;
        }
        System.out.println("Items and Prices");
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i) + " - $" + prices.get(i));
        }
        return true;
    }

}
