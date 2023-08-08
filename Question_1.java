import java.util.Iterator;

class MyCalculator implements AdvancedArithmetic{

	@Override
	public int divisor_sum(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
}



public class Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalculator al = new MyCalculator();
		int a = al.divisor_sum(6);
		System.out.println(a);
	}

}
