package test1.org;

public class Fibonacci {

	public static void main(String[] args) {
	int n1=1,n2=4,n3,i,count=20;
	System.out.print(n1+" "+n2);
	
		for(i=5;i<20;++i){
			n3=n1+n2;
		
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
	}

	}

}
