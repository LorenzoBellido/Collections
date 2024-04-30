package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> array1 = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			array1.add(i);
		}
		
		System.out.println(array1);
		
		Collections.shuffle(array1);
		
		System.out.println(array1);
	}

}
