package Lab7;
import java.util.Scanner;

public class svIT extends svPoly{
	private Double diemJava;
	private Double diemHtml;
	private Double diemCss;
	
	
	public Double getDiemJava() {
		return diemJava;
	}
	public void setDiemJava(Double diemJava) {
		if (diemJava >= 0 && diemJava <= 10) {
			this.diemJava = diemJava;
		}
	}
	public Double getDiemHtml() {
		return diemHtml;
	}
	public void setDiemHtml(Double diemHtml) {
		if (diemHtml >= 0 && diemHtml <= 10) {
			this.diemHtml = diemHtml;
		}
	}
	public Double getDiemCss() {
		return diemCss;
	}
	public void setDiemCss(Double diemCss) {
		if (diemCss >= 0 && diemCss <= 10) {
			this.diemCss = diemCss;
		}
	}
	
	
	@Override 
	public Double getDiem() {
		return (2 * diemJava + diemHtml + diemCss)/4;
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten SV: ");
		setTenSV(sc.nextLine());
		System.out.println("Nhap nganh: ");
		setNganh(sc.nextLine());
		System.out.println("Nhap diem Java: ");
		do {
			try {
				diemJava = sc.nextDouble();
			}
			catch (Exception ex) {
				sc.nextLine();
				diemJava = -1.0;
			}
			if (diemJava < 0 || diemJava > 10) {
				System.out.println("Nhap lai!");
			}
		} while (diemJava < 0 || diemJava > 10);
		System.out.println("Nhap diem HTML: ");
		do {
			try {
				diemHtml = sc.nextDouble();
			}
			catch (Exception ex) {
				sc.nextLine();
				diemHtml = -1.0;
			}
			if (diemHtml < 0 || diemHtml > 10) {
				System.out.println("Nhap lai!");
			}
		} while (diemHtml < 0 || diemHtml > 10);
		System.out.println("Nhap diem CSS: ");
		do {
			try {
				diemCss = sc.nextDouble();
			}
			catch (Exception ex) {
				sc.nextLine();
				diemCss = -1.0;
			}
			if (diemCss < 0 || diemCss > 10) {
				System.out.println("Nhap lai!");
			}
		} while (diemCss < 0 || diemCss > 10);
	}
}















