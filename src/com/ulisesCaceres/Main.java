package com.ulisesCaceres;
import javax.swing.*;
import java.io.IOException;
import java.util. *;

public class Main extends JFrame{

    public static void main(String[] args) throws IOException {
        /*JFrame frame = new UiToDoList("To do list");
        frame.setVisible(true);*/
        int opc = 0;
        Archivo.initVariables();
        Scanner entradaEscaner = new Scanner (System.in);
        Archivo.crearArchivo();
        try{
            while(true){
                System.out.println("Ingrese una opcion\n1. Leer\n2. Escribir\n3. Eliminar");
                opc = Integer.parseInt(entradaEscaner.nextLine());
                switch(opc){
                    case 1:
                        Archivo.Leer();
                        break;
                    case 2:
                        System.out.println("Escriba la nueva tarea");
                        Archivo.Escribir(entradaEscaner.nextLine());
                    break;
                    case 3:
                        Archivo.Leer();
                        System.out.println("Ingrese el numero de la tarea que quiere eliminar");
                        Archivo.Eliminar(entradaEscaner.nextLine());
                    break;
                }
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
