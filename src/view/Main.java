package view;

import controller.ThreadSapos;

public class Main {
	static int pos = 1;
	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			Thread sapo = new ThreadSapos(i, pos);
			sapo.start();
		}
	}
}
