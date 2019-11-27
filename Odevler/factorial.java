
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,nstart;
		n = 6;
		nstart = n;
		int product = 1;
		
		while(n>0)
		{
			product *= n; // product = product * n;
			n -= 1;
			
		}
		System.out.println(nstart + "! = " + product);
	}

}
