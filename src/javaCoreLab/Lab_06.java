package javaCoreLab;
import java.util.Scanner;
import java.util.ArrayList;
import Lab6.*;

public class Lab_06 {
	static Scanner sc = new Scanner(System.in);
	public static void Bai01() {
		System.out.println("Nhap ho ten: ");
		String name = sc.nextLine();
		name.trim();
        int k;
        String ten = new String();
        for(k = name.length()-1; k >= 0; k--)
        {
            ten=name.substring(k, k+1);
            if (ten.equals(" ")) 
            	break;
        }
        System.out.println("Ten: " + name.substring(k+1));
        int i;
        for(i = 0; i <= name.length(); i++)
        {
           ten = name.substring(i,i+1);
            if (ten.equals(" ")) 
            	break;
        }
        System.out.println("Ho: " + name.substring(0, i));
        int j = 0;
    
        if(j > i && j < k)
        {
            ten = name.substring(j, j+1);
        }
        System.out.println("Ten Dem: " + name.substring(i+1, k));
	}
	public static void Bai02() {
		ArrayList<SanPham> list = new ArrayList<SanPham>();
		for (int i = 0; i < 5; i++) {
			SanPham sp = new SanPham();
			sp.nhap();
			list.add(sp);
		}
		System.out.println("------------------------------");
		for (SanPham sp : list) {
			sp.xuat();
		}
	}
	public static void Bai03() {
		ArrayList<SanPham> list = new ArrayList<SanPham>();
		for (int i = 0; i < 5; i++) {
			SanPham sp = new SanPham();
			sp.nhap();
		}
	}
}
