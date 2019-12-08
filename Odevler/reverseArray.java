
public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] k = {5,3,1,8,4,11,12};
	
		printArray(reverse(k));
	}
	
	static int[] reverse(int[] dizi)
	{
		int n = dizi.length;
		int[] result = new int[n];
		for(int i = 0; i< n; i++)
		{
			result[i] = dizi[n-1-i];
		}
		return result;
	}
	
	static void printArray(int[] dizi)
	{
		for(int i = 0; i<dizi.length; i++)
		{
			System.out.print(dizi[i] + " ");
		}
		
	}

}
