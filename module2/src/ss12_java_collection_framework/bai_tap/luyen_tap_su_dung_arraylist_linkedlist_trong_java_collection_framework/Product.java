package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist_trong_java_collection_framework;

public class Product {
    private int idOfProduct;
    private String nameOfProduct;
    private double priceOfProduct;

    public Product() {
    }

    public Product(int idOfProduct, String nameOfProduct, double priceOfProduct) {
        this.idOfProduct = idOfProduct;
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
    }

    public int getIdOfProduct() {
        return idOfProduct;
    }

    public void setIdOfProduct(int idOfProduct) {
        this.idOfProduct = idOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }
    @Override
    public String toString () {
        return "Product @ id = " + getIdOfProduct() + ", name = " + getNameOfProduct() + ", price = " + getPriceOfProduct();
    }
}
