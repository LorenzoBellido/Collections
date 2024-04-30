package ejercicio2;

import java.util.LinkedHashSet;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> array1= new LinkedHashSet<Integer>();
		
		Random rand = new Random();
		
		do {
			array1.add(rand.nextInt(1,21));
		}while(array1.size() <= 10);
		
		System.out.println(array1);
	}

}
