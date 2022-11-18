package com.mycompany.donquijote;

public class ActividadExtra {

    String ejemplo = "";
    char[] vocales = {'a', 'e', 'i', 'o', 'u'};
    String vocales2 = "";
    char[] consonantes = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
    String conso = "";
    char[] especiales = {',', ':', ';', '.', '¿', '?', '¡', '!', '(', ')'};
    String especiales2 = "";

    public static void main(String[] args) {
        String texto = "Que trata de la condición y ejercicio del famoso hidalgo D. Quijote de la Mancha\n"
                + "En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero,"
                + " adarga antigua, rocín flaco y galgo corredor. Una olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los sábados, "
                + "lentejas los viernes, algún palomino de añadidura los domingos, consumían las tres partes de su hacienda. El resto della concluían sayo de velarte,"
                + " calzas de velludo para las fiestas con sus pantuflos de lo mismo, los días de entre semana se honraba con su vellori de lo más fino."
                + " Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no llegaba a los veinte,"
                + " y un mozo de campo y plaza, que así ensillaba el rocín como tomaba la podadera.";
        ActividadExtra ejemplo = new ActividadExtra();
        System.out.println("Voclales: " + ejemplo.contarVocales(texto));
        System.out.println("Consonantes: " + ejemplo.contarConsonantes(texto));
        System.out.println("Caracteres especiales: " + ejemplo.contarEspeciales(texto));
        System.out.println("Números: " + ejemplo.contarNumeros(texto));
        System.out.println("Espacios: " + ejemplo.contarEspecios(texto));
    }

    public int contarVocales(String texto) {
        int numVocales = 0;
        for (int i = 0; i < texto.length(); i++) {
            for (int a = 0; a < vocales.length; a++) {
                if (texto.charAt(i) == vocales[a]) {
                    numVocales++;
                    vocales2 += texto.charAt(i);
                }
            }
        }
        return numVocales;
    }

    public int contarConsonantes(String texto) {
        int numConso = 0;
        for (int i = 0; i < texto.length(); i++) {
            for (int b = 0; b < consonantes.length; b++) {
                if (texto.charAt(i) == consonantes[b]) {
                    numConso++;
                    conso += texto.charAt(i);
                }
            }
        }
        return numConso;
    }

    public int contarNumeros(String texto) {
        int contadorNum = 0;
        char[] caracteres = texto.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            if (Character.isDigit(caracteres[i])) {
                ++contadorNum;
            }
        }
        return contadorNum;
    }

    public int contarEspecios(String texto) {
        int contadorEspacios = 0;
        char[] caracteres = texto.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            if (Character.isSpaceChar(caracteres[i])) {
                ++contadorEspacios;
            }
        }
        return contadorEspacios;

    }

    public int contarEspeciales(String texto) {
        int contadorEspeciales = 0;
        for (int i = 0; i < texto.length(); i++) {
            for (int b = 0; b < especiales.length; b++) {
                if (texto.charAt(i) == especiales[b]) {
                    contadorEspeciales++;
                    especiales2 += texto.charAt(i);
                }
            }
        }
        return contadorEspeciales;
    }
}
