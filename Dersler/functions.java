
public class functions {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		yazdir();
		int k = 3;
		ekle(k);
		int c = topla(5,7);
		System.out.println(c);
		int[] u = {1,3,4,6,7,5,8};
		System.out.println(factorial(5));
		System.out.println(factorial(7));
		System.out.println(factorial(8));
		System.out.println(arrayToplam(u));
	}
	
	static void yazdir()
	{
		System.out.println("selam");
	}
	
	static void ekle(int a)
	{
		System.out.println(a+5);
	}
	
	static int topla(int a, int b)
	{
		return a+b;
	}
	
	static int factorial(int n)
	{
		int product = 1;
		for(int i = 1; i<=n; i++)
		{
			product = product*i;
		}
		return product;
	}
	

	static int arrayToplam(int[] dizi)
	{			
		int toplam = 0;
		for(int i = 0; i<dizi.length; i++)
		{
			toplam = toplam + dizi[i];
		}
		return toplam;
	}
}