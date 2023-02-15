package Lab7;
import java.util.Scanner;

public class svBiz extends svPoly {
	private Double diemMarketing;
	private Double diemSale;
	
	
	public Double getDiemMarketing() {
		return diemMarketing;
	}
	public void setDiemMarketing(Double diemMarketing) {
		if (diemMarketing >= 0 && diemMarketing <= 10) {
			this.diemMarketing = diemMarketing;
		}
	}
	public Double getDiemSale() {
		return diemSale;
	}
	public void setDiemSale(Double diemSale) {
		if (diemSale >= 0 && diemSale <= 10) {
			this.diemSale = diemSale;
		}
	}
	
	
	@Override 
	public Double getDiem() {
		return (2* diemMarketing + diemSale)/3;
	}
	
	@Override 
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten SV: ");
		setTenSV(sc.nextLine());
		setNganh("Biz");
		System.out.println("Nhap diem Marketing: ");
		do {
			try {
				diemMarketing = sc.nextDouble();
			}
			catch (Exception ex) {
				sc.nextLine();
				diemMarketing = -1.0;
			}
			if (diemMarketing < 0 || diemMarketing > 10) {
				System.out.println("Nhap lai!");
			}
		} while (diemMarketing < 0 || diemMarketing > 10);
		System.out.println("Nhap diem Sale: ");
		do {
			try {
				diemSale = sc.nextDouble();
			}
			catch (Exception ex) {
				sc.nextLine();
				diemSale = -1.0;
			}
			if (diemSale < 0 || diemSale > 10) {
				System.out.println("Nhap lai!");
			}
		} while (diemSale < 0 || diemSale > 10);
	}	
}
