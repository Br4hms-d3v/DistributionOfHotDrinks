public class Coffee {

    private Stock stock;

    public Coffee(Stock stock) {
        this.stock = stock;
    }

    public void make() throws InterruptedException {

        int needWater = 150;
        int needSugar = 20;
        int needBeans = 30;
        int needCup = 1;
        int needSpoon = 1;
        int quantity = 1;
        double price = 0.90;

        char point = '.';

        if (stock.getWater() < needWater || stock.getSugar() < needSugar || stock.getBeans() < needBeans || stock.getCups() < needCup || stock.getSpoons() < needSpoon) {
            System.out.println(Color.RED + "Le café est momentanément indisponible" + Color.RESET);
            Thread.sleep(800);
            return;
        }

        System.out.println("Votre café est en cours de préparation. \n Veuillez patienter \n");

        for (int i = 0; i < 10; i++) {
            System.out.print(Color.YELLOW + point + " " + Color.RESET);
            Thread.sleep(300);
        }

        Stock.deductStock(needWater, needSugar, needBeans, needCup, needSpoon, quantity, price, stock);

        System.out.print(Color.GREEN + " \n Votre café est prêt \n Bonne dégustation \n " + Color.RESET);

    }
}
