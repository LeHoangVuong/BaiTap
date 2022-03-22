import java.util.Scanner;
public class hinhchunhat {
public static void main(String[] args) {
    HinhChuNhat hcn = new HinhChuNhat();
    hcn.nhapchieudai();
    hcn.nhapchieurong();
    hcn.tinhchuvi();
    hcn.tinhdientich();
    hcn.inchuvi();
    hcn.indientich();
}}
class HinhChuNhat {
    float x;
    float y;
    float cv;
    float dt;

void nhapchieudai(){
    System.out.println("nhap chieu dai hcn : ");
    try (Scanner scanner = new Scanner(System.in)) {
        x = scanner.nextFloat();
    }
    }
void nhapchieurong(){
    System.out.println("nhap chieu dai hcn : ");
    Scanner scanner = new Scanner(System.in);
    y = scanner.nextFloat();
    scanner.close();
    }
void tinhchuvi() {
    cv = (x + y) *2;
}
void tinhdientich() {
    dt = x*y ;
}
void inchuvi() {
    System.out.println(" chu vi hcn :" + cv);

}
void indientich() {
    System.out.println("dien tich hcn : " + dt);
}}