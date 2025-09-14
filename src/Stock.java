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
        if (water == 1000) {
            System.out.println("Il y a " + water + " ml d'eau" + "\t " + Color.GREEN + "Vous avez que la moitié d'eau" + Color.RESET);
        } else if (water <= 500) {
            System.out.println("Il y a " + water + " ml d'eau" + "\t " + Color.RED + "L'eau est presque vide !" + Color.RESET);
        } else {
            System.out.println("Il y a " + water + " ml d'eau");
        }

        System.out.println("Il y a " + sugar + " gr de sucre");
        System.out.println("Il y a " + beans + " gr de café");
        System.out.println("Il y a " + powderChoco + " gr de poudre de chocolat");
        System.out.println("Il y a " + cups + " goblets");
        System.out.println("Il y a " + spoons + " cuillères \n ");
        System.out.println("Vous avez vendu : " + quantity + " boissons");
        System.out.println("Vous avez gagné : " + money + " € \n ");
    }

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
