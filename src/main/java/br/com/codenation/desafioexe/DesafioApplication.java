package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	final static int LIMIT = 350;

	public static List<Integer> fibonacci() {
		List<Integer> numbersFibonacci = new ArrayList<>();
		int next = 0;
		int current = 0;
		int previous = 1;
		numbersFibonacci.add(next);
		while (next <= LIMIT) {
			next = current + previous;
			numbersFibonacci.add(next);
			previous = current;
			current = next;
		}
		return numbersFibonacci;

	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}