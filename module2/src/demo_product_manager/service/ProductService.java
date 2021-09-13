package demo_product_manager.service;

import demo_product_manager.model.Product;
import demo_product_manager.util.ReadWirteCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public interface ProductService {
    void addNew();
    void showList();
    void delete();
    void edit();

}
