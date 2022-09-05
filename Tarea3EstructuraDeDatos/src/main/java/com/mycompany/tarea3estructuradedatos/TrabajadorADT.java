package com.mycompany.tarea3estructuradedatos;

public class TrabajadorADT {

    private int numTrabajador;
    private String nombreTrabajador;
    private String aPaterno;
    private String aMaterno;
    private int anioIngreso;
    private int sueldoBase;
    private int hrExtra;
    private double totalPago;
    private int antiguedad;
    double pagoHrExtra = 276.5;

    public TrabajadorADT(int numTrab, String nom, String aPat, String aMat, int hExt, int sueldoB, int anioIn) {
        this.numTrabajador = numTrab;
        this.nombreTrabajador = nom;
        this.aPaterno = aPat;
        this.aMaterno = aMat;
        this.hrExtra = hExt;
        this.sueldoBase = sueldoB;
        this.anioIngreso = anioIn;
    }

    public int getNumTrabajador() {
        return numTrabajador;
    }

    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHrExtra() {
        return hrExtra;
    }

    public void setHrExtra(int hrExtra) {
        this.hrExtra = hrExtra;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public double CalcularSueldo() {
        antiguedad = 2022 - this.anioIngreso;
        totalPago = this.sueldoBase + (this.sueldoBase * (antiguedad * 0.03)) + (this.hrExtra * pagoHrExtra);
        return totalPago;
    }
    
    public String toString(){
        String cadena = "";
        cadena += numTrabajador + "\n";
        cadena += nombreTrabajador + "\n";
        cadena += aPaterno + "\n";
        cadena += aMaterno + "\n";
        cadena += hrExtra + "\n";
        cadena += sueldoBase + "\n";
        cadena += anioIngreso + "\n";
        return cadena;
    }
}
