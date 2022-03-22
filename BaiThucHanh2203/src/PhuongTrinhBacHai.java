import java.util.Scanner;
public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double x1;
        double x2;
        double delta;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap a : ");
        a = scanner.nextDouble();
        System.out.print("nhap b : ");
        b = scanner.nextDouble();
        System.out.print("nhap c : ");
        c = scanner.nextDouble();
        System.out.println("Phuong trinh : " + a + "x^2 + " + b + "x + " + c + " = 0");
        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("Phuong trinh co 1 ngiem x1,x2 =" + x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem x1 = " + x1 + " va x2 = " + x2);
        }
    }
}