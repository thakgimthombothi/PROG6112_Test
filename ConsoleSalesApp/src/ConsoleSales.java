public class ConsoleSales extends Consoles {

    // Constructor to accept console type, store name, and total amount
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Method to print report as per sample
    public void printReport() {
        System.out.println("\nCONSOLE SALES REPORT");
        System.out.println("*******************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}
