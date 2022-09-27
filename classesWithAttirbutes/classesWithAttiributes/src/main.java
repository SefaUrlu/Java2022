public class main {
    public static void main(String[] args) {

        Product product = new Product(1,"laptop","Asus laptop",3000,2);
        System.out.println(product.getDescription());

        product.setName("laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmounbt(3);
        product.getKod();


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());


    }
}
