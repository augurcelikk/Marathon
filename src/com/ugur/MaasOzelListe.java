package com.ugur;

public class MaasOzelListe {

	double[] maasArray;
	int boyut = 0;

	/**
	 * dizinin içine eklenecek sayı bilgisini alarak diziye ekleme yapar.
	 * 
	 * @param maas -> eklenilecek sayıyı girin.
	 */

	public void add(double maas) {
		double[] tmp;
		if (maasArray == null) {
			maasArray = new double[1];
			maasArray[0] = maas;
		} else {
			tmp = new double[boyut + 1];
			for (int i = 0; i < boyut; i++)
				tmp[i] = maasArray[i];
			tmp[boyut] = maas;
			maasArray = tmp;
		}
		boyut++;
	}
}
