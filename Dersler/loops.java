
public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		n = 100;
		
		int toplam = 0;
		
		//while içerisindeki þart saðlanýrsa süslü parantez içerisindeki kodlar çalýþtýrýlýr
		//sonrasýnda tekrar while içerisindeki þartýn saðlanýp saðlanmadýðý kontrol edilir, saðlandýðý sürece sürekli while içerisindeki kodlar çalýþtýrýlýr.
		while(n>0)
		{
			toplam += n;
			n -= 4;
		}
		
		System.out.println(toplam);
		
		int k = 1;
		while(k<100)
		{
			//k%7 iþlemi sonuç olarak k'nin 7'ye bölümünden kalanýný verir,örnek: 16%7 --> 2
			if(k%7 == 0)
			{
				System.out.println(k);
			}
			// k += 1 demek k = k+1 demektir, ayný þekilde artý yerine istediðiniz iþlem operatörünü getirebilirsiniz, örnek: k*= 3; k'nýn deðerini üç katýna çýkarýr
			k+=1;
		}
	}

}
