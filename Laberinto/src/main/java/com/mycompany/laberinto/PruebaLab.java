
package com.mycompany.laberinto;

public class PruebaLab {

    public static void main(String[] args) {
        Laberinto Lab = new Laberinto("/Users/sam/Documents/Laberinto"
                + "/src/main/java/com/mycompany/"
                + "laberinto/Camino.csv");
		
		Lab.recorridoMatriz();
		Lab.solucion();
	}
    }
    

