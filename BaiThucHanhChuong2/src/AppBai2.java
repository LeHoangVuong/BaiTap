import java.util.Scanner;
public class AppBai2 {
    public static void main(String[] args) {
        int n;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap vao so can kiem tra:");
            n = scanner.nextInt();
        }
        if (n % 2 == 0) {
            System.out.println(n + " La so chan");
        } else {
            System.out.println(n + " La so le");
        }
    }
}