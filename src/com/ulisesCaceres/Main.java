package com.ulisesCaceres;
import java.util. *;

public class Main {

    public static void main(String[] args) {
        String Mensaje;
        Scanner entradaEscaner = new Scanner (System.in);
        Archivo archivo = new Archivo();
        archivo.Archivo();
        Mensaje = entradaEscaner.nextLine();
        Archivo.Escribir(Mensaje);
        Archivo.Leer();
    }
}
