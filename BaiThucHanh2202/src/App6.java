import java.util.Scanner;

public class App6 {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Nhap he so n: ");
        n = sc.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0) 
                sum+=i;
        }
        if(sum==n)
        System.out.println("n la so hoan hao ");
        else 
        System.out.println("n khong la so hoan hao ");
        
    }
}
        