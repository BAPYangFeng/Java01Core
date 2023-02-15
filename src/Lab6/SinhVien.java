package Lab6;
import java.util.Scanner;

public class SinhVien {
	Scanner sc = new Scanner(System.in);
	String hoTen;
	String email;
	String phone;
	String cmnd;
	
	String emailPart = "\\w+@\\w+(\\.\\w){1,2}"; 
	String phonePart = "0\\d{9,10}";
	String cmndPart = "[0-9]{9}";
	
	public void nhap() {
		System.out.println("Nhap ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap email: ");
		do{
			email = sc.nextLine();
			if (!email.matches(emailPart)) {
				System.out.println("Nhap sai.");
			}
		} while (!email.matches(emailPart));
		System.out.println("Nhap SDT: ");
		do{
			phone = sc.nextLine();
			if (!phone.matches(phonePart)) {
				System.out.println("Nhap sai.");
			}
		} while (!phone.matches(phonePart));
		System.out.println("Nhap CMND: ");
		do{
			cmnd = sc.nextLine();
			if (!cmnd.matches(cmndPart)) {
				System.out.println("Nhap sai.");
			}
		} while (!cmnd.matches(cmndPart));
	}
}
