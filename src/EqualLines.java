
import java.util.Scanner;

public class EqualLines {
	public static void main(String[] args) {
		
	
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter the coordinate of line 1");
	System.out.println("Enter the value of x1");
	double L1x1=inp.nextDouble();
	System.out.println("Enter the value of y1");
	double L1y1=inp.nextDouble();
	System.out.println("Enter the value of x2");
	double L1x2=inp.nextDouble();
	System.out.println("Enter the value of y2");
	double L1y2=inp.nextDouble();
	System.out.println("Enter the coordinates of line 2");
	System.out.println("Enter the value of x1");
	double L2x1=inp.nextDouble();
	System.out.println("Enter the value of y1");
	double L2y1=inp.nextDouble();
	System.out.println("Enter the value of x2");
	double L2x2=inp.nextDouble();
	System.out.println("Enter the value of y2");
	double L2y2=inp.nextDouble();
	
	double Line1Result=Math.pow(L1x2-L1x1,2)+Math.pow(L1y2-L1y1,2);
	double Line1FinalResult=Math.sqrt(Line1Result);
	double Line2Result=Math.pow(L2x2-L2x1,2)+Math.pow(L2y2-L2y1,2);
	double Line2FinalResult=Math.sqrt(Line2Result);
	System.out.println("Length of Line 1 is "+Line1FinalResult);
	System.out.println("Length of Line 2 is "+ Line2FinalResult);
	
	Integer val1=new Integer((int)Line1FinalResult);
	Integer val2=new Integer((int)Line2FinalResult);
	System.out.println(val1.equals(val2));
	
	
	 
			
}
}