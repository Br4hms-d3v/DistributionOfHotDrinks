public class Stock {

    private int water = 2000; // 2L of water
    private int sugar = 500; // 500 gr of sugar
    private int beans = 1000; // 1kg of coffee
    private int powderChoco = 1000; // 1kg of chocolate
    private int cups = 250; // 250 cups of coffee
    private int spoons = 250; // 250 teaspoon
    private int quantity = 0; // Number of drinks sold
    private double money = 0.00; // Money earn

    public void check() {
        if (water <= 1000 && water >= 950) {
            System.out.println("Il y a " + water + " ml d'eau" + "\t " + Color.GREEN + "Vous avez que la moitié d'eau" + Color.RESET);
        } else if (water <= 500 && water >= 1) {
            System.out.println("Il y a " + water + " ml d'eau" + "\t " + Color.YELLOW + "L'eau est presque vide !" + Color.RESET);
        } else if (water == 0) {
            System.out.println(Color.RED + "L'eau est vide!!" + Color.RESET);
        } else {
            System.out.println("Il y a " + water + " ml d'eau");
        }

        if (sugar <= 250 && sugar >= 200) {
            System.out.println("Il y a " + sugar + " gr de sucre" + "\t " + Color.GREEN + "Vous avez que la moitié du sucre" + Color.RESET);
        } else if (sugar <= 125 && sugar >= 1) {
            System.out.println("Il ne reste que " + sugar + " gr de sucre" + "\t " + Color.YELLOW + "Attention, c'est presque vide !" + Color.RESET);
        } else if (sugar == 0) {
            System.out.println(Color.RED + "Le sucre est vide!!" + Color.RESET);
        } else {
            System.out.println("Il y a " + sugar + " gr de sucre");
        }

        if (beans <= 500 && beans >= 450) {
            System.out.println("Il y a " + beans + " gr de café" + "\t " + Color.GREEN + "il ne reste que la moitié des graines de café" + Color.RESET);
        } else if (beans <= 250 && beans >= 1) {
            System.out.println("Il ne reste que " + beans + " gr de café" + "\t " + Color.YELLOW + "Attention, c'est presque vide !" + Color.RESET);
        } else if (beans == 0) {
            System.out.println(Color.RED + "Le café est vide!!" + Color.RESET);
        } else {
            System.out.println("Il y a " + beans + " gr de café");
        }

        if (powderChoco <= 500 && powderChoco >= 450) {
            System.out.println("Il y a " + powderChoco + " gr de cacao" + "\t " + Color.GREEN + "il ne reste que la moitié " + Color.RESET);
        } else if (powderChoco <= 250 && powderChoco >= 1) {
            System.out.println("Il ne reste que " + powderChoco + " gr de café" + "\t " + Color.YELLOW + "Attention, c'est presque vide !" + Color.RESET);
        } else if (powderChoco == 0) {
            System.out.println(Color.RED + "Le cacao est vide!!" + Color.RESET);
        } else
            System.out.println("Il y a " + powderChoco + " gr de poudre de chocolat");

        if (cups <= 125 && cups >= 120) {
            System.out.println("Il y a " + cups + " goblets" + "\t " + Color.GREEN + "il ne reste que la moitié " + Color.RESET);
        } else if (cups <= 62 && cups >= 1) {
            System.out.println("Il ne reste que " + cups + " goblets" + "\t " + Color.YELLOW + "Attention, c'est presque vide !" + Color.RESET);
        } else if (cups == 0) {
            System.out.println(Color.RED + "Les goblets sont vide!!" + Color.RESET);
        } else
            System.out.println("Il y a " + cups + " goblets");

        if (spoons <= 125 && spoons >= 120) {
            System.out.println("Il y a " + spoons + " cuillères" + "\t " + Color.GREEN + "il ne reste que la moitié " + Color.RESET);
        } else if (spoons <= 62 && spoons >= 1) {
            System.out.println("Il ne reste que " + spoons + " cuillères" + "\t " + Color.YELLOW + "Attention, c'est presque vide !" + Color.RESET);
        } else if (spoons == 0) {
            System.out.println(Color.RED + "Le cuillères sont vide!!" + Color.RESET);
        } else
            System.out.println("Il y a " + spoons + " cuillères \n ");


        System.out.println("Vous avez vendu : " + quantity + " boissons");
        System.out.println("Vous avez gagné : " + String.format("%.2f", money) + " € \n ");
    }

    static void deductStock(int needWater, int needSugar, int needBeans, int needCup, int needSpoon, int quantity, double price, Stock stock) {
        stock.setWater(stock.getWater() - needWater);
        stock.setSugar(stock.getSugar() - needSugar);
        stock.setBeans(stock.getBeans() - needBeans);
        stock.setCups(stock.getCups() - needCup);
        stock.setSpoons(stock.getSpoons() - needSpoon);
        stock.setQuantity(stock.getQuantity() + quantity);
        stock.setMoney(stock.getMoney() + price);
    }

    static void deductStockChocolate(int needWater, int needSugar, int powderChoco, int needCup, int needSpoon, int quantity, double price, Stock stock) {
        stock.setWater(stock.getWater() - needWater);
        stock.setSugar(stock.getSugar() - needSugar);
        stock.setPowderChoco(stock.getPowderChoco() - powderChoco);
        stock.setCups(stock.getCups() - needCup);
        stock.setSpoons(stock.getSpoons() - needSpoon);
        stock.setQuantity(stock.getQuantity() + quantity);
        stock.setMoney(stock.getMoney() + price);
    }

    void fillWater() throws InterruptedException {
        if (this.water == 2000) {
            System.out.println(Color.CYAN + "L'eau est déjà remplie" + Color.RESET);
            Thread.sleep(500);

        } else {
            this.water = 2000;
            System.out.println(Color.BLUE + "L'eau est maintenant remplie" + Color.RESET);
            Thread.sleep(500);
        }
    }

    void fillSugar() throws InterruptedException {
        if (this.sugar == 500) {
            System.out.println(Color.CYAN + "Le sucre est déjà plein" + Color.RESET);
            Thread.sleep(500);

        } else {
            this.sugar = 500;
            System.out.println(Color.BLUE + "Le sucre est remplie" + Color.RESET);
            Thread.sleep(500);
        }
    }

    void fillBeans() throws InterruptedException {
        if (this.beans == 1000) {
            System.out.println(Color.CYAN + "Le café est plein" + Color.RESET);
            Thread.sleep(500);
        } else {
            this.beans = 1000;
            System.out.println(Color.BLUE + "Le café est maintenant remplie" + Color.RESET);
            Thread.sleep(500);
        }
    }

    void fillPowderChoco() throws InterruptedException {
        if (this.powderChoco == 1000) {
            System.out.println(Color.CYAN + "La poudre au chocolat est plein" + Color.RESET);
            Thread.sleep(500);
        } else {
            this.powderChoco = 1000;
            System.out.println(Color.BLUE + "La poudre au chocolat est maintenant remplie" + Color.RESET);
            Thread.sleep(500);
        }
    }

    void fillCups() throws InterruptedException {
        if (this.cups == 250) {
            System.out.println(Color.CYAN + "Il y a assez de globets" + Color.RESET);
            Thread.sleep(500);
        } else {
            this.cups = 250;
            System.out.println(Color.BLUE + "Les globets sont remplie" + Color.RESET);
            Thread.sleep(500);
        }
    }

    void fillSpoons() throws InterruptedException {
        if (this.spoons == 250) {
            System.out.println(Color.CYAN + "Il y a assez de cuillères" + Color.RESET);
            Thread.sleep(500);
        } else {
            this.spoons = 250;
            System.out.println(Color.BLUE + "Le cuillères sont maintenant remplie" + Color.RESET);
            Thread.sleep(500);
        }
    }

    // Getters and Setters
    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public int getPowderChoco() {
        return powderChoco;
    }

    public void setPowderChoco(int powderChoco) {
        this.powderChoco = powderChoco;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public int getSpoons() {
        return spoons;
    }

    public void setSpoons(int spoons) {
        this.spoons = spoons;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
