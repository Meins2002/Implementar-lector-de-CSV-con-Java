package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class  ProductsService implements CSV{
    public void productSrvice (String ruta){

        List<Product> products_csv = new ArrayList<>();

        try {
            File file = new File(ruta);
            Scanner fileScanner = new Scanner(file);
            //Saltar el encabezado del CSV
            fileScanner.nextLine();
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] productInfo = line.split(",");
                System.out.println(productInfo[0]); // [0] Columnas
                System.out.println(line);


                Product producto = new Product("", "", "", "", "",
                        "");
                if (productInfo.length == 1) {
                    producto.setName(productInfo[0]);
                } else if (productInfo.length == 2) {
                    producto.setName(productInfo[0]);
                    producto.setDescription(productInfo[1]);
                } else if (productInfo.length == 3) {

                    System.out.println("Si entro a la validación");
                    // Agregar el nuevo elemento al final del nuevo arreglo
                    producto.setName(productInfo[0]);
                    producto.setDescription(productInfo[1]);
                    producto.setCategory(productInfo[2]);

                } else if (productInfo.length == 4) {
                    //Product producto = new Product(productInfo[0], productInfo[1], productInfo[2], productInfo[3],
                    //        productInfo[4], productInfo[5]);
                    producto.setName(productInfo[0]);
                    producto.setDescription(productInfo[1]);
                    producto.setCategory(productInfo[2]);
                    producto.setTags(productInfo[3]);
                } else if ((productInfo.length == 5)) {
                    producto.setName(productInfo[0]);
                    producto.setDescription(productInfo[1]);
                    producto.setCategory(productInfo[2]);
                    producto.setTags(productInfo[3]);
                    producto.setPrice(productInfo[4]);

                } else {
                    producto.setName(productInfo[0]);
                    producto.setDescription(productInfo[1]);
                    producto.setCategory(productInfo[2]);
                    producto.setTags(productInfo[3]);
                    producto.setPrice(productInfo[4]);
                    producto.setImageUrl(productInfo[5]);
                }

                //TODO implement the logic to transform this code so it can convert the information in each line into a Product objet
                if (!products_csv.contains(producto)) {
                    products_csv.add(producto);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
    @Override
    public void Ruta() {
        System.out.println("Ingrese cualquier archivo CSV con la ruta correcta");
    }
}