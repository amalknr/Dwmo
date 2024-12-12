package KB;

public class FactorialRecursive {
	public static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
    public static void main(String[] args) {
    	
    	//factorial of a number using recursion
    	
    	int number=5;
    	int result=factorial(number);
    	System.out.println(result);
    }
}