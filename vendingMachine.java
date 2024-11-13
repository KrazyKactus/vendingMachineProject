public class vendingMachine
{
    int maxQuantity = 50;
    int minimumQuantity = 0;
    double currentPrice;
    String vendingMachineName;
    int currentStock;

    public vendingMachine(){
    }

    public vendingMachine(String name, double price, int stock)
    {
        vendingMachineName = name;
        currentPrice = price;
        currentStock = stock;
    }

    public double getPrice()
    {
        return currentPrice;
    }

    public double setPrice(double newPrice)
    {
        currentPrice = newPrice;
        return currentPrice;
    }

    public int getCurrentStock()
    {
        return currentStock;
    }

    public double checkTotalSales(int numberSold)
    {
        double sales = numberSold * currentPrice;
        return sales;
    }

    public void stockError(int newStock)
    {
        if(newStock <= maxQuantity && newStock >= minimumQuantity)
        {
            currentStock = newStock;
        }

        else
        {
            System.out.println("Error: Stock exceeds maximum quantity. Defaulting stock to 0.");
            newStock = minimumQuantity;
            currentStock = newStock;
        }
    }
}