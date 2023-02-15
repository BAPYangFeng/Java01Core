package Lab4;
import java.util.Scanner;
public class TauHoa {
	Scanner sc = new Scanner(System.in);
	private String ten;
	private Integer vantoc;
	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Integer getVantoc() {
		return vantoc;
	}
	public void setVantoc(Integer vantoc) {
		if (vantoc > 0) {
			this.vantoc = vantoc;
		}
	}
	
	public TauHoa() {
		ten = null;
		vantoc = 0;
	}
	public TauHoa(String ten, Integer vantoc) {
		this.ten = ten;
		this.vantoc = vantoc;
	}
	public void xuat() {
		System.out.print("Ten: " + ten);
		System.out.print("Van toc: " + vantoc);
	}
	public void nhap() {
		System.out.print("Nhap ten: ");
		ten = sc.nextLine();
		System.out.print("Nhap van toc: ");
		do {
			try {
				vantoc = sc.nextInt();
			}
			catch (Exception ex) {
				sc.nextLine();
				vantoc = 0;
			}
			if (vantoc <= 0) {
				System.out.print("Nhap sai.");
			}
		} while (vantoc >= 0);
	}
}
