
public class ortalamaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int not1 = 50;
		int not2 = 90;
		int not3 = 80;
		//3 tane integer�n toplam� 1 tane integer olu�turur.
		//e�er integer'� integer'a b�lersek sonu� integer olur yani mesela not2/not1 i�leminin sonucu 1 olur ��nk� 1.8'in tamsay� k�sm� 1dir
		//fakat ortalam virg�ll� bir say� olmal�d�r bu y�zden notlar�n toplam�n� bir integera de�il bir double'a  b�lmeliyiz
		//3 bir integer iken 3.0 bir double belirtir
		double ortalama = (not1+not2+not3)/3.0;
		
		System.out.println("Ortalaman: " + ortalama + "\nOrtalama int: " + (int)ortalama);
		if(ortalama>=85)
		{
			System.out.println("Takdir ald�n");
		}
		//if'in i�erisindeki �art sa�lanmazsa else if'in i�indeki �arta bak�l�r, else if'in i�indeki �art sa�lan�rsa alltaki else if'lere ve else'e hi� bak�lmaz
		else if(ortalama >= 70)
		{
			System.out.println("Te�ekk�r ald�n");
		}
		else if(ortalama>=50)
		{
			System.out.println("Ge�tin");
		}
		else
		{
			System.out.println("Ge�emedin");
		}
	}

}
