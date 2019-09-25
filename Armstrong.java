package test1.org;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int c = 0,a,i,temp;
		Scanner rr=new Scanner(System.in);
		System.out.println("enter the number to be checked");
		int n=rr.nextInt();
		temp = n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=(a*a*a);
		}
		if(temp==c)
		System.out.println("Number is Armstrong");
else
		System.out.println("Number is not Armstrong");
	
		
	}

}
