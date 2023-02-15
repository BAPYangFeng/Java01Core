package Lab5;
import java.util.Scanner;
public class SanPham {
	Scanner sc = new Scanner(System.in);
	private String ten;
	private Double gia;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Double getGia() {
		return gia;
	}
	public void setGia(Double gia) {
		if (gia > 0) {
			this.gia = gia;
		}
	}
	
	public void xuat() {
		System.out.print("Ten: " + ten);
		System.out.print("Gia: " + gia);
	}
	public void nhap() {
		System.out.print("Nhap ten: ");
		ten = sc.nextLine();
		System.out.print("Nhap gia: ");
		do {
			try {
				gia =sc.nextDouble();
			}
			catch (Exception ex) {
				sc.nextLine();
				gia = 0.0;
			}
			if (gia <= 0) {
				System.out.print("Nhap sai.");
			}
		} while (gia <= 0);
	}
}
