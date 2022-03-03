import java.util.Scanner;
public class AppBai9 {
public static void main(String[] args) {
    String chuoi;
    int soKyTuInHoa = 0, soKyTuInThuong = 0, soChuSo = 0;
    Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi bat ky : ");
        chuoi = scanner.nextLine();
    for (int i = 0; i < chuoi.length(); i++) {
        if (Character.isLowerCase(chuoi.charAt(i))) {
            soKyTuInThuong++;
        } 
        if (Character.isUpperCase(chuoi.charAt(i))) {
            soKyTuInHoa++;
        } 
        if (Character.isDigit(chuoi.charAt(i))) {
            soChuSo++;
        }
    }
         
    System.out.println("Trong chuoi vua nhap " + chuoi + " co " 
    + soKyTuInThuong + " ky tu in thuong va co " 
    + soKyTuInHoa + " ky tu in hoa" +" va co " 
    + soChuSo + " so");
}
}