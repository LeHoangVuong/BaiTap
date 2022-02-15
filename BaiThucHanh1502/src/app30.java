import java.util.Scanner;
public class app30 {
    public static void main(String[] args) throws Exception {
        int n, soDu, tong = 0;
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Nhap so nguyen duong bat ky : ");
        n = scanner.nextInt();
    }
        while (n > 0) {
        soDu = n % 10;
        n = n / 10;
        tong += soDu;
    }
    System.out.println("Tong cac so cua so nguyen duong = " + tong);
    }
}