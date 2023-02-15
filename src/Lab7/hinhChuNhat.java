package Lab7;
import java.util.Scanner;

public class hinhChuNhat {
	private Double chDai;
	private Double chRong;
	
	
	public Double getChDai() {
		return chDai;
	}
	public void setChDai(Double chDai) {
		if (chDai > 0) {
			this.chDai = chDai;
		}
	}
	public Double getChRong() {
		return chRong;
	}
	public void setChRong(Double chRong) {
		if (chRong > 0) {
			this.chRong = chRong;
		}
	}
	
	
	public hinhChuNhat() {
		chDai = 0.0;
		chRong = 0.0;
	}
	public hinhChuNhat(Double chDai, Double chRong) {
		this.chDai = chDai;
		this.chRong = chRong;
	}
	
	
	public Double ChuVi() {
		return (chDai + chRong)*2;
	}
	public Double DienTich() {
		return chDai*chRong;
	}
	
	
	public void xuat() {
		System.out.println("Chieu dai la: " + chDai);
		System.out.println("Chieu rong la: " + chRong);
		System.out.println("Chu vi la: " + ChuVi());
		System.out.println("Dien tich la: " + DienTich());
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		do {
			try {
				chDai = sc.nextDouble();			
			}
			catch (Exception ex) {
				sc.nextLine();
				chDai = 0.0;
			}
			if (chDai <= 0) {
				System.out.println("Nhap lai!");
			}
		} while (chDai <= 0);
		System.out.println("Nhap chieu rong: ");
		do {
			try {
				chRong = sc.nextDouble();			
			}
			catch (Exception ex) {
				sc.nextLine();
				chRong = 0.0;
			}
			if (chDai <= 0) {
				System.out.println("Nhap lai!");
			}
		} while (chRong <= 0);
	}
}
