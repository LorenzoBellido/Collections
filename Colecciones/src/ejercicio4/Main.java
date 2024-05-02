package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		
		ArrayList<String> nombres = new ArrayList<String>();

		while(nombres.size()< 5) {
			System.out.println("Introduzca el nombre: ");
			nombre = sc.nextLine();
			if(!nombres.contains(nombre)) {
			nombres.add(nombre);
			}
		}
		System.out.println(nombres);
		Collections.reverse(nombres);
		System.out.println(nombres);
	
	sc.close();
	}

}
