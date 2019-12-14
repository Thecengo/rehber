package com.rehber.rehber_islemleri;

import java.util.Scanner;

public class Secici {

    public  void secimYap(Scanner scanner, Input inputs) {
        boolean devamEdilsin = true;

        while(devamEdilsin) {

            System.out.println(StringYazici.CIZGI_DESENI);

            App.menuMetniGetir();

            int secim = scanner.nextInt() ;

            scanner.nextLine();

            switch (secim){
                case 0:
                    Person person = RehberIslemleri.kisiOlustur(scanner, inputs);

                    App.personsList.add(person);

                    break;
                case 1:
                    RehberIslemleri.kisiListele();
                    break;
                case 2:
                    RehberIslemleri.kisiListele();

                    String SILMEK_ISTEDIGINIZ_ID_YAZISI = "Listeden silmek istediğiniz kisinin id'sini seciniz";
                    int id = inputs.intSayiDegeriIste(scanner, SILMEK_ISTEDIGINIZ_ID_YAZISI);

                    RehberIslemleri.kisiSilById(id);

                    break;

                case 3:
                    RehberIslemleri.kisiListele();

                    String LISTEDEN_SİLMEK_ISTEDIGINIZ_ADI_GIRINIZ_YAZISI = "Listeden silmek istediğiniz adi giriniz";

                    String silinecekAd= inputs.stringDegerIste(scanner, LISTEDEN_SİLMEK_ISTEDIGINIZ_ADI_GIRINIZ_YAZISI);

                    RehberIslemleri.kisiSilByAd(silinecekAd);

                    break;
                case 4:
                    devamEdilsin = false;
                    break;
            }

        }
    }
	

}
