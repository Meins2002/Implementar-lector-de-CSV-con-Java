import model.ProductsService;

public class Main {
    public static void main(String[] args) {
        ProductsService printProduct = new ProductsService();
        printProduct.productSrvice("C:/Users/James/Desktop/Implementar lector de CSV con Java/resources/inventory.csv");
        printProduct.Ruta();
        System.out.println(printProduct);

    }
}