
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		n = 100;
		
		int toplam = 0;
		
		//while i�erisindeki �art sa�lan�rsa s�sl� parantez i�erisindeki kodlar �al��t�r�l�r
		//sonras�nda tekrar while i�erisindeki �art�n sa�lan�p sa�lanmad��� kontrol edilir, sa�land��� s�rece s�rekli while i�erisindeki kodlar �al��t�r�l�r.
		while(n>0)
		{
			toplam += n;
			n -= 4;
		}
		
		System.out.println(toplam);
		
		int k = 1;
		while(k<100)
		{
			//k%7 i�lemi sonu� olarak k'nin 7'ye b�l�m�nden kalan�n� verir,�rnek: 16%7 --> 2
			if(k%7 == 0)
			{
				System.out.println(k);
			}
			// k += 1 demek k = k+1 demektir, ayn� �ekilde art� yerine istedi�iniz i�lem operat�r�n� getirebilirsiniz, �rnek: k*= 3; k'n�n de�erini �� kat�na ��kar�r
			k+=1;
		}
	}

}
