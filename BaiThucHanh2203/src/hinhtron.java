import java.util.Scanner;
public class hinhtron {
public static void main(String[] args) {
    Hinhtron ht = new Hinhtron();
    ht.nhapbankinh();
    ht.tinhchuvi();
    ht.tinhdientich();
    ht.inchuvi();
    ht.indientich();
}}
class Hinhtron {
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

void nhapbankinh(){
    System.out.println("nhap ban kinh hinh tron : ");
    try (Scanner scanner = new Scanner(System.in)) {
        r = scanner.nextFloat();
    }
    }
void tinhchuvi() {
    cv = 2*PI*r;
}
void tinhdientich() {
    dt = PI*r*r ;
}
void inchuvi() {
    System.out.println(" chu vi hinh tron :" + cv);

}
void indientich() {
    System.out.println("dien tich hinh tron: " + dt);
}}