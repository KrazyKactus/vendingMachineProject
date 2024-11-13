public class Main 
{
    public static void main(String[] args)
    {
        int cokeStock = 60;
        vendingMachine cocaCola = new vendingMachine("Coca-Cola", 3.50, cokeStock);
        vendingMachine pepsi = new vendingMachine();

        cocaCola.stockError(cokeStock);
        pepsi.setPrice(1.55);
        cocaCola.setPrice(3.25);

        System.out.println("\nMachine name: " + cocaCola.vendingMachineName + "\nPrice: " + cocaCola.getPrice() + "\nStock: " + cocaCola.getCurrentStock());
        System.out.println("Total Sales: " + cocaCola.checkTotalSales(32));
        System.out.println("\nPepsi price: " + pepsi.getPrice());
    }
}
