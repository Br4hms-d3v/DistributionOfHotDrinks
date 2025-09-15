import java.util.Scanner;

public class Menu {


    private final Stock stock = new Stock();
    private final Coffee coffee = new Coffee(stock);
    private final LongCoffee longCoffee = new LongCoffee(stock);
    private final Expresso expresso = new Expresso(stock);
    private final ChocolateMilk chocolateMilk = new ChocolateMilk(stock);
    private final ChocolateDark chocolateDark = new ChocolateDark(stock);
    private final FIll fill = new FIll(stock);

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
                    longCoffee.make();
                    break;
                case 3:
                    expresso.make();
                    break;
                case 4:
                    chocolateMilk.make();
                    break;
                case 5:
                    chocolateDark.make();
                    break;
                case 6:
                    stock.check();
                    break;
                case 7:
                    fill.fillTheStock();
                    break;
                default:
            }
        }
    }

}
