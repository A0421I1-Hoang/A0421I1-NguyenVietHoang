package b17_BinaryFile.QuanLySanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Product> products) {
        try {
            FileOutputStream fos=new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"Nokia X6","Nokia",1000000,"Chất lượng cao"));
        products.add(new Product(2,"Samsung Galaxy Note 8","Samsung",2000000,"Chất lượng cao"));
        products.add(new Product(3,"Iphone 13","Apple",2300000,"Chất lượng cao"));
        writeToFile("Product.txt", products);
    }
}
