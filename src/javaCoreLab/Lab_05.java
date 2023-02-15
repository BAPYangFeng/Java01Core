package javaCoreLab;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

import Lab5.*;
public class Lab_05 {
	static Scanner sc = new Scanner(System.in);
	public static void Bai3() {
		ArrayList<SanPham> listSP = new ArrayList<SanPham>();
		Boolean ketthuc = false;
		while (ketthuc == false) {
			System.out.println("Menu");
			System.out.println("1. Nhap du lieu");
			System.out.println("2. Sap xep giam dan");
			System.out.println("3. Xoa san pham");
			System.out.println("4. Tinh gia trung binh");
			System.out.println("5. Thoat");
		}
		Byte luachon;
		do {
			try {
				luachon = sc.nextByte();
			}
			catch (Exception ex) {
				sc.nextLine();
				luachon = 0;
			}
			if (luachon < 1 || luachon > 5) {
				System.out.println("Chon lai!");
			}
		} while (luachon < 1 || luachon > 5);
		switch (luachon) {
			case 1:
				System.out.println("Nhap so luong: ");
				int n;
				try {
					n = sc.nextInt();
				}
				catch (Exception ex) {
					sc.nextLine();
					n = 0;
				}
				for (int i = 0; i < n; i++) {
					SanPham sp = new SanPham();
					sp.nhap();
					listSP.add(sp);
				}
				break;
			case 2:
				Comparator<SanPham> comp = new Comparator<SanPham>() {
					@Override 
					public int compare(SanPham sp1, SanPham sp2) {
						return sp1.getGia().compareTo(sp2.getGia());
					}
				};
				Collections.sort(listSP, comp);
				for (int i = 0; i < listSP.size(); i++) {
					listSP.get(i).xuat();
				}
				break;
			case 3:
				System.out.println("Nhap ten san pham can xoa: ");
				String spRemove = sc.nextLine();
				listSP.forEach((e) -> {
					if (e.getTen().toUpperCase().compareTo(spRemove.toUpperCase()) == 0) {
						listSP.remove(e);
					}
				});
				for (int i = 0; i < listSP.size(); i++) {
					listSP.get(i).xuat();
				}
				break;
			case 4:
				Double sum = 0.0;
				for (int i = 0; i < listSP.size(); i++) {
					sum += listSP.get(i).getGia();
				}
				System.out.println("Gia trung binh: " + (sum/listSP.size()));
				break;
			case 5:
				ketthuc = true;
				break;
			default:
				break;
		}
	}
}