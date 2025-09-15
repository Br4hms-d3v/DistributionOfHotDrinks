public class Expresso {

    private final Stock stock;

    public Expresso(Stock stock) {
        this.stock = stock;
    }

    public void make() throws InterruptedException {

        int needWater = 50;
        int needSugar = 7;
        int needBeans = 40;
        int needCup = 1;
        int needSpoon = 1;
        int quantity = 1;
        double price = 1.30;

        char point = '.';

        if (stock.getWater() < needWater || stock.getSugar() < needSugar || stock.getBeans() < needBeans || stock.getCups() < needCup || stock.getSpoons() < needSpoon) {
            System.out.println(Color.RED + "L'expresso est momentanément indisponible" + Color.RESET);
            Thread.sleep(800);
            return;
        }

        System.out.println("Votre expresso est en cours de préparation. \n Veuillez patienter \n");

        for (int i = 0; i < 10; i++) {
            System.out.print(Color.PURPLE + point + " " + Color.RESET);
            Thread.sleep(400);
        }

        Stock.deductStock(needWater, needSugar, needBeans, needCup, needSpoon, quantity, price, stock);

        System.out.print(Color.PURPLE + " \n Votre Expresso est prêt \n Bonne dégustation \n " + Color.RESET);

    }
}
