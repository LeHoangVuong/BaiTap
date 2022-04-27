package Shapes;
import java.util.Scanner;
public class Quadrilateral extends Point{

Quadrilateral(){}
    Scanner sc = new Scanner(System.in );
    public void check(){
        System.out.println("Nhap diem a1");
        double a1 = sc.nextDouble();

        System.out.println("nhap diem a2");
        double a2 = sc.nextDouble();

        System.out.println("nhap diem b1");
        double b1 = sc.nextDouble();

        System.out.println("nhap diem b2");
        double b2 = sc.nextDouble();

        System.out.println("nhap diem c1");
        double c1 = sc.nextDouble();

        System.out.println("nhap diem c2");
        double c2 = sc.nextDouble();

        System.out.println("nhap diem d1");
        double d1 = sc.nextDouble();

        System.out.println("nhap diem d2");
        double d2 = sc.nextDouble();

        double AB=(Math.sqrt((b1-a1)*(b1-a1) + (b2-a1)*(b2-a1)));
        double BC=(Math.sqrt((c1-b1)*(c1-b1) + (c2-b2)*(c2-b2)));
        double CD=(Math.sqrt((d1-c1)*(d1-c1) + (d2-c2)*(d2-c2)));
        double DA=(Math.sqrt((d1-a1)*(d1-a1) + (d2-a1)*(d2-a1)));

        if(a1==b1 && a1==b2|| b1 ==c1 && b2==c2 || c1 == d1 && c2 == d2 || a1 == d1 &&a1==d2){
            System.out.println("day khong phai tu giac vi co diem trung nhau");
        }else if(AB==BC && BC==CD && CD==DA) {
            System.out.println("day la hinh vuong");
        }else if(AB==CD&&BC==DA){
            System.out.println("day la hinh chu nhat");
        }

    }

} 