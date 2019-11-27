
public class sumMultiples3or5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. YÖNTEM
		//1000'e kadar olan 3 veya 5'in katlarýnýn toplamý
		//YORUM SATIRI
		int i = 1;
		int sum = 0;
		while(i<1000)
		{
			// || iþareti veya demektir yani bu if'in içerisine girmemesi için i'nin hem 3e bölünmemesi hem de 5'e bölünmemesi gerekir
			if(i%3 == 0 || i%5 == 0)
			{
				//3 veya 5'e bölünüyorsa o sayýyý toplamýmýza ekleriz
				sum+= i;
			}
			
			i+=1;
		}
		System.out.println("1'den 1000'e kadar 3 veya 5'in katlarýnýn toplamý: " + sum);
	

		i = 1;
		sum = 0;
		//3'e bölünen sayýlarý toplama ekleriz, 5'e bölünen sayýlarý toplama ekleriz
		//Böyle yaptýðýmýzda 15'e bölünen sayýlarý hem 3 kýsmýnda hem de 5 kýsmýnda topladýðýmýz için 2 defa toplamýþ olduk
		//Bu yüzden 15e bölünen sayýlarý toplamýmýzdan çýkarýrýz ki 2 kere eklemiþ olmak yerine 1 kere eklemiþ olalým
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
		System.out.println("\n1'den 1000'e kadar 3 veya 5'in katlarýnýn toplamý: " + sum);
		
	}

}
