package com.puzzle.temperature;

import java.util.Scanner;

public class Temperature {
	 /*
     * méthode de tri d'un tableau 
     */
	public static int[] Tri(int[] tab) {

		for (int i = 0; i < tab.length - 1; i++) {

			if (tab[i] < tab[i + 1]) {
				int tmp = tab[i];
				tab[i] = tab[i + 1];
				tab[i + 1] = tmp;
			}

		}
		return tab;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt(); // the number of temperatures to analyse

	}

}
