import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        int choice = input.nextInt();
        input.nextLine(); // consume newline

        String selectedConsole = "";
        switch(choice) {
            case 1: selectedConsole = "PS5"; break;
            case 2: selectedConsole = "XBOX"; break;
            case 3: selectedConsole = "SWITCH"; break;
            default: selectedConsole = "PS5"; break;
        }

        System.out.print("Enter the store: ");
        String storeName = input.nextLine();

        System.out.print("Enter the total sales of " + selectedConsole + " consoles for " + storeName + ":");
        int totalSales = input.nextInt();

        // Instantiate ConsoleSales class
        ConsoleSales sale = new ConsoleSales(selectedConsole, storeName, totalSales);
        sale.printReport();

        input.close();
    }
}
