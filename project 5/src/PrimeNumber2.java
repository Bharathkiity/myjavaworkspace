//natural number >1
//two factors  and itself

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[] args) {
		System.out.println("Enter a prime Number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean prime=true;
		if(number>1) {
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				prime=false;
				break;
			}	
		}
		if(prime) {
			System.out.println(number+" prime number");
		}else {
			System.out.println(number+" not a prime number");
		}
	}
				
		}
	}

