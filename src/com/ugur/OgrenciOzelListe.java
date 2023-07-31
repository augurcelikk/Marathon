package com.ugur;

public class OgrenciOzelListe {

	String[] ogrenciArray;
	int boyut = 0;

	/**
	 * dizinin içine eklenilecek sayı bilgisini alarak diziye ekleme yapar.
	 * 
	 * @param sayi -> eklemek istediğiniz sayıyı giriniz.
	 */

	public void add(String ogrenciAdi) {
		String[] tmp;
		if (ogrenciArray == null) {
			ogrenciArray = new String[1];
			ogrenciArray[0] = ogrenciAdi;
		} else {
			tmp = new String[boyut + 1]; // sayıDizisinden 1 eleman daha büyük olan bir dizi tanımladım
			for (int i = 0; i < boyut; i++) // sayıDizisinin tüm elemanlarını tmp ye aktardım
				tmp[i] = ogrenciArray[i];
			tmp[boyut] = ogrenciAdi;
			ogrenciArray = tmp;
		}
		boyut++;// 2

	}

	public String[] getList() {
		return ogrenciArray;
	}

	public void listeYazdir() {
		for (int i = 0; i < ogrenciArray.length; i++) {
			System.out.println((i + 1) + " .Öğrenci" + ogrenciArray[i]);

		}
	}

}
