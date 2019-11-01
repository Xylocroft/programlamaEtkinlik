
public class casting {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Bu bir yorum satýrýdýr, bilgisayar burayý okumaz, çalýþtýrmaz
		//Double virgüllü sayýlarý tutabilen bir deðiþkendir
		double a = 5.8798;
		//deðiþkenin önüne (int) yazarak doubledan integer'a çevirdik yani b'nin deðeri 5 oldu
		int b = (int)a;
		System.out.println(b);
		
		int sayi1 = 123;
		int sayi2 = 456;
		String birlesik;
		
		//Integer.toString() ile integer olan deðiþkeni stringe çevirdik
		birlesik = Integer.toString(sayi1) + "a"+ Integer.toString(sayi2);
		System.out.println(birlesik);
		
		String str1 = "15";
		String str2 = "24";
		//Integer.parseInt() ile içerisinde sayý barýndýran string'i integera çevirdik
		int toplam = Integer.parseInt(str1) + Integer.parseInt(str2);
		System.out.println(toplam);
		
		int deneme = Integer.parseInt(birlesik);
		
		System.out.println(deneme);
	}

}
