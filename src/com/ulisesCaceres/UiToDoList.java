package com.ulisesCaceres;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UiToDoList extends JFrame{
    private JPanel UiToDoList;
    private JButton Agregar;
    private JTextField textField1;
    private JTable table1;
    private JButton Eliminar;
    private JButton Actualizar;

    public UiToDoList(String title) throws IOException {
        super (title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(UiToDoList);
        this.setMinimumSize(new Dimension(400,200));
        this.setMaximumSize(new Dimension(400,200));
        this.pack();

        try{
            tablaTareas();
        }catch(Exception ex){
            System.out.print(ex.toString());
        }

    }

    public void tablaTareas() throws IOException {
        Archivo ar = new Archivo();
        BufferedReader datos = ar.Leer();
        String tareas = "";
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Tarea");
        try{
            while((tareas = datos.readLine()) != null){
                model.addRow(new Object[]{tareas});
                System.out.println(tareas);
            }
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
        table1.setModel(model);
    }
}
