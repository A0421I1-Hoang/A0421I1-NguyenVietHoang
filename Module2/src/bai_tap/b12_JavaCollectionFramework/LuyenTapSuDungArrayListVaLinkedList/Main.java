package b12_JavaCollectionFramework.LuyenTapSuDungArrayListVaLinkedList;

public class Main {
    public static void main(String[] args) {
        ProductManager<Product> ProductList = new ProductManager<>();
        ProductList.add(0, new Product(1,"IPhone",22000000));
        ProductList.add(1, new Product(2,"SamSung",15000000));
        ProductList.add(2, new Product(3,"Nokia",10000000));

        System.out.println(ProductList.toString());
    }
}
