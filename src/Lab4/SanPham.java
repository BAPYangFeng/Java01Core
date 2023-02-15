package Lab4;
import java.util.Scanner;

public class SanPham {
	Scanner sc = new Scanner(System.in);
	public String tenSP;
	private Double giaSP;
	private Double giamgia;
	
	public Double getGiaSP() {
		return giaSP;
	}
	public void setGiaSP(Double giaSP) {
		if (giaSP > 0) {
			this.giaSP = giaSP;
		}
	}
	public Double getGiamgia() {
		return giamgia;
	}
	public void setGiamgia(Double giamgia) {
		if (giamgia >= 0 && giamgia <= giaSP) {
			this.giamgia = giamgia;
		}
	}
	public SanPham() {
		tenSP = null;
		giaSP = 0.0;
		giamgia = 0.0;
	}
	public SanPham(String tenSP, Double giaSP) {
		this.tenSP = tenSP;
		if (giaSP > 0) {
			this.giaSP = giaSP;
		}
		else {
			this.giaSP = 0.0;
		}
		giamgia = 0.0;
	}
	public SanPham(String tenSP, Double giaSP, Double giamgia) {
		this.tenSP = tenSP;
		if (giaSP > 0) {
			this.giaSP = giaSP;
		}
		else {
			this.giaSP = 0.0;
		}
		if (giamgia >= 0 && giamgia <= giaSP) {
		this.giamgia = giamgia;
		}
	}
	public Double get_thueNK() {
		return 0.1*giaSP;
	}
	public void nhap() {
		sc.nextLine();
		System.out.print("Nhap ten SP: ");
		tenSP = sc.nextLine();
		System.out.print("Nhap gia SP: ");
		Double gia;
		do {
			try {
				gia = sc.nextDouble();
			}
			catch (Exception ex) {
				sc.nextLine();
				gia = 0.0;
			}
			if (gia <= 0) {
				System.out.print("Nhap lai.");
			}
		} while (gia <= 0);
		this.giaSP = gia;
		System.out.print("Nhap giam gia: ");
		Double giam;
		do {
			try {
				giam = sc.nextDouble();
			}
			catch (Exception ex) {
				sc.nextLine();
				giam = -1.0;
			}
			if (giam < 0 || giam > gia) {
				System.out.print("Nhap lai.");
			}
		} while (giam < 0 || giam > gia);
		this.giamgia = giam;
	}
	public void xuat() {
		System.out.println("Ten san pham: " + tenSP);
		System.out.println("Don gia: " + giaSP);
		System.out.println("Giam gia: " + giamgia);
		System.out.println("Thue nhap khau: " + (0.1*giaSP));
	}
}















