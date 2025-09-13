import java.util.Scanner;

public class Menu {


    private Stock stock = new Stock();
    private Coffee coffee = new Coffee(stock);

    public void displayMenu() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Veuillez selectionnez votre choix: \n" +
                    "1 - Café \n" +
                    "2 - Café long \n" +
                    "3 - Expresso \n" +
                    "4 - Chocolat lait \n" +
                    "5 - Chocolat noir \n" +
                    "6 - Solde \n" +
                    "7 - Remplir \n");


            System.out.println("Veuillez selectionnez votre choix: \n");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    coffee.make();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    stock.check();
                    break;
                case 7:
                    break;
                default:
            }
        }
    }

}
