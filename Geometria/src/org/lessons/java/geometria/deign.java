package org.lessons.java.geometria;

public class deign {
	
	class Rettangolo {
	    // Attributi
	    private int base;
	    private int altezza;
	    
	public void disegna() {
        for (int i = 0; i < altezza; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
