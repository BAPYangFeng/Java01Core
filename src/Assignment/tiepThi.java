package Assignment;
import java.util.Scanner;

public class tiepThi extends nhanVien{
	private Double doanhSo;
	private Double hoaHong;
	
	
	public Double getDoanhSo() {
		return doanhSo;
	}
	public void setDoanhSo(Double doanhSo) {
		if (doanhSo >= 0) {
			this.doanhSo = doanhSo;
		}
	}
	public Double getHoaHong() {
		return hoaHong;
	}
	public void setHoaHong(Double hoaHong) {
		if (hoaHong >= 0) {
			this.hoaHong = hoaHong;
		}
	}
	
	
	@Override public Double getThuNhap() {
		return getLuong() + doanhSo + hoaHong;
	}
	@Override public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap doanh so: ");
		do {
			try{
				doanhSo = sc.nextDouble();
			}
			catch (Exception ex) {
				sc.nextLine();
				doanhSo = -1.0;
			}
			if (doanhSo < 0) {
				System.out.println("Nhap lai!");
			}
		} while (doanhSo < 0);
		System.out.println("Nhap hoa hong: ");
		do {
			try {
				hoaHong = sc.nextDouble();
			}
			catch (Exception ex) {
				sc.nextLine();
				hoaHong = -1.0;
			}
			if (hoaHong < 0) {
				System.out.println("Nhap lai!");
			}
		} while (hoaHong < 0);
	}
}
