package com.ulisesCaceres;
import javax.swing.*;
import java.io.IOException;
import java.util. *;

public class Main extends JFrame{

    public static void main(String[] args) throws IOException {
        /*JFrame frame = new UiToDoList("To do list");
        frame.setVisible(true);*/
        int i = 0;
        String Mensaje = "";
        Archivo.initVariables();
        Scanner entradaEscaner = new Scanner (System.in);
        Archivo.crearArchivo();
        try{
            while(true ){
                Archivo.Leer();
                Archivo.Escribir(Mensaje);
                Archivo.Leer();
                Mensaje = entradaEscaner.nextLine();
                Archivo.cleanTerminal();
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
