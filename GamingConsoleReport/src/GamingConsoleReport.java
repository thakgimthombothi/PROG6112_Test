public class GamingConsoleReport{

    public static void main(String[] args) {

        // Names of the cities
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        // Gaming console names
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Sales for each city and console
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };

        // Display the heading
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------");

        // Display the console headings
        System.out.printf("%-20s %-10s %-10s %-10s%n",
                "CITY", "PS5", "XBOX", "SWITCH");

        // Display the sales
        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-20s", cities[i]);

            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------");

        int highestSales = 0;
        String cityWithMostSales = "";

        // Calculate total sales for each city
        for (int i = 0; i < cities.length; i++) {

            int total = 0;

            for (int j = 0; j < consoles.length; j++) {
                total = total + sales[i][j];
            }

            System.out.println(cities[i] + "        " + total);

            // Find the city with the highest sales
            if (total > highestSales) {
                highestSales = total;
                cityWithMostSales = cities[i];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: "
                + cityWithMostSales);
    }
}
