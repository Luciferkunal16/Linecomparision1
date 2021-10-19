import java.util.*;

public class Geometery {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the value of x1");
		double x1=inp.nextDouble();
		System.out.println("Enter the value of y1");
		double y1=inp.nextDouble();
		System.out.println("Enter the value of x2");
		double x2=inp.nextDouble();
		System.out.println("Enter the value of y2");
		double y2=inp.nextDouble();
		double result=Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
		double result1=Math.sqrt(result);
		System.out.println("Length of Line is "+result1);
	}

}
