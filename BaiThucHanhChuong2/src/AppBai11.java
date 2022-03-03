import java.util.Scanner;
public class AppBai11 {
public static void main(String[] args) {
    int n, temp, max = 100;
    Scanner scanner = new Scanner(System.in);
    int A[] = new int[max];
        System.out.println("Nhap so phan tu cua mang : ");
        n = scanner.nextInt();
    System.out.println("Nhap gia tri cho cac phan tu cua mang : ");
    for (int i = 0; i < n; i++) {
        System.out.print("A[" + i + "] = ");
        A[i] = scanner.nextInt();
    }
    System.out.println("Mang ban dau : ");
    for (int i = 0; i < n; i++) {
        System.out.print(A[i] + "\t");
    }

    for (int i = 0; i < n - 1; i++) {
        for (int j = i+1; j <= n - 1; j++) {
            if (A[j] < A[i]) {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
    }
    System.out.println("\nMang da sap xep theo thu tu tang dan : ");
    for (int i = 0; i < n; i++) {
        System.out.print(A[i] + "\t");
    }
}
}