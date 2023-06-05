/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket_system_pydev.model;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class InsertItemAction implements ActionListener {
    private JTable table;

    public InsertItemAction(JTable table) {
        this.table = table;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String productName = JOptionPane.showInputDialog("Insert Name of Product:");

        String stockString = JOptionPane.showInputDialog("Insert Stock of Product:");
        int stock = Integer.parseInt(stockString);

        String priceString = JOptionPane.showInputDialog("Insert the price of product:");
        double price = Double.parseDouble(priceString);

        int maxCodeBar = 999;
        int codeBar = (int) (Math.random() * maxCodeBar) + 1;

        String[] row = {productName, String.valueOf(codeBar), String.valueOf(stock), String.valueOf(price)};

        DefaultTableModel invmodel = (DefaultTableModel) table.getModel();
        invmodel.addRow(row);
    }
}

