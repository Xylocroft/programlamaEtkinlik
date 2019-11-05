
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String isim = "kerem";
		//Elemanlarýný belirterek array oluþturma
		String[] isimler = {"kerem", "arda", "atahan","gökçe","sarp","berkay","melik"};
		
		//arrayin elemanýna ulaþma
		String ikincikisi = isimler[3];
		System.out.println(ikincikisi);
		//arrayin elemanýný deðiþtirme
		isimler[3] = "gökçe2";
		System.out.println(isimler[3] + " " + ikincikisi);
		System.out.println(isimler.length);
		
		int[] sayilar = {5,8,10};
		//eleman sayýsýný belirterek array oluþturma
		int[] sayilar1 = new int[10];
		sayilar1[5] = 3;
		System.out.println(sayilar1[5]);
		
	}

}
