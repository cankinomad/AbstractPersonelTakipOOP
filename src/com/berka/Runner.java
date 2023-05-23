package com.berka;

import com.berk.entities.Hizmetli;
import com.berk.entities.Mudur;

public class Runner {
	public static void main(String[] args) {
		
	
	//Personel p=new Personel();
	
	Mudur mudur=new Mudur();
	
	System.out.println(mudur.bilgiGetir());
	
	
	Hizmetli hizmetli=new Hizmetli();
	hizmetli.ad="Fatma";
	System.out.println(hizmetli.bilgiGetir());
	}
}
