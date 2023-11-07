package org.example;

import java.util.List;
import org.example.CSVProduct;
public class Main {
    public static void main(String arg[]) {

        ProductsServiceCSV productService = new ProductsServiceCSV();
        productService.productService("C:/Users/James/Desktop/Implementar lector de CSV " +
                "con Java/resources/inventory.csv");
    }
}