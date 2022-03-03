import java.text.DecimalFormat;
import java.util.Scanner;
public class AppBai1 {
 
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
             
            System.out.println("Nhap vao so thu nhat: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Nhap vao so thu hai: ");
            int secondNumber = scanner.nextInt();
            int tong = firstNumber + secondNumber;
            System.out.println("Tong hai so :"+ firstNumber + " + " + secondNumber + " = " + tong);

            int hieu = firstNumber - secondNumber;
            System.out.println("Hieu hai so :"+ firstNumber + " - " + secondNumber + " = " + hieu);
             
            int tich = firstNumber * secondNumber;
            System.out.println("Tich hai so :"+ firstNumber + " * " + secondNumber + " = " + tich);
             
            float thuong = (float) firstNumber / secondNumber;
            System.out.println("Thuong hai so :"+ firstNumber + " / " + secondNumber + " = " + 
                    decimalFormat.format(thuong));

            int phanDu = firstNumber % secondNumber;
            System.out.println("Phan du cua hai so:"+ firstNumber + " % " + secondNumber + " = " + phanDu);
            
            System.out.println("Ket qua so sanh bang hai so " + firstNumber + " va " + secondNumber + " la : " + (firstNumber == secondNumber));
            System.out.println("Ket qua so sanh khong bang hai so " + firstNumber + " va " + secondNumber + " la " + (firstNumber != secondNumber));
            System.out.println("Ket qua so sanh lon hon hai so " + firstNumber + " va " + secondNumber + " la " + (firstNumber > secondNumber));
            System.out.println("Ket qua so sanh lon hon hoac bang hai so " + firstNumber + " va " + secondNumber + " la " + (firstNumber >= secondNumber));
            System.out.println("Ket qua  so sanh nho hon hai so " + firstNumber + " va " + secondNumber + " la " + (firstNumber < secondNumber));
            System.out.println("Ket qua  so sanh nho hon hoac bang hai so " + firstNumber + " va " + secondNumber + " la " + (firstNumber <= secondNumber));
        }
    }
}