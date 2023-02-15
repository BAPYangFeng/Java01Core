package Lab6;
import java.util.Scanner;
public class SanPham {
	Scanner sc = new Scanner(System.in);
	String tenSP;
	private Double donGia;
	String hang;
	
	
	public Double getDonGia() {
		return donGia;
	}
	public void setDonGia(Double donGia) {
		if (donGia > 0) {
			this.donGia = donGia;
		}
	}
	
	
	public SanPham() {
		
	}
	public SanPham(String tenSP, Double donGia, String hang) {
		tenSP = null;
		donGia = 0.0;
		hang = null;
	}
	 
	
	public void nhap() {
		System.out.println("Nhap ten san pham: ");
		tenSP = sc.nextLine();
		System.out.println("Nhap gia: ");
		do {
			try {
				donGia =sc.nextDouble();
			}
			catch (Exception ex) {
				sc.nextLine();
				donGia = 0.0;
			}
			if (donGia <= 0) {
				System.out.println("Nhap sai");
			}
		} while (donGia <= 0);
		System.out.println("Nhap hang: ");
		hang = sc.nextLine();
	}
	public void xuat() {
		System.out.println("Ten san pham: " + tenSP);
		System.out.println("Gia san pham: " + donGia);
		System.out.println("Hang: " + hang);
	}
}
