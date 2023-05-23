package com.berk.entities;

public class Muhasebeci extends Personel {
	public String mahasebeUnvani;

	public Muhasebeci() {
		super();
	}
	
	@Override
	public int getMaasKatSayisi() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public String bilgiGetir() {
		return "Ad: "+getAd()+" Adres: "+ getAdres()+" Telefon "+ getTelefon();
	}
}
