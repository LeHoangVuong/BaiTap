import java.util.Scanner;

public class App7 {
	private static String max;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			float n,max=0;
			do {
				System.out.println("Nhap vao so thuc: ");
				n=sc.nextFloat();
				if(n>max)
				{
					max=n;
				}
			}
			while(n!=0);
		}
		
		System.out.println("So lon nhat trong ca so tren la : "+max);
}
}