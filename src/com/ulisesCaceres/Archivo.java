package com.ulisesCaceres;
import java.io.*;

public class Archivo {
    public static void Archivo(){
        try{

            String Archivo = System.getProperty("user.home") + "/Documents/ToDoList.txt";
            System.out.println(Archivo.replace("\\", "/"));

            File file = new File(Archivo);

            if(file.exists() && !file.isDirectory()){
                System.out.println("el archivo existe");
            }else{
                file.createNewFile();
            }
            //FileWriter fw = new FileWriter(Archivo);
           // BufferedWriter bw = new BufferedWriter(fw);
            //bw.close();
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
                System.out.println(linea);
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

    public static void Eliminar(String Dato){
        try{
            File Entrada = new File(System.getProperty("user.home") + "/Documents/ToDoList.txt");
            File Temporal = new File(System.getProperty("user.home") + "/Documents/ToDoList_temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.home") + "/Documents/ToDoList.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/Documents/ToDoList_temp.txt"));

            String lineToRemove = Dato;
            String currentLine;

            while((currentLine = reader.readLine()) != null) {
                // Busca la linea y luego la salta mientras escribe en el achivo temporal las lineas que fueron "aceptadas"
                String trimmedLine = currentLine.trim();
                if(trimmedLine.equals(lineToRemove)) continue;
                writer.write(currentLine + System.getProperty("line.separator"));

            }
            if(Entrada.exists() && !Entrada.isDirectory()){
                Entrada.delete();
                Temporal.renameTo(Entrada);
            }else{
                Temporal.renameTo(Entrada);
            }
            writer.close();
            reader.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
