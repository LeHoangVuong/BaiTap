import java.util.Scanner;
public class app35 {
 public static void main(String[] args){
  int x, y;
  try (Scanner scanner = new Scanner(System.in)) {
    System.out.println("Nhap x: ");
    x = scanner.nextInt();
    System.out.println("Nhap y: ");
    y = scanner.nextInt();
  }
  int min = x;
  if (x > y) 
        min = y;
    System.out.println("So be nhat trong 2 so " + x + " và "+ y+ " la :" + min);
      } 
  }
  