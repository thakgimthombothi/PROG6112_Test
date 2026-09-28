 public abstract class Consoles implements IConsoles {
    // Variables to store console device type, store name, and total amount
    private String consoleType;
    private String storeName;
    private int totalSales;

    // Constructor that accepts console type, store name, and total sales
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Methods to get values - implements interface methods
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}