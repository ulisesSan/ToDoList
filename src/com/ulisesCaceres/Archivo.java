package com.ulisesCaceres;
import java.io.*;

public class Archivo {
    public static void Archivo(){
        try{
            String Archivo = System.getProperty("user.home") + "/Documents/ToDoList.txt";
            System.out.println(Archivo.replace("\\", "/"));

            File file = new File(Archivo);

            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(Archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Este achivo se genero de manera automatica");
            bw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void Leer(){
        String linea;

        try{
            /*aqui se realiza la apertura del archivo para comenzar la lectua del mismo*/
            File archivo = new File(System.getProperty("user.home") + "/Documents/ToDoList.txt");
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            while((linea =br.readLine())!=null){
                System.out.print(linea);
            }
            if(null != fr){
                fr.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static void Escribir(String Mensaje){
        /*La funcion de este metodo es escribir dentro de nuestro dccumento que hemos creado*/
        try{
            FileWriter archivo = new FileWriter(System.getProperty("user.home") + "/Documents/ToDoList.txt", true);
            PrintWriter pw = new PrintWriter(archivo);
                pw.println(Mensaje);
            if (null != archivo)
                archivo.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
