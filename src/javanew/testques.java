package javanew;

public class testques {
	
	public static void main (String Args[]) {
		reversestring();
		findNumber();
		average();
		moveZerosToEnd();
		
}
	
	public static void reversestring() {
		String name = "AJAY";
		String revrse =" ";
		for (int i =0; i<name.length();i++) {
			revrse = name.charAt(i)+revrse;
			
		}
		System.out.println(revrse);
		
	}
	
	
	
	public static void findNumber() {
		
	int a[] = {2,5,-3,-5,43};
	int f;
	int flag=0;
	int target= 5;
	for(int i=0;i<a.length;i++) {
		f=a[i];
		if (f==target) {
			flag=1;
			}
			}
	
	if (flag == 0) 
	{
		System.out.println("Not present ");
	}
	else
	{
		System.out.println("Yes, present ");
	}
	
}
	
	
	public static void average() {
		int input[] = {12,6,4,2};
		int o=0;
		for(int i=0;i<input.length;i++) {
			o = input[i]+o;
		}
		o= o/input.length;
		System.out.println("Average = " +o);
	}

	public static void moveZerosToEnd() {
		int in[]= {0,1,0,3,12};
		int z[] = null ;
		int o[]=null;
		int res[]=null;
		
		for(int i=0;i<in.length;i++) {
			for(int j=0;j>=0;j++) {
			if(in[i]!=0) {
				//o[j]=in[i];
				//System.out.println(o[j]);
			}
		}
		}
		
		
	/*	for(int i=0;i<in.length;i++) {
			for(int j=0;j>=0;j++) {
			if(in[i]==0) {
				z[j]+=in[i];
			}
		}
		}
		
		for(int i =0;i<5;i++) {
			res[i]=o[i]+z[i];
		}
			
		for(int i =0;i<5;i++) {
			System.out.print(res[i]);
		}
		System.out.println();*/
	}
}

