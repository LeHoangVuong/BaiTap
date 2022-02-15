import java.util.Scanner;
public class app40 {
public static void main (String agre[]) {
    try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Nhap so ngay : ");
        int ngay=scan.nextInt();
        switch(ngay){
            case 0:System.out.println("Chu Nhat");
            break;
            case 1:System.out.println("Thu hai");
            break;
            case 2:System.out.println("Thu ba");
            break;
            case 3:System.out.println("Thu tu");
            break;
            case 4:System.out.println("Thu nam");
            break;
            case 5:System.out.println("Thu sau");
            break;
            case 6:System.out.println("Thu bay");
            break;
            default:System.out.println("so ngay trong tuan sai");
        }
    }
}
}