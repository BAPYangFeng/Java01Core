package Assignment;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MainAssignment {
	static ArrayList<nhanVien> list = new ArrayList<nhanVien>();
	static Scanner scan = new Scanner(System.in);
	public static void assignmentMenu() {
		Boolean testAss = true;
		Byte choose;
		while (testAss) {
			System.out.println("****************** MENU ******************");
			System.out.println("1. Nhap danh sach sinh vien");
			System.out.println("2. Xuat danh sach sinh vien ra man hinh");
			System.out.println("3. Tim nhan vien theo ma");
			System.out.println("4. Xoa nhan vien theo ma");
			System.out.println("5. Cap nhat thong tin theo ma");
			System.out.println("6. Tim nhan vien theo khoang luong");
			System.out.println("7. Sap xep nhan vien theo ho ten");
			System.out.println("8. Sap xep nhan vien theo thu nhap");
			System.out.println("9. Xuat 5 nhan vien cos thu nhap cao nhat");
			System.out.println("0. Ket thuc");
			System.out.println("******************************************");
			do {
				System.out.println("Moi ban chon chuc nang");
				try {
					choose = scan.nextByte();
				}
				catch (Exception ex) {
					scan.nextLine();
					choose = 0;
				}
				if (choose < 1 || choose > 9) {
					System.out.println("Chon lai.");
				}
			} while (choose < 1 || choose > 9);
			switch (choose) {
			case 1:{
				chucNang01();
				break;
			}
			case 2:{
				chucNang02();
				break;
			}
			case 3:{
				chucNang03();
				break;
			}
			case 4:{
				chucNang04();
				break;
			}
			case 5:{
				break;
			}
			case 6:{
				break;
			}
			case 7:{
				break;
			}
			case 8:{
				break;
			}
			case 9:{
				break;
			}
			case 0:{
				testAss = false;
				break;
			}
			}
		}
	}
	private static void chucNang01() {
		System.out.println("Nhap so luong NV: ");
		int n;
		try {
			n = scan.nextInt();
		}
		catch (Exception ex) {
			scan.nextLine();
			n = 0;
		}
		for (int i = 0; i < n; i++) {
			scan.nextLine();
			System.out.println("Nhap nhan vien: " + (i+1));
			System.out.println("Loai nhan vien (HC/TT/TP): ");
			String s = scan.nextLine();
			if (s.trim().equalsIgnoreCase("HC")) {
				nhanVien nv = new nhanVien();
				nv.nhap();
				list.add(nv);
			}
			else if(s.trim().equalsIgnoreCase("TT")) {
				tiepThi nv = new tiepThi();
				nv.nhap();
				list.add(nv);
			}
			else if (s.trim().equalsIgnoreCase("TP")) {
				truongPhong nv = new truongPhong();
				nv.nhap();
				list.add(nv);
			}
			else {
				System.out.println("Nhap sai!");
				i--;
			}
		}
	}
	private static void chucNang02() {
		list.forEach((e) -> {
			e.xuat();
		});
	}
	private static void chucNang03() {
		System.out.println("Nhap ma nhan vien can tim: ");
		String search = scan.nextLine();
		search.trim();
		list.forEach((e) -> {
			if (e.getMaNV().toUpperCase().compareTo(search.toUpperCase()) == 0) {
				e.xuat();
			}
		});
	}
	private static void chucNang04() {
		System.out.println("Nhap ma nhan vien can xoa: ");
		String search = scan.nextLine();
		search.trim();
		list.forEach((e) -> {
			if (e.getMaNV().toUpperCase().compareTo(search.toUpperCase()) == 0) {
				list.remove(e);
			}
		});
	}
	
}



























