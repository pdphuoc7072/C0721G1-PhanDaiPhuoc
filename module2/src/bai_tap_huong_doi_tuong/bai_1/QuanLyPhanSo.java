package bai_tap_huong_doi_tuong.bai_1;

import java.util.Scanner;

public class QuanLyPhanSo {
    public void dinhGiaTri (PhanSo phanSo) {
        try {
            if (phanSo.getMauSo() == 0) {
                throw new NgoaiLePhanSo("Mẫu số không được bằng 0. Hãy nhập lại.");
            }
        } catch (NgoaiLePhanSo ngoaiLePhanSo) {
            System.out.println(ngoaiLePhanSo.getMessage());
        }
    }
    public PhanSo nhap() {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.print("Hãy nhập tử số: ");
            a = Integer.parseInt(scanner.nextLine());
            System.out.print("Hãy nhập mẫu số: ");
            b = Integer.parseInt(scanner.nextLine());
            PhanSo phanSo = new PhanSo(a, b);
            dinhGiaTri(phanSo);
        } while (b == 0);
        return new PhanSo(a, b);
    }
    public void xuat (PhanSo phanSo) {
        if (phanSo.getTuSo() * phanSo.getMauSo() < 0) {
            System.out.println("-" + Math.abs(phanSo.getTuSo()) + "/" + Math.abs(phanSo.getMauSo()));
        } else {
            System.out.println(Math.abs(phanSo.getTuSo()) + "/" + Math.abs(phanSo.getMauSo()));
        }
    }
    public PhanSo cong (PhanSo phanSo1, PhanSo phanSo2) {
        int a = phanSo1.getTuSo() * phanSo2.getMauSo() + phanSo1.getMauSo() * phanSo2.getTuSo();
        int b = phanSo1.getMauSo() * phanSo2.getMauSo();
        return toiGianPhanSo(new PhanSo(a, b));
    }
    public PhanSo tru (PhanSo phanSo1, PhanSo phanSo2) {
        int a = phanSo1.getTuSo() * phanSo2.getMauSo() - phanSo1.getMauSo() * phanSo2.getTuSo();
        int b = phanSo1.getMauSo() * phanSo2.getMauSo();
        return toiGianPhanSo(new PhanSo(a, b));
    }
    public PhanSo nhan (PhanSo phanSo1, PhanSo phanSo2) {
        int a = phanSo1.getTuSo() * phanSo2.getTuSo();
        int b = phanSo1.getMauSo() * phanSo2.getMauSo();
        return toiGianPhanSo(new PhanSo(a, b));
    }
    public PhanSo chia (PhanSo phanSo1, PhanSo phanSo2) {
        int a = phanSo1.getTuSo() * phanSo2.getMauSo();
        int b = phanSo1.getMauSo() * phanSo2.getTuSo();
        return toiGianPhanSo(new PhanSo(a, b));
    }
    private int timUSCLN (int a, int b) {
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
    private PhanSo toiGianPhanSo (PhanSo phanSo) {
        int x = timUSCLN(phanSo.getTuSo(), phanSo.getMauSo());
        return new PhanSo(phanSo.getTuSo()/x, phanSo.getMauSo()/x);
    }
}
