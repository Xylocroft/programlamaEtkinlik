
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String isim = "kerem";
		//Elemanlar�n� belirterek array olu�turma
		String[] isimler = {"kerem", "arda", "atahan","g�k�e","sarp","berkay","melik"};
		
		//arrayin eleman�na ula�ma
		String ikincikisi = isimler[3];
		System.out.println(ikincikisi);
		//arrayin eleman�n� de�i�tirme
		isimler[3] = "g�k�e2";
		System.out.println(isimler[3] + " " + ikincikisi);
		System.out.println(isimler.length);
		
		int[] sayilar = {5,8,10};
		//eleman say�s�n� belirterek array olu�turma
		int[] sayilar1 = new int[10];
		sayilar1[5] = 3;
		System.out.println(sayilar1[5]);
		
	}

}
