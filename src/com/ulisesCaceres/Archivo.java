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
        File archivo = null;
        FileReader fr  = null;
        BufferedReader br = null;
        String Archivo = System.getProperty("user.home") + "/Documents/ToDoList.txt";
        String linea;

        try{
            /*aqui se realiza la apertura del archivo para comenzar la lectua del mismo*/
            archivo = new File(Archivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            while((linea =br.readLine())!=null){
                System.out.print(linea);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            /*Se cierra el archivo para su futura edicion*/
            try{
                if(null != fr){
                    fr.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
