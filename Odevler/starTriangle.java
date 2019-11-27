import java.util.*; 
public class starTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n;
		n = 10;
		int k = 1;
		while(k<=n)
		{
			int a = 1;
			while(a<=k)
			{
				System.out.print("*");
				a+=1;
			}
			k+=1;
			System.out.println();
		}
	}

}
