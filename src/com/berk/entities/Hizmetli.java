package com.berk.entities;

import java.util.Arrays;

public class Hizmetli extends Personel{
	public int[] gorevYaptigiKatlar;

	@Override
	public String toString() {
		return "Hizmetli [gorevYaptigiKatlar=" + Arrays.toString(gorevYaptigiKatlar) + ", ad=" + ad + ", adres=" + adres
				+ ", telefon=" + telefon + "]"+super.tc;//miras alinan sinif olduigundan protected ile miras aldigin sinifin superinden yararlanabilirsin
	}

	@Override
	public int getMaasKatSayisi() {
		return super.getMaasKatSayisi();
	}

	@Override
	public String bilgiGetir() {
		return "Ad: "+ad+" Adres: "+ getAdres()+" Telefon "+ getTelefon();
	}
	
	
}
