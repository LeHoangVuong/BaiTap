package shapes;
import java.util.Scanner;
public class HinhTron extends HinhHoc {
    public float bankinh;
    public HinhTron() {
        ten = "Hinh tron";
    }
 
    public void nhapBankinh() {
        System.out.println("Ban kinh = ");
        Scanner scanner = new Scanner(System.in);
        bankinh = scanner.nextFloat();
    }
 
    public void tinhChuVi() {
        chuVi = 2 * PI * bankinh;
    }
 
    public void tinhDienTich() {
        dienTich = PI * bankinh * bankinh;
    }
        
    public void xuatThongTin() {
            System.out.println("Day la hinh tron");
        }
}
 