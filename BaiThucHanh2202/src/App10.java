import java.util.Scanner;

public class App10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, dem=0;
        System.out.println("Nhap he so a: ");
        n = sc.nextInt();
        while(n>=1){
            n/=10;
            dem++;
        }
        System.out.println("so chu so cua a la:" +dem);
    }
}