package javaCoreLab;
import Lab7.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lab_07 {
	public static void Bai01() {
		hinhChuNhat hcn = new hinhChuNhat(10.0, 11.0);
		hinhVuong hv = new hinhVuong(10.0);
		
		hcn.xuat();
		hv.xuat();
	}
	
	public static void Bai03() {
		svIT sv = new svIT();
		sv.nhap();
		sv.xuat();
	}
	
	public static void Bai04() {
		ArrayList<svPoly> list = new ArrayList<svPoly>();
		Scanner sc = new Scanner(System.in);
		Boolean end = false;
		while (end == false) {
			System.out.println("Menu");
			System.out.println("1. Nhap du lieu");
			System.out.println("2. Xuat danh sach");
			System.out.println("3. Xuat danh sach sinh vien gioi");
			System.out.println("4. Sap xep giam dan theo diem");
			System.out.println("5. Thoat");
			int choose;
			System.out.println("Nhap lua chon: ");
			do {
				try {
					choose = sc.nextInt();
				}
				catch (Exception ex) {
					sc.nextLine();
					choose = 0;
				}
				if (choose < 1 || choose > 5) {
					System.out.println("Nhap lai");
				}
			} while (choose < 1 || choose > 5);
			switch (choose) {
			case 1:
				System.out.println("Nhap so luong sinh vien: ");
				int n; 
				try {
					n = sc.nextInt();
				}
				catch (Exception ex) {
					sc.nextLine();
					n = 0;
				}
				sc.nextLine();
				for (int i = 0; i < n; i++) {
					System.out.println("Chon nganh(IT/Biz): ");
					String s = sc.nextLine();
					s.trim();
					if (s.equalsIgnoreCase("IT")) {
						svIT sv = new svIT();
						sv.nhap();
						list.add(sv);
					}
					else if (s.equalsIgnoreCase("Biz")) {
						svBiz sv = new svBiz();
						sv.nhap();
						list.add(sv);
					}
					else {
						System.out.println("Nhap lai");
						i--;
					}
				}
				break;
			case 2:
				sc.nextLine();
				System.out.println("Danh sach SV: ");
				for (svPoly v : list) {
					v.xuat();
				}
			break;
			case 3:
				sc.nextLine();
				System.out.println("Danh sach sinh vien gioi: ");
				for (svPoly v : list) {
					if (v.getHocLuc().equalsIgnoreCase("Gioi")) {
						v.xuat();
					}
				}
			break;
			case 4:
				sc.nextLine();
				Comparator<svPoly> comp = new Comparator<svPoly>() {
					@Override 
					public int compare(svPoly sv1, svPoly sv2) {
						return sv1.getDiem().compareTo(sv2.getDiem());
					}
				};
				Collections.sort(list, comp);
				Collections.reverse(list);
				System.out.println("Danh sach sinh vien sau khi sap xep: ");
				list.forEach((e) -> {
					e.xuat();
				});
				break;
			case 5:
				end = true;
				break;
			default:
				break;
			}
		}
	}
}
