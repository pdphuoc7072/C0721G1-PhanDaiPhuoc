package demo_product_manager.controller;

import demo_product_manager.service.ProductService;
import demo_product_manager.service.ProductServiceImp;

import java.util.Scanner;

public class Main {
    static ProductServiceImp productServiceImp = new ProductServiceImp();

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("Chọn chức năng\n" +
                    "1.Add\n" +
                    "2.show\n" +
                    "3.delete\n" +
                    "4.edit\n" +
                    "5.search\n" +
                    "6.Exti");
            System.out.println("Chọn");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productServiceImp.addNew();
                    break;
                case 2:
                    productServiceImp.showList();
                    break;
                case 3:
                    productServiceImp.delete();
                    break;
                case 4:
                    productServiceImp.edit();
                    break;
                case 5:
                    productServiceImp.searchByName();
                    break;
                    // search
                case 6:
                    flag = false;
            }
        }
    }
}
