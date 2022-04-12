import slide71.ToaDo;
import slide71.hinhTron;
public class App71;
 
    public static void main(String[] args) {

        HinhTron hinhTron = new HinhTron();
        hinhTron.setBanKinh(10);
        float chuVi = hinhTron.tinhChuVi();
        float dienTich = hinhTron.tinhDienTich();
        System.out.println("Chu vi hinh tron: " + chuVi + "; Dien tich hinh tron: " + dienTich) ;
    }
}