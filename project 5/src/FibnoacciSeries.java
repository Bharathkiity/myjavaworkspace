import java.util.Scanner;

public class FibnoacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();		
		long f=0;
		long s=1;
		long t;
		
		System.out.print(f+" "+s+" ");
//		System.out.println(f);
//		System.out.println(s);
		for(int i=2;i<number;i++) {
			t=f+s;
			System.out.print(t+" ");
			f=s;
			s=t;
		}
	}

}
