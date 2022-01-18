import java.util.Scanner;
public class app2 {
    public static void main(String[] args) throws Exception {
        Scanner scc = new Scanner(System.in);
        double a1,b1,c1,a2,b2,c2,D,Dx,Dy;
        System.out.println("Nhap a1 = ");
        a1 = scc.nextDouble();
        System.out.println("Nhap b1 = ");
        b1 = scc.nextDouble();
        System.out.println("Nhap c1 = ");
        c1 = scc.nextDouble();
        System.out.println("Nhap a2 = ");
        a2 = scc.nextDouble();
        System.out.println("Nhap b2 = ");
        b2 = scc.nextDouble();
        System.out.println("Nhap c2 = ");
        c2 = scc.nextDouble();
        D = a1 * b2 - a2 * b1;
        Dx = c1 * b2 - c2 * b1;
        Dy = a1 * c2 - a2 * c1;
        if(D == 0){
            if(Dx + Dy == 0){
                System.out.println("He phuong trinh vo so nghiem.");
            } else {
                System.out.println("He phuong trinh vo nghiem.");
            }
        } else {
            System.out.println("He phuong trinh có nghiem la: " + "(" + Dx/D + "," + Dy/D + ")");
        }
        scc.close();
    }

}