import java.util.Scanner;

public class App3 {
    public static void main(String args[])
{
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong can kiem tra : ");
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + " La so nguyen to ");
        else
            System.out.println(num + " Khong phai la so nguyen to ");
        }}