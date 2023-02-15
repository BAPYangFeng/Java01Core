package javaCoreLab;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab_03 {
	static Scanner sc = new Scanner(System.in);
	public static void Bai1()
	{
		System.out.print("Nhập số cần kiểm tra: ");
		Double numTest = sc.nextDouble();
		Boolean test = true;
		for (Byte i = 2; i < (numTest - 1); i++)
		{
			if (numTest % i == 0)
			{
				test = false;
				break;
			}
		}
		if (test) 
		{
			System.out.print("Số " + numTest + " là số nguyên tố.");
		}
		else 
		{
			System.out.print("Số " + numTest + " không là số nguyên tố.");
		}
	}
	
	public static void Bai2()
	{
		for (Integer i = 1; i <= 9; i++)
		{
			System.out.println("Bảng cửu chương " + i);
			for (Integer j = 1; j <= 9; j++)
			{
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println("");
		}
	}
	
	public static void Bai3()
	{
		System.out.print("Nhập số phần tử mảng: ");
		Byte n = sc.nextByte();
		Integer array[] = new Integer[n];
		for (Byte i = 0; i < n; i++)
		{
			System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		Integer min = array[0];
		for (Byte i = 0; i < n; i++)
		{
			min = Math.min(min, array[i]);
		}
		Byte count = 0;
		Integer sum = 0;
		for (Byte i = 0; i < n; i++)
		{
			if (array[i] % 3 == 0)
			{
				count++;
				sum += array[i];
			}
		}
		System.out.println("-------------------------------------------");
		System.out.println("Mảng sau sắp xếp.");
		for (Byte i = 0; i < n; i++)
		{
			System.out.println("Phần tử thứ " + (i+1) + ": " + array[i]);
		}
		System.out.println("Số bé nhất là: " + min);
		System.out.println("Trung bình cộng các số chia hết cho 3 là: " + (sum/count));
	}
	public static void Bai4()
	{
		ArrayList<String> hoten = new ArrayList<String>();
		ArrayList<Double> diem = new ArrayList<Double>();
		ArrayList<String> hocluc = new ArrayList<String>();
		System.out.println("Nhap so sinh vien: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Sinh vien thu " + i);
			System.out.println("Ho ten: ");
			hoten.add(sc.nextLine());
			System.out.println("Diem trung binh: ");
			double a = sc.nextDouble();
			diem.add(a);
			if (a < 5) {
				hocluc.add("Yeu");
			}
			else if (a < 6.5) {
				hocluc.add("TB");
			}
			else if (a < 7.5) {
				hocluc.add("Kha");
			}
			else if (a < 9) {
				hocluc.add("Gioi");
			}
			else {
				hocluc.add("Xuat sac");
			}
		}
		System.out.println("\n-------------------");
		System.out.println("Danh sach sinh vien da nhap: ");
		for (int i = 0; i < hoten.size(); i++) {
			System.out.println("Sinh vien thu " + (i+1));
			System.out.println("Ho ten: " + hoten.get(i));
			System.out.println("Diem trung binh: " + diem.get(i));
			System.out.println("Hoc luc: " + hocluc.get(i));
		}
		
		for (int i = 0; i < hoten.size() - 1; i++) {
			for (int j = i+1; j < hoten.size(); j++) {
				if (diem.get(i) > diem.get(j)) {
					Collections.swap(hoten, i, j);
					Collections.swap(diem, i, j);
					Collections.swap(hocluc, i, j);
				}
			}
		}
		
		System.out.println("\n----------------");
		System.out.println("Danh sach sinh vien da sap xep: ");	
		for (int i = 0; i < hoten.size(); i++) {
			System.out.println("Sinh vien thu: " + (i+1));
			System.out.println("Ho ten: " + hoten.get(i));
			System.out.println("Diem trung binh: " + diem.get(i));
			System.out.println("Hoc luc: " + hocluc.get(i));
		}
	}
}













