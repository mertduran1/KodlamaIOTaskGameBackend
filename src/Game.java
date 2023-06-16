public class Game implements Entity {
    private int id;
    private String gameName;
    private double gamePrice;
    private double discount;
    private String gameCategory;
    private int numberInStock;

    public Game(int id, String gameName, double gamePrice, double discount, String gameCategory, int numberInStock) {
        this.id = id;
        this.gameName = gameName;
        this.gamePrice = gamePrice;
        this.discount = discount;
        this.gameCategory = gameCategory;
        this.numberInStock = numberInStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
    }

    public int getNumberInStock() {
        return numberInStock;
    }

    public void setNumberInStock(int numberInStock) {
        this.numberInStock = numberInStock;
    }
}
