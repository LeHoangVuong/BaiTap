import java.util.Scanner;
public class person {
    String ID;
    String name;
    Boolean gender;
    String address;
    Scanner sc =new Scanner(System.in);

public void nhapID(){
    System.out.println("nhap ID : ");
    ID = sc.next();
}
public void nhapten(){
    System.out.println("nhap ten : ");
    name = sc.next();
}
public void nhapgioitinh(){
    System.out.println("nhap gioi tinh : ");
    gender = sc.nextBoolean();
}
public void nhapdiachi(){
    System.out.println("nhap dia chi : ");
    address = sc.next();
}
public void inID(){
    System.out.println("Id cua ban la : " + ID);
}
public void inten(){
    System.out.println("ten cua ban la : " + name);
}
public void ingioitinh(){
    System.out.println("gioi tinh cua ban la : " + gender);
}
public void indiachi(){
    System.out.println("dia chi cua ban la : " + address);
}
}
    


