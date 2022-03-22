import java.util.Scanner;
public class SinhVien {
    String MSV;
    String name;
    Boolean gender;
    String address;
    String ngaysinh;
    Scanner sc =new Scanner(System.in);
public void nhapthongtin(){
    System.out.println("nhap MSV : ");
    MSV = sc.next();
    System.out.println("nhap ten : ");
    name = sc.next();
    System.out.println("nhap gioi tinh : ");
    gender = sc.nextBoolean();
    System.out.println("nhap dia chi : ");
    address = sc.next();
    System.out.println("nhap ngay sinh : ");
    ngaysinh = sc.next();

}
public void inthongtin(){
    System.out.println("MSV cua ban la : " + MSV);
    System.out.println("ten cua ban la : " + name);
    System.out.println("gioi tinh cua ban la : " + gender);
    System.out.println("dia chi cua ban la : " + address);
    System.out.println("ngay sinh cua ban la : " + ngaysinh);
}}
    
