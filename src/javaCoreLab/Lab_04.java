package javaCoreLab;
import Lab4.*;

public class Lab_04 {
	public static void Bai01() {
		SanPham sp = new SanPham();
		
		sp.nhap();
		sp.xuat();
	}
	public static void Bai02() {
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham("a", 100000.0);
		SanPham sp3 = new SanPham("b", 10000.0, 2000.0);
		
		sp1.nhap();
		sp2.xuat();
		sp3.xuat();
	}
}
