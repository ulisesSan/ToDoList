package com.ulisesCaceres;

import javax.swing.*;

public class UiToDoList extends JFrame{
    private JPanel UiToDoList;

    public UiToDoList(String title){
        super (title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(UiToDoList);
        this.pack();
    }
}
