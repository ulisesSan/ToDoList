package com.ulisesCaceres;
import java.io.IOException;
import java.util. *;

public class Main {

    public static void main(String[] args) throws IOException {
        String Mensaje;
        Scanner entradaEscaner = new Scanner (System.in);
        Archivo archivo = new Archivo();
        archivo.Archivo();
        Mensaje = entradaEscaner.nextLine();
        Archivo.Escribir(Mensaje);
        Archivo.Leer();
        Mensaje = null;
        Mensaje = entradaEscaner.nextLine();

        Archivo.Eliminar(Mensaje);
        Archivo.Leer();
    }
}
