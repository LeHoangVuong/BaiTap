import java.util.Scanner;

public class App2 {
    
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            float a,b,c;
            System.out.println("Nhap he so a: ");
            a = sc.nextFloat();
            System.out.println("Nhap he so b: ");
            b = sc.nextFloat();
            System.out.println("Nhap he so c: ");
            c = sc.nextFloat();
            if ((a+b>=c)&&(b+c>=a)&&(c+a>=b));
            {
                System.out.println("a, b ,c Thoa man dieu khien la 3 canh cua tam giac ");
                if ((a==b)&&((a!=c)||(b!=c)))
                System.out.println("Tam giac Can tai C");
                else if ((a==c)&&((a!=b)||(c!=b)))
                System.out.println("Tam giac Can tai B");
                else if ((c==b)&&((c!=a)||(b!=a)))
                System.out.println("Tam giac Can tai A");
                else if(a*a==b*b+c*c)
                System.out.println("Tam giac Vuong tai A");
                else if(b*b==a*a+c*c)
                System.out.println("Tam giac Vuong tai B");
                else if(c*c==b*b+a*a)
                System.out.println("Tam giac Vuong tai C");
                else if((a==b)&&(b==c))
                System.out.println("Tam giac Deu!");
                else if((a!=b)&&((a!=c)||(b!=c)))
                System.out.println("Tam giac Thuong!");
                else
            System.out.println("a, b, c khong thoa man la 3 canh cua tam giac!");
            }
        }
    }  
}