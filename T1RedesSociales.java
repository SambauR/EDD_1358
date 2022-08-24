package com.mycompany.tarea1estructuradedatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T1RedesSociales {

    public static void main(String[] args) {
        String[] RedesArreglo = new String[316];
        try {
            File openCSV = new File("/Users/sam/Downloads/presenciaredes-2.csv");
            Scanner scanner = new Scanner(openCSV);
            scanner.useDelimiter(",");
            int j = 0;
            while (scanner.hasNext()) {
                RedesArreglo[j] = scanner.next(); //pasar los datos a un arreglo
                j++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //del arreglo a una matriz
        String[][] MatrizRedes = new String[19][16];
        int u = 0;
        for (int h = 0; h < 16; h++) {
            for (int j = 0; j < 19; j++) {
                MatrizRedes[j][h] = RedesArreglo[u];
                u++;
            }
        }
        for (int h = 0; h < 16; h++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(MatrizRedes[j][h] + " || ");
            }
        }
        System.out.println();
//        for (int i = 0; i < RedesArreglo.length; i++) {            
//            System.out.print(RedesArreglo[i] + "  ||  ");//mostrar el arreglo
//        }
        //diferencia twitter
        System.out.println(MatrizRedes[13][13]);
        int diferencia;
        diferencia = Integer.parseInt(MatrizRedes[14][6]) - Integer.parseInt(MatrizRedes[9][6]);
        System.out.println("\nLa diferencia de seguidores de Twitter entre los "
                + "meses de Enero a Junio es de: " + diferencia);
            //diferencia youtube
//            int primerMes, segundoMes, diferenciaYoutube;
//            Scanner lector = new Scanner(System.in);
//            System.out.println("Elige un mes con mayor visualizaciones primero");           
//            System.out.println("ENERO : 1");
//            System.out.println("FEBRERO : 2");
//            System.out.println("MARZO : 3");
//            System.out.println("ABRIL : 4");
//            System.out.println("MAYO : 5");
//            System.out.println("JUNIO : 6");
//            System.out.println("Elige el mes de acuerdo al menú:");
//            primerMes = lector.nextInt();
//            System.out.println("Elige otro mes de acuerdo al menú");
//            segundoMes = lector.nextInt();
//            
            //diferenciaYoutube = Integer.parseInt(s)

        //promedio fb y twitter
        double promFacebook = 0, promTwitter = 0;
        for (int y = 5; y <= 10; y++) {
            promTwitter += Double.parseDouble(MatrizRedes[y][7]);
        }
        promTwitter = promTwitter / 6;
        System.out.println("El promedio de crecimiento de Twitter es de: "
                + "" + promTwitter);

        for (int y = 14; y < 19; y++) {
            promFacebook += Double.parseDouble(MatrizRedes[y][1]);
        }
        promFacebook = promFacebook + Double.parseDouble(MatrizRedes[0][2]);
        promFacebook = promFacebook/6;
        System.out.println("El promedio de crecimiento de Faceboook es de "
                + "" + promFacebook);

    }
}

