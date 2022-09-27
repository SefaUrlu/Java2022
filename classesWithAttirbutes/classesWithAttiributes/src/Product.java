public class Product {
    public Product(int id, String name, String description, double price, int stockAmounbt){

        System.out.println("yapıcı blok çaolışltı");
        this.id = id;
        this.name = name;
        this.description=description;
        this.price=price;
        this.stockAmounbt=stockAmounbt;

    }

    public Product() {

    }

    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmounbt;
    private String kod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        price = price;
    }

    public int getStockAmounbt() {
        return stockAmounbt;
    }

    public void setStockAmounbt(int stockAmounbt) {
        this.stockAmounbt = stockAmounbt;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }
}
