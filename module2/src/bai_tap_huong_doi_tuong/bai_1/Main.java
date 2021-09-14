package bai_tap_huong_doi_tuong.bai_1;

public class Main {
    public static void main(String[] args) {
        QuanLyPhanSo quanLyPhanSo = new QuanLyPhanSo();
        PhanSo phanSo1 = new PhanSo();
        PhanSo phanSo2 = new PhanSo();
        System.out.println("Hãy nhập phân số thứ 1: ");
        phanSo1 = quanLyPhanSo.nhap();
        System.out.println("Hãy nhập phân số thứ 2: ");
        phanSo2 = quanLyPhanSo.nhap();
        System.out.println("Bạn đã nhập phân số thứ 1 là: ");
        quanLyPhanSo.xuat(phanSo1);
        System.out.println("Bạn đã nhập phân số thứ 2 là: ");
        quanLyPhanSo.xuat(phanSo2);
        System.out.println("Cộng: ");
        quanLyPhanSo.xuat(quanLyPhanSo.cong(phanSo1, phanSo2));
        System.out.println("Trừ: ");
        quanLyPhanSo.xuat(quanLyPhanSo.tru(phanSo1, phanSo2));
        System.out.println("Nhân: ");
        quanLyPhanSo.xuat(quanLyPhanSo.nhan(phanSo1, phanSo2));
        System.out.println("Chia: ");
        quanLyPhanSo.xuat(quanLyPhanSo.chia(phanSo1, phanSo2));

    }
}
