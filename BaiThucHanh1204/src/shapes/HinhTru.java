package shapes;
import java.util.Scanner;
public class HinhTru extends HinhTron {
    public float chieuCao;
    public HinhTru() {
        ten = "Hinh tru";
    }
    public void nhapChieuCao() {
        nhapBankinh();
        System.out.println("Chieu cao = ");
        Scanner scanner = new Scanner(System.in);
        chieuCao = scanner.nextFloat();
    }
    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
    @Override
    public void xuatThongTin() {
        System.out.println("Day la hinh tru");
    }
}
