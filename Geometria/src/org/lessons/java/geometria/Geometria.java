package org.lessons.java.geometria;

import java.util.Scanner;

public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Creare una classe Rettangolo con due attributi interi: base e altezza.
		 * Aggiungere un opportuno costruttore con parametri. Aggiungere due metodi:
		 * calcolaArea e calcolaPerimetro che calcolano e restituiscono,
		 * rispettivamente, l’area e il perimetro del rettangolo. 2. Creare una classe
		 * Main contenente il metodo main(), nel quale chiedete all’utente di inserire,
		 * da console, i valori di base e di altezza con cui istanziare un nuovo
		 * Rettangolo. Dopo averlo istanziato, stampate a video il perimetro e l’area.
		 * BONUS Aggiungere alla classe Rettangolo un metodo disegna che disegna in
		 * console il rettangolo con le sue dimensioni, come nell’immagine allegata
		 */

		// creare una classe rettangolo

		Scanner input = new Scanner(System.in);

		System.out.print("Base : ");
		int base = input.nextInt();
		System.out.print("Altezza: ");
		int altezza = input.nextInt();

		System.out.println("Perimetro : " + (base + altezza) * 2);
		System.out.println("Area: " + base * altezza);

		for (int i = 1; i < base; i++) {
			for (int j = 1; j < altezza; j++) {
				if (i == 1 || j == 1 || i == base || j == altezza) {
					System.out.print("0 ");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}
