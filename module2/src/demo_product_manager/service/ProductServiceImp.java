package demo_product_manager.service;

import demo_product_manager.model.Product;
import demo_product_manager.util.ReadWirteCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImp implements ProductService {
    final String PATH_PRODUCT = "src\\demo_product_manager\\data\\product.csv";
     @Override
    public void addNew() {
        // them dulieu bàn phím
        // gọi đối tượng ghi file
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập price");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        ReadWirteCSV.writeListProductToCSV(productList, PATH_PRODUCT, true);

    }
    @Override
    public void showList() {
        List<Product> productList = ReadWirteCSV.getListProductFromCSV(PATH_PRODUCT);
        for (int i = 0; i < productList.size(); i++) {
            System.out.println((i + 1) + ". " + productList.get(i));
        }
    }
    @Override
    public void delete() {
        List<Product> productList = ReadWirteCSV.getListProductFromCSV(PATH_PRODUCT);
        Scanner scanner = new Scanner(System.in);
        showList();
        System.out.println("chọn product cần xóa");
        int chooseDelete = Integer.parseInt(scanner.nextLine());
        productList.remove(chooseDelete - 1);
        ReadWirteCSV.writeListProductToCSV(productList, PATH_PRODUCT, false);
        showList();

    }
    @Override
    public void edit() {
        List<Product> productList = ReadWirteCSV.getListProductFromCSV(PATH_PRODUCT);
        Scanner scanner = new Scanner(System.in);
        showList();
        System.out.println("chọn product cần xóa");
        int chooseEdit = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên mới");
        String newName = scanner.nextLine();
        productList.get(chooseEdit - 1).setName(newName);
        System.out.println("nhập giá mới");
        Double newPrice = Double.parseDouble(scanner.nextLine());
        productList.get(chooseEdit - 1).setPrice(newPrice);
        ReadWirteCSV.writeListProductToCSV(productList, PATH_PRODUCT, false);
        showList();
    }

    public void searchByName(){
        List<Product> productList = ReadWirteCSV.getListProductFromCSV(PATH_PRODUCT);
        Scanner scanner = new Scanner(System.in);;
        System.out.println("nhập tên cần tìm kiếm");
        String nameSerch= scanner.nextLine();
        for (Product product: productList){
            if (product.getName().contains(nameSerch)){
                System.out.println(product);
            }
        }

    }
}
