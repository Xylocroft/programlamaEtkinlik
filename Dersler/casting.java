
public class casting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Bu bir yorum sat�r�d�r, bilgisayar buray� okumaz, �al��t�rmaz
		//Double virg�ll� say�lar� tutabilen bir de�i�kendir
		double a = 5.8798;
		//de�i�kenin �n�ne (int) yazarak doubledan integer'a �evirdik yani b'nin de�eri 5 oldu
		int b = (int)a;
		System.out.println(b);
		
		int sayi1 = 123;
		int sayi2 = 456;
		String birlesik;
		
		//Integer.toString() ile integer olan de�i�keni stringe �evirdik
		birlesik = Integer.toString(sayi1) + "a"+ Integer.toString(sayi2);
		System.out.println(birlesik);
		
		String str1 = "15";
		String str2 = "24";
		//Integer.parseInt() ile i�erisinde say� bar�nd�ran string'i integera �evirdik
		int toplam = Integer.parseInt(str1) + Integer.parseInt(str2);
		System.out.println(toplam);
		
		int deneme = Integer.parseInt(birlesik);
		
		System.out.println(deneme);
	}

}
