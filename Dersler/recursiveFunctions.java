public class recursiveFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(5));
		System.out.println(fibonacci(6));
		System.out.println(toplam(5));
	}
	
	static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}

		return n*factorial(n-1);
	}
	
	
	static int fibonacci(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else if(n==2)
		{
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	static int toplam(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n+toplam(n-1);
	}
	//1, 1, 2, 3, 5, 8, 13, 21,...

}
