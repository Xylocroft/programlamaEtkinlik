
public class ortalamaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int not1 = 50;
		int not2 = 90;
		int not3 = 80;
		//3 tane integerýn toplamý 1 tane integer oluþturur.
		//eðer integer'ý integer'a bölersek sonuç integer olur yani mesela not2/not1 iþleminin sonucu 1 olur çünkü 1.8'in tamsayý kýsmý 1dir
		//fakat ortalam virgüllü bir sayý olmalýdýr bu yüzden notlarýn toplamýný bir integera deðil bir double'a  bölmeliyiz
		//3 bir integer iken 3.0 bir double belirtir
		double ortalama = (not1+not2+not3)/3.0;
		
		System.out.println("Ortalaman: " + ortalama + "\nOrtalama int: " + (int)ortalama);
		if(ortalama>=85)
		{
			System.out.println("Takdir aldýn");
		}
		//if'in içerisindeki þart saðlanmazsa else if'in içindeki þarta bakýlýr, else if'in içindeki þart saðlanýrsa alltaki else if'lere ve else'e hiç bakýlmaz
		else if(ortalama >= 70)
		{
			System.out.println("Teþekkür aldýn");
		}
		else if(ortalama>=50)
		{
			System.out.println("Geçtin");
		}
		else
		{
			System.out.println("Geçemedin");
		}
	}

}
