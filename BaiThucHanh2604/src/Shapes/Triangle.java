package Shapes;
import java.util.Scanner;
public class Triangle extends Point {
    public Triangle(){}
    public double getdodai2diem(Point a, Point b){
        double kq=(Math.sqrt((b.hd-a.hd)*(b.hd-a.hd) + (b.td-a.td)*(b.td-a.td)));
        return kq;
    }
    public  void check(){
    Scanner sc = new Scanner(System.in );
    System.out.println("nhap diem a1");
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
    
    double AB=(Math.sqrt((b1-a1)*(b1-a1) + (b2-a2)*(b2-a2)));
    double BC=(Math.sqrt((c1-b1)*(c1-b1) + (c2-b2)*(c2-b2)));
    double AC=(Math.sqrt((c1-a1)*(c1-a1) + (c2-a2)*(c2-a2)));
    System.out.println(AB);
    System.out.println(BC);
    System.out.println(AC);
    if(a1==b1 && a2==b2|| b1 ==c1 && b2==c2 || c1 == a1 && c2 == a2){
        System.out.println("Day khong phai tam giac vi co diem trung nhau");
    }else if(AB==BC||AB==AC||AC==BC){
        System.out.println("Day la tam giac can");
    }else if(AB==BC&&AB==AC&&AC==BC){
        System.out.println("Day la tam giac deu");
    }else{
        System.out.println("Day la tam giac thuong");
    }
    }
}