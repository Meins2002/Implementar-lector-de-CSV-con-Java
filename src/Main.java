import model.ProductsService;

public class Main {
    public static void main(String[] args) {
        ProductsService printProduct = new ProductsService();
        printProduct.productSrvice("csv-reader-java/resources/inventory.csv");
        printProduct.Ruta();
        System.out.println(printProduct);

    }
}