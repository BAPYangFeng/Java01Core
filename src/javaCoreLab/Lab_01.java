package javaCoreLab;
import java.util.Scanner;

public class Lab_01
{
	static Scanner sc = new Scanner(System.in);
	public static void Bai1()
	{
		System.out.print("Nhap ho ten: ");
		String name = sc.nextLine();
		System.out.print("Nhap diem trung binh: ");
		Double mark = sc.nextDouble();
		System.out.printf("Sinh vien %s co diem trung binh la %.2f.\n", name, mark);
	}
	
	public static void Bai2()
	{
		System.out.print("Nhap chieu dai: ");
		Double length = sc.nextDouble();
		System.out.print("Nhap chieu rong: ");
		Double hight = sc.nextDouble();
		System.out.printf("Chu vi la: " + ((length + hight)*2));
		System.out.printf("Dien tich la: " + (length * hight));
	}
	
	public static void Bai3()
	{
		System.out.print("Nhap chieu dai canh: ");
		Double length = sc.nextDouble();
		System.out.printf("The tich khoi lap phung la: " + (Math.pow(length,3)));
	}
	
	public static void Bai4()
	{
		System.out.print("Nhap a: ");
		Integer a = sc.nextInt();
		System.out.print("Nhap b: ");
		Integer b = sc.nextInt();
		System.out.print("Nhap c: ");
		Integer c = sc.nextInt();
		Double delta = Math.pow(b, 2) - 4*a*c;
		Double sqrtDelta = Math.sqrt(delta);
		System.out.printf("Can bac hai cua Delta la: %.2f", sqrtDelta);
	}
	
	public static void Bai5()
	{
		System.out.print("Nhap vao ban kinh: ");
		Double radian = sc.nextDouble();
		Double CV = 2*Math.PI*radian;
		Double DT = Math.PI*Math.pow(radian, 2);
		System.out.printf("Chu vi la: %.2f\n", CV);
		System.out.printf("Dien tich la: %.2f\n", DT);
		System.out.println("---------------------------");
		Double numberRandom = Math.random() % (12 -  5 + 1) + 5;
		Double sqrtNumberRandom = Math.sqrt(numberRandom);
		System.out.printf("So vua sinh ra la: %.0f, can bac hai cua no la: %.2f\nZ", numberRandom, sqrtNumberRandom);
		System.out.println("---------------------------");
		System.out.print("Nhap vao so a: ");
		Double a = sc.nextDouble();
		System.out.print("Nhap vao so b: ");
		Double b = sc.nextDouble();
		System.out.println("a luy thua b la: " + (Math.pow(a, b)));
		System.out.println("So be nhat la: " + (Math.min(a, b)));
	}
}
