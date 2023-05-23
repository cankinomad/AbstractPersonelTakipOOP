package com.berk.entities;

public class Mudur extends Personel{ //mudure personel ozelliklerini eklemis oldun
									//bu ozellige inheritance denir
public String yonetimDepartmani;
public String mudurDerecesi;


public Mudur() {
	super();  //super keywordu miras aldigin sinifin constructorina gorturuyor.
	System.out.println("Mudur sinifi bos constructor calisti");
}


public Mudur(String ad, String adres,String telefon,String yonetimDepartmani) {
	super(ad,adres,telefon);
	this.yonetimDepartmani = yonetimDepartmani;
	System.out.println("Mudur sinifi 4 parametreli constructor calisti");
}


//@Override
//public String toString() {
//	return "Mudur [yonetimDepartmani=" + yonetimDepartmani + ", ad=" + ad
//			+ ", adres=" + adres + ", telefon=" + telefon + "]"; //boyle uzun uzun yazma git personelden super.toString ile cek sadece kendine ozgu ozelliklerini tut.
//}
public String toString() {
	return "Mudur [uzmanlikAlani=" + yonetimDepartmani + "]"+super.toString()+"tc"+super.tc; //superden cekiyorsun personelin tostringini cekiyor.
}


@Override
public void calis() {//override ederken tipini koruman gerekiyor overloadda gerekmiyor.
	System.out.println("***********Mudur Calisiyor*************");
}

@Override
public int getMaasKatSayisi() {
	return 5;
}

public void yeniMaasHesapla() {
	
}


@Override
public String bilgiGetir() {
	return "Ad: "+getAd()+" Adres: "+ getAdres()+" Telefon "+ getTelefon();
}







//erisim belirleyicisi: Default: Ayni package'daki classlar erisebilir.
//Diger package'lardaki classlar erisemez.
//Constructor: Kurucu, Siniftan yaratirken calisan metod.


	
}
