import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int x,y,z,min,max;
		Scanner sc=new Scanner(System.in); //user inputt
		System.out.println("enter first num");
		x=sc.nextInt();//read
		System.out.println("enter second number");
		y=sc.nextInt();//read
		System.out.println("enter third  number");
		z=sc.nextInt();//read
		max=((x>y)&&(x>z))?x:(y>z)?y:z;
		min=((x<y)&&(x<z))?x:(y<z)?y:z;
			
		
		System.out.println(min);
		System.out.println(max);
	}

}
