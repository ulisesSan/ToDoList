package com.ulisesCaceres;
import javax.swing.*;
import java.io.IOException;
import java.util. *;

public class Main extends JFrame{

    public static void main(String[] args) throws IOException {

        JFrame frame = new UiToDoList("To do list");
        frame.setVisible(true);
        /*String Mensaje;
        Scanner entradaEscaner = new Scanner (System.in);
        Archivo archivo = new Archivo();
        archivo.Archivo();
        Mensaje = entradaEscaner.nextLine();
        Archivo.Escribir(Mensaje);
        Archivo.Leer();
        Mensaje = null;
        Mensaje = entradaEscaner.nextLine();

        Archivo.Eliminar(Mensaje);
        Archivo.Leer();*/
    }
}
