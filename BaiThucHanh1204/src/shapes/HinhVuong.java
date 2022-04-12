package shapes;
import java.util.Scanner;
public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        ten = "Hinh vuong";
    }
    public void nhapCanh() {
        System.out.println("Do dai canh = ");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextFloat();
    }
}

