package com.rehber.rehber_islemleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class App 
{
	
	static List<Person> personsList = new ArrayList<>();

	static RehberIslemleri rehberIslemleri = new RehberIslemleri();

	

	
	public App() {

	}
	
    public static void main( String[] args )
    {

    	Scanner scanner = new Scanner(System.in);

    	Secici secici = new Secici();
    	Input inputs = new Input();

		secici.secimYap(scanner, inputs);


	}


	public static void menuMetniGetir() {

		System.out.println("Lütfen rehberde yapılacak işlemleri seciniz.");
		System.out.println("0 - Kisi ekle");
		System.out.println("1 - Ad ve soyada göre listeleme yap");
		System.out.println("2 - Kisi sil ");
		System.out.println("3 - Ada göre kisi sil");
		System.out.println("4 - Cikis yap");
		
	}

    
}
