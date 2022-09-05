package com.mycompany.tarea3estructuradedatos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Nomina {

    public static void main(String[] args) {

        ArregloADT nomina = new ArregloADT(14);
        try {
            BufferedReader br = new BufferedReader(new FileReader("junio.dat"));
            br.readLine();
            for (int i = 0; i < 14; i++) {
                String[] tmp = br.readLine().split(",");
                TrabajadorADT temporal = new TrabajadorADT(Integer.parseInt(tmp[0]), tmp[1], tmp[2], tmp[3], Integer.parseInt(tmp[4]), Integer.parseInt(tmp[5]), Integer.parseInt(tmp[6]));
                nomina.setElemento(i, temporal);
            }

            System.out.println("\t-------S U E L D O S-------");
            System.out.println("");
            for (int i = 0; i < nomina.getLongitud(); i++) {
                TrabajadorADT trabajador = (TrabajadorADT) nomina.getElemento(i);
                System.out.println("NUMERO DEL TRABAJADOR: " + trabajador.getNumTrabajador() + "\t  SUELDO: " + trabajador.CalcularSueldo());

            }

            System.out.println("\t ------Trabajador con mayor antiguedad------");
            int mayor = 2023;
            int i1 = 0;
            for (int i = 0; i < nomina.getLongitud(); i++) {
                TrabajadorADT tempo = (TrabajadorADT) nomina.getElemento(i);
                if (tempo.getAnioIngreso() < mayor) {
                    i1 = i;
                    mayor = tempo.getAnioIngreso();

                }

            }
            System.out.print(nomina.getElemento(i1));

            int menor = 0;
            int i2 = 0;
            for (int i = 0; i < nomina.getLongitud(); i++) {
                TrabajadorADT tmp = (TrabajadorADT) nomina.getElemento(i);
                if (tmp.getAnioIngreso() > menor) {
                    menor = tmp.getAnioIngreso();
                    i2 = i;
                }
            }
            System.out.println("\t ------Trabajador con menor antiguedad------");
            System.out.println(nomina.getElemento(i2));

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
