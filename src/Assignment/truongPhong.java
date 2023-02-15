package Assignment;
import java.util.Scanner;

public class truongPhong extends nhanVien{
	private Double trachNhiem;

	
	public Double getTrachNhiem() {
		return trachNhiem;
	}

	public void setTrachNhiem(Double trachNhiem) {
		if (trachNhiem > 0) {
			this.trachNhiem = trachNhiem;
		}
	}
	
	
	@Override public  Double getThuNhap() {
		return getLuong() + trachNhiem;
	}
	@Override public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap tien trach nhiem: ");
		do {
			try {
				trachNhiem = sc.nextDouble();
			}
			catch (Exception ex) {
				sc.nextLine();
				trachNhiem = 0.0;
			}
			if (trachNhiem <= 0) {
				System.out.println("Nhap sai!");
			}
		} while (trachNhiem <= 0);
	}
}
