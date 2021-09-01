package ss17_io_binary_file_va_serialization.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable, Comparable<Product> {
    private int idOfProduct;
    private String nameOfProduct;
    private String manufacturerOfProduct;
    private double priceOfProduct;
    private String otherDescription;

    public Product() {
    }

    public Product(int idOfProduct, String nameOfProduct, String manufacturerOfProduct, double priceOfProduct, String otherDescription) {
        this.idOfProduct = idOfProduct;
        this.nameOfProduct = nameOfProduct;
        this.manufacturerOfProduct = manufacturerOfProduct;
        this.priceOfProduct = priceOfProduct;
        this.otherDescription = otherDescription;
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

    public String getManufacturerOfProduct() {
        return manufacturerOfProduct;
    }

    public void setManufacturerOfProduct(String manufacturerOfProduct) {
        this.manufacturerOfProduct = manufacturerOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public String getOtherDescription() {
        return otherDescription;
    }

    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    @Override
    public String toString() {
        return "Product { " +
                "idOfProduct = " + idOfProduct +
                ", nameOfProduct = " + nameOfProduct +
                ", manufacturerOfProduct = " + manufacturerOfProduct +
                ", priceOfProduct = " + priceOfProduct +
                ", otherDescription = " + otherDescription +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getIdOfProduct() - o.getIdOfProduct();
    }
}
