
public class UncheckedExceptionDeno {
public static void main(String[] args) {
	int[] a= {10,20,30,40,50};
	String s="java";
	
	try {
		System.out.println(a[2]);
		char c =s.charAt(5);
		System.out.println(c);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("no array element  is existed");
		
	}
	catch(StringIndexOutOfBoundsException e){
		System.out.println("no character elemnent  is existed");
		
	}
	//Multiple try and catch possible
	try {
		System.out.println(a[5]);
		
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("no array element  is existed");
		
	}
	try {
		
		char c =s.charAt(5);
		System.out.println(c);
	}
	
	catch(StringIndexOutOfBoundsException e){
		System.out.println("no character elemnent  is existed");
		
	}
	
										
	
	
}
}