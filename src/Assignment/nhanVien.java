package Assignment;
import java.util.Scanner;
import java.util.Comparator;

public class nhanVien {
	private String maNV;
	private String hoTen;
	private Double luong;
	
	
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Double getLuong() {
		return luong;
	}
	public void setLuong(Double luong) {
		if (luong > 0){
			this.luong = luong;
		}
	}
	
	
	public Double getThuNhap() {
		return luong;
	}
	public Double getThueTN() {
		if (getThuNhap() < 9000000) {
			return 0.0;
		}
		else if (getThuNhap() < 15000000) {
			return 0.1 * getThuNhap();
		}
		else {
			return 0.12 * getThuNhap();
		}
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma NV: ");
		maNV = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap luong: ");
		do {
			try {
				luong = sc.nextDouble();
			}
			catch (Exception ex) {
				sc.nextLine();
				luong = 0.0;
			}
			if (luong <= 0) {
				System.out.println("Nhap sai!");
			}
		} while (luong <= 0);
	}
	public void xuat() {
		System.out.println("Ma NV: " + maNV);
		System.out.println("Ho ten: " + hoTen);
		System.out.printf("Thu nhap: %.2f\n", getThuNhap());
		System.out.println("Thue thu nhap: " + getThueTN());
	}
	
	
	public static Comparator<nhanVien> ssHoTen = 
			(nhanVien nv1, nhanVien nv2) -> {
		return nv1.hoTen.compareToIgnoreCase(nv2.hoTen);
	};
	public static Comparator<nhanVien> ssThuNhap = 
			(nhanVien nv1, nhanVien nv2) -> {
		if (nv1.getThuNhap() < nv2.getThuNhap()) {
			return -1;
		}
		else if (nv1.getThuNhap() == nv2.getThuNhap()) {
			return 0;
		}
		else {
			return 1;
		}
	};
}
