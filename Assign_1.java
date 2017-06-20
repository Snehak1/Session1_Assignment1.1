import java.util.*;
public class Assign_1 {
 
	public int sum(int a, int b)
	{ 
		for (int i=1;i<=b;i++)
		{
			a++;
		}
		return a;
		
	}
		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a= in.nextInt();
		System.out.println("Enter the value of b:");
		int b= in.nextInt();
		Assign_1 obj1= new Assign_1();
		int sum=obj1.sum(a,b);
		System.out.println("Sum of a and b is :" + " "+ sum);

	}

}
