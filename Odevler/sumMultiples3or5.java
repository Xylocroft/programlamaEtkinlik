
public class sumMultiples3or5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Y�NTEM
		//1000'e kadar olan 3 veya 5'in katlar�n�n toplam�
		//YORUM SATIRI
		int i = 1;
		int sum = 0;
		while(i<1000)
		{
			// || i�areti veya demektir yani bu if'in i�erisine girmemesi i�in i'nin hem 3e b�l�nmemesi hem de 5'e b�l�nmemesi gerekir
			if(i%3 == 0 || i%5 == 0)
			{
				//3 veya 5'e b�l�n�yorsa o say�y� toplam�m�za ekleriz
				sum+= i;
			}
			
			i+=1;
		}
		System.out.println("1'den 1000'e kadar 3 veya 5'in katlar�n�n toplam�: " + sum);
	

		i = 1;
		sum = 0;
		//3'e b�l�nen say�lar� toplama ekleriz, 5'e b�l�nen say�lar� toplama ekleriz
		//B�yle yapt���m�zda 15'e b�l�nen say�lar� hem 3 k�sm�nda hem de 5 k�sm�nda toplad���m�z i�in 2 defa toplam�� olduk
		//Bu y�zden 15e b�l�nen say�lar� toplam�m�zdan ��kar�r�z ki 2 kere eklemi� olmak yerine 1 kere eklemi� olal�m
		while(i<1000)
		{
			if(i%3 == 0)
			{
				sum+=i;
			}
			if(i%5 == 0)
			{
				sum+=i;
			}
			if(i%15 == 0)
			{
				sum-=i;
			}
			i+=1;
		}
		System.out.println("\n1'den 1000'e kadar 3 veya 5'in katlar�n�n toplam�: " + sum);
		
	}

}
