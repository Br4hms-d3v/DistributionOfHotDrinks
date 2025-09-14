public class ChocolateMilk {

    private final Stock stock;

    public ChocolateMilk(Stock stock) {
        this.stock = stock;
    }

    public void make() throws InterruptedException {

        int needWater = 200;
        int needSugar = 15;
        int powderChoco = 30;
        int needCup = 1;
        int needSpoon = 1;
        int quantity = 1;
        double price = 0.95;

        char point = '.';

        if (stock.getWater() < needWater || stock.getSugar() < needSugar || stock.getPowderChoco() < powderChoco || stock.getCups() < needCup || stock.getSpoons() < needSpoon) {
            System.out.println(Color.RED + "Le chocolat au lait est momentanément indisponible" + Color.RESET);
            Thread.sleep(800);
            return;
        }

        System.out.println("Votre chocolat au lait est en cours de préparation. \n Veuillez patienter \n");

        for (int i = 0; i < 10; i++) {
            System.out.print(Color.YELLOW + point + " " + Color.RESET);
            Thread.sleep(200);
        }

        Stock.deductStockChocolate(needWater, needSugar, powderChoco, needCup, needSpoon, quantity, price, stock);

        System.out.print(Color.GREEN + " \n Votre chocolat au lait est prêt \n Bonne dégustation \n " + Color.RESET);

    }
}
