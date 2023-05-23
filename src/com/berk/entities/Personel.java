package com.berk.entities;
//final classlarda kalitim yapilamaz. miras alinmasi engellenir.
public abstract class Personel {
	public String ad;
	public String adres;
	public String telefon;
	protected String tc;
	public String cepTel;
	public int yas;
	private int maas;
	private int maasKatSayisi;
	public int gorevTazminati;
	
	
	
	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getAdres() {
		return adres;
	}


	public void setAdres(String adres) {
		this.adres = adres;
	}


	public String getTelefon() {
		return telefon;
	}


	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}


	public String getTc() {
		return tc;
	}


	public void setTc(String tc) {
		this.tc = tc;
	}


	public String getCepTel() {
		return cepTel;
	}


	public void setCepTel(String cepTel) {
		this.cepTel = cepTel;
	}


	public int getYas() {
		return yas;
	}


	public void setYas(int yas) {
		this.yas = yas;
	}


	public int getGorevTazminati() {
		return gorevTazminati;
	}


	public void setGorevTazminati(int gorevTazminati) {
		this.gorevTazminati = gorevTazminati;
	}


	public void setMaasKatSayisi(int maasKatSayisi) {
		this.maasKatSayisi = maasKatSayisi;
	}


	public int getMaas() {
		return 10000;	//burayi maas doondurup set maas icin tek tek ayarlamalar yapabilirsin
		//boylelikle her personel icin farkli maas girebilirsin
	}
	
	
	public void setMaas(int maas) {
		this.maas = maas;
	}


	public int getMaasKatSayisi() {
		return 1;
	}
	public Personel() {
		super();
		System.out.println("Personel sinifi bos constructor calisti");
	}
	public Personel(String ad, String adres,String telefon) {
		this.ad=ad;
		this.adres=adres;
		this.telefon=telefon;
		System.out.println("personel 3 parametreli constructor");
	}
	
	public String toString() {
		return "Personel sinifindaki toString() [ad=" + ad + ", adres=" + adres + ", telefon=" + telefon + "]";
	}
//	protected String toStringPrivate() {//boyle yaparak sadece miras alan class uzerinden kullanabilirsin ama private yapilmaz.
//		return "Personel sinifindaki toString() [ad=" + ad + ", adres=" + adres + ", telefon=" + telefon + "]";
//	}
//	
	public void calis() {
		System.out.println("Personel calisiyor");
	}
	
	//public abstract String bilgiGetir();
	//final keywordu eklenen metod override edilemez.
	public abstract String bilgiGetir();	
	

}