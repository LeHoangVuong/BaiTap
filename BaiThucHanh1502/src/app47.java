import java.util.Scanner;
public class app47 {
  public static void main(String[] args) {
    int number, sum = 0;
    try (Scanner scanner = new Scanner(System.in)) {
      do {
       System.out.println("Nhap so nguyen : ");
         number = scanner.nextInt();
         sum += number;//sum = sum + number;
  } while (sum < 100);
    }      
    System.out.println("Tong cac so nguyen = "+sum);
    } }
