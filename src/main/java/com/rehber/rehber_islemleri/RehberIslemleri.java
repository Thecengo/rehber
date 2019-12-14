package com.rehber.rehber_islemleri;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RehberIslemleri {

	public static Person kisiOlustur(Scanner scanner, Input inputs) {

		String ad = inputs.stringDegerIste(scanner, StringYazici.LUTFEN_AD_GIRINIZ_YAZISI);
		String soyAd = inputs.stringDegerIste(scanner,StringYazici.LUTFEN_SOY_AD_GIRINIZ_YAZISI);
		String telNo = inputs.stringDegerIste(scanner,StringYazici.LUTFEN_TELEFON_NUMARASI_GIRINIZ_YAZISI);

		Person person = new Person(ad,soyAd,telNo);

		System.out.println(person.getAd() + "basari ile olusturulmustur");

		return person;
	}

	public static void kisiSilByAd(String silinecekAd) {
		Iterator<Person> itr = App.personsList.iterator();

		while(itr.hasNext()){
			Person person = itr.next();
			if(person.getAd().equals(silinecekAd)){
				itr.remove();
				System.out.println(person.getAd() + "başarı ile silinmistir");
			}
		}
	}

	public static void kisiSilById(int id) {
		Iterator<Person> itr = App.personsList.iterator();

		while(itr.hasNext()){
			Person person = itr.next();
			if(person.getId() == id){
				itr.remove();
				System.out.println(person.getAd() + "başarı ile silinmistir");
			}
		}

	}

	public static void kisiListele() {
		System.out.println(StringYazici.CIZGI_DESENI);
		System.out.println(StringYazici.LISTE_UST_YAZISI);
		System.out.println(StringYazici.CIZGI_DESENI);
		for(Person personInList  : App.personsList){
			System.out.printf("%d \t %s \t %s \t %s \n",personInList.getId(), personInList.getAd(),personInList.getSoyad(),personInList.getTel());
		}

	}


	public static void rehberdeBaslayanHarfAramasiYap(Scanner scanner, String istenilenCumle, Input input) {
		
		String aranacakHarfler = input.stringDegerIste(scanner, istenilenCumle);
		
		for(int i = 0; i < App.personsList.size(); i++) {
			String ad = App.personsList.get(i).getAd();
			if(ad.startsWith(aranacakHarfler)) {
				System.out.printf("%d \t %s \t %s \t %s \n",App.personsList.get(i).getId(), App.personsList.get(i).getAd(),App.personsList.get(i).getSoyad(),App.personsList.get(i).getTel());
			}
		}
		
		
	}

}
