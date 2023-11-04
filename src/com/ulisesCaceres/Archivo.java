package com.ulisesCaceres;
import java.io.*;
import java.util.Locale;

public class Archivo {

    private static String Folder;
    private static String Os;
    protected static String Archivo;

    public static void initVariables(){

        if(Locale.getDefault().getLanguage().equals("es")){
            Folder = "/Documentos";
        }else{
            Folder = "/Documents";
        }
        Archivo = System.getProperty("user.home") + Folder +"/ToDoList.txt".replace("\\", "/");
    }

    public static void crearArchivo(){
        try{
            File file = new File(Archivo);
            if(file.exists() && !file.isDirectory()){
                System.out.println("el archivo existe");;
            }else{
                file.createNewFile();
                System.out.println("Archivo creado exitosamente");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

    public static void Leer(){
        String linea;
        int enumeracion = 1;
        try{
            /*aqui se realiza la apertura del archivo para comenzar la lectua del mismo*/
            File archivo = new File(Archivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while((linea =br.readLine())!=null){
                System.out.println(enumeracion++ + ". " +linea);
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
           FileWriter archivo = new FileWriter(Archivo, true);
            PrintWriter pw = new PrintWriter(archivo);
            pw.println(Mensaje);
            archivo.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void Eliminar(String Dato){
        try{
            File Entrada = new File(Archivo);
            File Temporal = new File(System.getProperty("user.home") + Folder +"/ToDoList_temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(Archivo));
            BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.home") + Folder +"/ToDoList_temp.txt"));

            String currentLine;

            while((currentLine = reader.readLine()) != null) {
                // Busca la linea y luego la salta mientras escribe en el achivo temporal las lineas que fueron "aceptadas"
                String trimmedLine = currentLine.trim();
                if(trimmedLine.equals(Dato)) {
                    continue;
                }
                writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close();
            reader.close();
            if(Entrada.exists()){
                Entrada.delete();
                Temporal.renameTo(Entrada);
                Temporal.renameTo(Entrada);
            }else{
                System.out.println("No entra");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void cleanTerminal(){
        String Command = "";
        try{
            if(Os.contains("Windows")){
                Command = "\"/c\",\"cls\"";
            }
            else{
                Command = "clear";
            }
            ProcessBuilder processBuilder = new ProcessBuilder(Command);
            Process clearScreen = processBuilder.inheritIO().start();
            clearScreen.waitFor();
            Runtime.getRuntime().exec(Command);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
