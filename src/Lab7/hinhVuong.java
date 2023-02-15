package Lab7;
import java.util.Scanner;

public class hinhVuong extends hinhChuNhat {
	@Override
	public void setChDai(Double chDai) {
		if (chDai > 0) {
			super.setChDai(chDai);
			super.setChRong(chDai);
		}
	}
	@Override
	public void setChRong(Double chRong) {
		if (chRong > 0) {
			super.setChDai(chRong);
			super.setChRong(chRong);
		}
	}
	
	public hinhVuong() {
		super();
	}
	public hinhVuong(Double canh) {
		super(canh, canh);
	}
	
	@Override
	public void xuat() {
		System.out.println("CanhChieu rong la: " + getChDai());
		System.out.println("Chu vi la: " + ChuVi());
		System.out.println("Dien tich la: " + DienTich());
	}
	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap canh: ");
		Double canh;
		do {
			try {
				canh = sc.nextDouble();			
			}
			catch (Exception ex) {
				sc.nextLine();
				canh = 0.0;
			}
			if (canh <= 0) {
				System.out.println("Nhap lai!");
			}
		} while (canh <= 0);
		this.setChDai(canh);
	}
}
