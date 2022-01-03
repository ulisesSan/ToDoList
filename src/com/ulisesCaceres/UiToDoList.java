package com.ulisesCaceres;

import javax.swing.*;
import java.awt.*;

public class UiToDoList extends JFrame{
    private JPanel UiToDoList;
    private JButton Agregar;
    private JTextField textField1;
    private JTable table1;
    private JButton Eliminar;
    private JButton Actualizar;

    public UiToDoList(String title){
        super (title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(UiToDoList);
        this.setMinimumSize(new Dimension(400,200));
        this.setMaximumSize(new Dimension(400,200));
        this.pack();
    }
}
