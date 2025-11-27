package javaExample;

import java.util.Scanner;

public class KalınSesInceSes {

	public static void main(String[] args) {
		// TODO
		Scanner k = new Scanner(System.in);
		char harf = k.next().charAt(0);
		
		switch(harf) {
			case 'A':
			case 'I':
			case 'U':
				System.out.println("Kalın Sesli");
				break;
			case 'İ':
			case 'E':	
			case 'Ü':
			case 'Ö':
				System.out.println("İnce Sesli");
				break;
			default:
				System.out.println("Girdiğiniz Harf Sessiz Bir Harftir");
		}
		

	}

}
