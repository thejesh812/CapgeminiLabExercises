package Lab;

import java.util.Scanner;

public class Fibanocci {
	
	void NRecursion(){
		int n1=1,n2=1,n3,i;
		System.out.println("Enter the value of count:");
		Scanner sc=new Scanner(System.in);
		int count = sc.nextInt();
		
		System.out.print(n1+" "+n2);
		for(i=2;i<count;++i) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		
	}
	

	public static void main(String[] args) {
		
		Fibanocci f=new Fibanocci();
		f.NRecursion();
	}

}