package com.rehber.rehber_islemleri;

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
		for (Person person1 : App.personsList){
			if (person1.getAd().equals(silinecekAd)){
				App.personsList.remove(person1);
				System.out.println(person1.getAd() + "basari ile silinmistir.");
			}
		}
	}

	public static void kisiSilById(int id) {

		for(Person person1 : App.personsList){
			if(id == person1.getId()){
				int index = id -1;
				App.personsList.remove(index);
				System.out.println(person1.getAd() + "basari ile silinmistir.");
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


	public void rehberdeBaslayanHarfAramasiYap(List<Person> personList, Scanner scanner) {
		
		String aranacakHarfler = scanner.nextLine();
		
		for(int i = 0; i < personList.size(); i++) {
			String ad = personList.get(i).getAd();
			if(ad.startsWith(aranacakHarfler)) {
				System.out.println(ad);
			}
		}
		
		
	}

}
