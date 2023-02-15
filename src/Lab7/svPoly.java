package Lab7;

import java.util.Comparator;

import Lab5.SanPham;

public abstract class svPoly {
	private String tenSV;
	private String nganh;
	
	
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		if (tenSV != null && !tenSV.equals("")) {
			this.tenSV = tenSV;
		}
	}
	public String getNganh() {
		return nganh;
	}
	public void setNganh(String nganh) {
		if (nganh != null && !nganh.equals("")) {
			this.nganh = nganh;
		}
	}
	
	
	public abstract Double getDiem();
	public String getHocLuc() {
		if (getDiem() < 0) {
			return "Gia tri khong hop le";
		}
		else if (getDiem() < 5) {
			return "Yeu";
		}
		else if (getDiem() < 6.5) {
			return "Trung binh";
		}
		else if (getDiem() < 7.5) {
			return "Kha";
		}
		else if (getDiem() < 9) {
			return "Gioi";
		}
		else if (getDiem() <= 10) {
			return "Xuat sac";
		}
		else {
			return "Gia tri khong hop le";
		}
	}
	public void xuat() {
		System.out.println("Ten sinh vien: " + tenSV);
		System.out.println("Nganh: " + nganh);
		System.out.println("Diem: " + getDiem());
		System.out.println("Hoc luc: " + getHocLuc());
	}
	
	public void nhap() {
		
	}
	
	
}
