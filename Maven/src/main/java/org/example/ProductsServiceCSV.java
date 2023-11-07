package org.example;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class ProductsServiceCSV {
    public void productService (String ruta){

        List<CSVProduct> products_csv = new ArrayList<>();

        try {
            CSVReader reader = new CSVReaderBuilder(new FileReader(ruta)).build();
            List<String[]> productsCSV = reader.readAll();


            for (String[] line : productsCSV) {
                CSVProduct csv_product = new CSVProduct(" "," ", " ",
                        "", " ", "");
                if (line.length == 1) {
                    csv_product.setName(line[0]);
                } else if (line.length == 2){
                    csv_product.setName(line[0]);
                    csv_product.setDescription(line[1]);
                } else if (line.length == 3){
                    csv_product.setName(line[0]);
                    csv_product.setDescription(line[1]);
                    csv_product.setCategory(line[2]);
                } else if (line.length == 4) {
                    csv_product.setName(line[0]);
                    csv_product.setDescription(line[1]);
                    csv_product.setCategory(line[2]);
                    csv_product.setTags(line[3]);
                } else if (line.length == 5){
                    csv_product.setName(line[0]);
                    csv_product.setDescription(line[1]);
                    csv_product.setCategory(line[2]);
                    csv_product.setTags(line[3]);
                    csv_product.setPrice(line[4]);
                } else {
                    csv_product.setName(line[0]);
                    csv_product.setDescription(line[1]);
                    csv_product.setCategory(line[2]);
                    csv_product.setTags(line[3]);
                    csv_product.setPrice(line[4]);
                    csv_product.setImageUrl(line[5]);
                }

                if (!products_csv.contains(csv_product)) {
                    products_csv.add(csv_product);
                    System.out.println(productsCSV);
                }
            }

        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }

    }
}