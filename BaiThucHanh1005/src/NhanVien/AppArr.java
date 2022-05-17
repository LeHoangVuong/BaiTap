package NhanVien;
import java.util.ArrayList;
public class AppArr{

    public static void showList(ArrayList<NhanVien> a ){
        for ( int i = 0; i < a.size();i++){
            System.out.println(a.get(i));
        }
    }
    public static void main(String[] args){
       ArrayList<NhanVien> nv = new ArrayList<>();
       NhanVien nv1 = new NhanVien(1, "Nguyen Van A", "Hanoi");
       NhanVien nv2 = new NhanVien(2, "Nguyen Van B", "HCM"); 
       NhanVien nv3 = new NhanVien(3, "Nguyen Van C", "Danang");
       NhanVien nv4 = new NhanVien(4, "Nguyen Van D", "Ninhbinh");
       nv.add(nv1);
       nv.add(nv2);
       nv.add(nv3);
       nv.remove(nv3);
       nv.set(3, nv4);
       System.out.println("hello");
       showList(nv);
    
    }}
    