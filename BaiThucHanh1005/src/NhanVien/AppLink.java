package NhanVien;
import java.util.LinkedList;
public class AppLink{

    public static void showList(LinkedList<NhanVien> list){
        for (NhanVien obj : list){
            System.out.println("\t" + obj + ", ");
        }
    }
    public static void main(String[] args){
       LinkedList<NhanVien> nv = new LinkedList<>();
       NhanVien nv1 = new NhanVien(1, "Nguyen Van A", "Hanoi");
       NhanVien nv2 = new NhanVien(2, "Nguyen Van B", "HCM"); 
       NhanVien nv3 = new NhanVien(3, "Nguyen Van C", "Danang");
       NhanVien nv4 = new NhanVien(4, "Nguyen Van D", "Ninhbinh");
       nv.add(nv1);
       nv.add(nv2);
       nv.add(nv3);
       nv.remove(nv3);
       nv.set(3, nv4);
       showList(nv);
    
    }
}