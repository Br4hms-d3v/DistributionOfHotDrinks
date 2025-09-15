import java.util.Scanner;

public class FIll {

    private final Stock stock;

    public FIll(Stock stock) {
        this.stock = stock;
    }


    public void fillTheStock() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        boolean filling = true;

        while (filling) {
            System.out.println("Veuillez sélectionner le numéro pour remplir : \n" +
                    "1 - Eau \n" +
                    "2 - Sucre \n" +
                    "3 - Café \n" +
                    "4 - Poudre chocolat\n" +
                    "5 - Globel \n" +
                    "6 - Cuillère \n" +
                    "7 - Retour");
            int fillChoose = scanner.nextInt();

            switch (fillChoose) {
                case 1:
                    stock.fillWater();
                    break;
                case 2:
                    stock.fillSugar();
                    break;
                case 3:
                    stock.fillBeans();
                    break;
                case 4:
                    stock.fillPowderChoco();
                    break;
                case 5:
                    stock.fillCups();
                    break;
                case 6:
                    stock.fillSpoons();
                    break;
                case 7:
                    filling = false;
                    break;
                default:
                    break;
            }
        }
    }
}
