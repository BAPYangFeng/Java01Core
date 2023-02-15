package javaCoreLab;
import java.util.Scanner;

public class Lab_02 {
	static Scanner sc = new Scanner(System.in);
	public static void Bai1()
	{
		System.out.print("Nhap a: ");
		Double a = sc.nextDouble();
		System.out.print("Nhap b: ");
		Double b = sc.nextDouble();
		if (a == 0)
		{
			if (b == 0)
			{
				System.out.println("Phuong trinh vo so nghiem.");
			}
			else
			{
				System.out.println("Phuong trinh vo nghiem.");	
			}
		}
		else
		{
			Double x = -b/a;
			System.out.printf("Phuong trinh co nghiem la: %.2f\n", x);
		}
	}
	
	public static void Bai2()
	{
		System.out.print("Nhap a: ");
		Double a = sc.nextDouble();
		System.out.print("Nhap b: ");
		Double b = sc.nextDouble();
		System.out.print("Nhap c: ");
		Double c =sc.nextDouble();
		if (a == 0)
		{
			if (b == 0)
			{
				if (c == 0)
				{
					System.out.println("Phuong trinh vo so nghiem.");
				}
				else
				{
					System.out.println("Phuong trinh vo nghiem.");	
				}
			}
			else
			{
				Double x = -c/b;
				System.out.printf("Phuong trinh co nghiem la: %.2f\n", x);
			}
		}
		else 
		{
			Double delta = b*b - 4*a*c;
			if (delta < 0)
			{
				System.out.println("Phuong trinh vo nghiem.");
			}
			else if (delta == 0)
			{
				Double x = -b/(2*a);
				System.out.printf("Phuong trinh co nghiem kep: %.2f\n", x);
			}
			else if (delta > 0)
			{
				Double x1 = (-b+Math.sqrt(delta))/(2*a);
				Double x2 = (-b-Math.sqrt(delta))/(2*a);
				System.out.printf("Phuong trinh co 2 nghiem la: %.2f va %.2f\n", x1, x2);
			}
		}
	}
	
	public static void Bai3()
	{
		System.out.print("Nhap so dien: ");
		Double soDien = sc.nextDouble();
		if (soDien > 50)
		{
			System.out.println("So tien dien la: " + (50*1000 + (soDien - 50)*1200) + "VND");
		}
		else 
		{
			System.out.println("So tien dien la: " + (soDien * 1000));
		}
	}
	
	public static void Bai4()
	{
		while (true)
		{
			System.out.println("+--------------------------------------+)");
			System.out.println("\t1. Giải phương trình bậc nhất");
			System.out.println("\t2. Giải phương trình bậc hai");
			System.out.println("\t3. Tính tiền điện");
			System.out.println("\t0. Thoát");
			System.out.println("+--------------------------------------+)");
			System.out.print("Chọn chức năng: ");
			Byte choose = sc.nextByte();
			switch (choose)
			{
				case 1:
				{
					Bai1();
					break;
				}
				case 2:
				{
					Bai2();
					break;
				}
				case 3:
				{
					Bai3();
					break;
				}
			}
			if (choose == 0)
			{
				System.out.print("Đã thoát.");
				break;
			}
		}
	}
}












