package com.rehber.rehber_islemleri;

import java.util.Scanner;

public class Input {
	
	
	public String stringDegerIste(Scanner scanner, String istenilenCumle) {
		System.out.println(istenilenCumle);

		return scanner.nextLine();
	}

	public int intSayiDegeriIste(Scanner scanner, String istenilenCumle){

		System.out.println(istenilenCumle);

		return scanner.nextInt();
	}

	

	

}
