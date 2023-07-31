package com.ugur;

import java.util.Scanner;

public class Runner_maraton1 {

	public static void main(String[] args) {
		OgrenciOzelListe ogrenciArray = new OgrenciOzelListe();
		MaasOzelListe maasArray = new MaasOzelListe();
		OgrenciOzelListe getList = new OgrenciOzelListe();
		OgrenciOzelListe listeYazdir = new OgrenciOzelListe();
		boolean[] yurumeHobi;
		boolean[] kitapOkumaHobby;
		boolean[] sporHobby;
		boolean[] kodYazmaHobby;

		Scanner sc = new Scanner(System.in);
		int secim;
		int ogrenciSayisi = 0;

		while (true) {

			System.out.println("*********************************");
			System.out.println("***** ÖĞRENCİ BİLGİ SİSTEMİ *****");
			System.out.println("*********************************");
			System.out.println("1- Sınıf Arkadaşı Tanımla");
			System.out.println("2- Hobilerini gir");
			System.out.println("3- Maaş beklentilerini gir");
			System.out.println("4- Sınıf Listesi");
			System.out.println("*********************************");
			System.out.println();
			System.out.print("Lütfen seçim yapınız: ");
			secim = sc.nextInt();

			switch (secim) {

			case 1:
				System.out.print("Kaç öğrenci tanımlayacaksınız? : ");

				ogrenciSayisi = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < ogrenciSayisi; i++) {
					System.out.println((i + 1) + ". Öğrencinin adı: ");
					String ogrenciAdi = sc.nextLine();
					ogrenciArray.add(ogrenciAdi);

				}

				break;
			case 2:

				yurumeHobi = new boolean[ogrenciSayisi];
				kitapOkumaHobby = new boolean[ogrenciSayisi];
				sporHobby = new boolean[ogrenciSayisi];
				kodYazmaHobby = new boolean[ogrenciSayisi];

				System.out.println("Öğrencilerin hobilerini giriniz: ");

				for (int i = 0; i < ogrenciSayisi; i++) {
					System.out.println(ogrenciArray.getList()[i] + " için hobilerini giriniz (true/false): ");
					System.out.print("Yürümekten hoşlanır mısın? ");
					yurumeHobi[i] = sc.nextBoolean();
					System.out.print("Kitap okumaktan hoşlanır mısın? ");
					kitapOkumaHobby[i] = sc.nextBoolean();
					System.out.print("Spor rutinlerin var mı? ");
					sporHobby[i] = sc.nextBoolean();
					System.out.print("Kod yazmaktan hoşlanır mısın? ");
					kodYazmaHobby[i] = sc.nextBoolean();
					sc.nextLine();
				}

				break;
			case 3:
				System.out.println("Maaş beklentilerini sırasıyla giriniz: ");

				for (int i = 0; i < ogrenciArray.getList().length; i++) {
					double maas = sc.nextDouble();
					sc.nextLine();

					System.out.println(ogrenciArray.getList()[i] + " nın maas beklentisi" + maas);

					maasArray.add(maas);

				}
				break;
			case 4:

				break;
			case 0:

				break;
			default:
				System.out.println("Lütfen geçerli bir seçim yapınız. ");

			}

		}
	}

}
