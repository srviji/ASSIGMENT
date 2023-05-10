package week1.day4;

public class MyCalculator {

	public int addNumber(int a, int b) {
		
		int c =a+b;
		return c;
	//}
	//public void subractTwoNumber(int total,int b) {
		//int c=total-b;
		//System.out.println(c);
	}
	public static void main(String[] args) {
		MyCalculator calc =new MyCalculator();
	    int total=calc.addNumber(100, 20);
	    System.out.println(total); 
	 //   calc.subractTwoNumber(total, 20);
	}
}
