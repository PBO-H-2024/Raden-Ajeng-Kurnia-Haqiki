/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.RecruitController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC PRAKTIKUM
 */
public class RecruitView {
    //Input Data
    class InputData extends JFrame{
    
        JFrame window = new JFrame("Student Input");

        JLabel lName = new JLabel("NAME");
        JTextField fName = new JTextField();

        JLabel lwScore = new JLabel("Writing");
        JTextField fwScore = new JTextField();
        
        JLabel lcScore = new JLabel("Coding");
        JTextField fcScore = new JTextField();
        
        JLabel liScore = new JLabel("Interview");
        JTextField fiScore = new JTextField();
        
        JLabel lPath = new JLabel("Path: ");
        String[] p = {"Android Dev", "Web Dev"};
        JComboBox cPath = new JComboBox(p);

        JButton btnAdd = new JButton("ADD");

        //Parameter controller untuk menghubungkan ke model
        public InputData(RecruitController R){
            window.setLayout(null);
            window.setSize(500, 300);
            window.setVisible(true);
            window.setLocationRelativeTo(null);

            window.add(lName);
            window.add(lwScore);
            window.add(lcScore);
            window.add(liScore);
            window.add(lPath);

            window.add(fName);
            window.add(fwScore);
            window.add(fcScore);
            window.add(fiScore);
            window.add(cPath);
            
            window.add(btnAdd);

             //LABEL
            lName.setBounds(5, 35, 120, 20);
            lwScore.setBounds(5, 60, 120, 20);
            lcScore.setBounds(5, 85, 120, 20);
            liScore.setBounds(5, 110, 120, 20);
            lPath.setBounds(5, 135, 120, 20);

            //TEXTFIELD
            fName.setBounds(150, 35, 120, 20);
            fwScore.setBounds(150, 60, 120, 20);
            fcScore.setBounds(150, 85, 120, 20);
            fiScore.setBounds(150, 110, 120, 20);
            cPath.setBounds(150, 135, 120, 20);

            //BUTTONPANEL
            btnAdd.setBounds(300, 35, 90, 20);
                       
            btnAdd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    R.insertData(fName.getText(), 
                            cPath.getSelectedItem().toString(),
                            Float.parseFloat(fwScore.getText()), 
                            Float.parseFloat(fcScore.getText()),
                            Float.parseFloat(fiScore.getText()));
                }
            });
        }
    }
    
    //Read Data public untuk dapat dibaca diluar package
    public class ReadData extends JFrame {
        public int wScore,cScore,iScore;
        public String name, path;
        int totalData;
        String data[][] = new String[100][7];

        JFrame window = new JFrame("Read Data Student");
        JTable tabel;
        DefaultTableModel tableModel;
        JScrollPane scrollPane;
        Object columnName[] = {
            "Name", "Path", "Writing", "Coding", "Interview", "Score", "Status"
        };

        JButton btnAdd = new JButton("ADD");
        //JButton btnUpd = new JButton("UPDATE");
        //JButton btnDel = new JButton("DELETE");
        JButton btnRefresh = new JButton("REFRESH");

        //Parameter controller untuk menghubungkan ke model
        public ReadData(RecruitController R){
            tableModel = new DefaultTableModel(columnName, 0);
            tabel = new JTable(tableModel);
            scrollPane = new JScrollPane(tabel);

            window.setLayout(null);
            window.setSize(550, 600);
    //        window.setDefaultCloseOperation(3);
            window.setVisible(true);
            window.setLocationRelativeTo(null);
            window.setResizable(false);

            window.add(scrollPane);
            window.add(btnAdd);
            window.add(btnRefresh);
            //window.add(btnUpd);
            //window.add(btnDel);
            
            scrollPane.setBounds(20, 35, 500, 300);
            btnAdd.setBounds(20, 350, 90, 20);
            btnRefresh.setBounds(120, 350, 120, 20);
            //btnAdd.setBounds(220, 350, 90, 20);
            //btnDel.setBounds(320, 350, 120, 20);

            data = R.readData();

            tabel.setModel((new JTable(data, columnName)).getModel());

            tabel.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    super.mouseClicked(e);
                    int row = tabel.getSelectedRow();
                    int column = tabel.getSelectedColumn();

                    String name = tabel.getValueAt(row,0).toString();

                    int input = JOptionPane.showConfirmDialog(null,
                                "do you want to delete " + name + "?",
                                "Option...",
                                JOptionPane.YES_NO_OPTION);

                    if(input == 0){
                        R.deleteData(name);
                    }else{
                        input = JOptionPane.showConfirmDialog(null,
                                "do you want to update " + name + "?",
                                "Option...",
                                JOptionPane.YES_NO_OPTION);
                        if(input == 0){
                            new UpdateData(R, name);
                        }
                    }
                }
            });

            btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InputData(R);
             }
            });

            btnRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                data = R.readData();

                tabel.setModel((new JTable(data, columnName)).getModel());
             }
            });
           
        }
    }
    
    //Update Data
    class UpdateData extends JFrame {
        String n;

        JFrame window = new JFrame("Update Data Student");

        //JLabel lName = new JLabel("NAME");
        //JTextField fName = new JTextField();

        JLabel lwScore = new JLabel("Writing");
        JTextField fwScore = new JTextField();
        
        JLabel lcScore = new JLabel("Coding");
        JTextField fcScore = new JTextField();
        
        JLabel liScore = new JLabel("Interview");
        JTextField fiScore = new JTextField();
        
        JLabel lPath = new JLabel("Path: ");
        String[] p = {"Android Dev", "Web Dev"};
        JComboBox cPath = new JComboBox(p);

        JButton btnUpd = new JButton("UPDATE");

        //Parameter controller untuk menghubungkan ke model
        public UpdateData(RecruitController R, String n){
            this.n = n;
            window.setLayout(null);
            window.setSize(500, 300);
            window.setVisible(true);
            window.setLocationRelativeTo(null);

            //window.add(lName);
            window.add(lwScore);
            window.add(lcScore);
            window.add(liScore);
            window.add(lPath);

            //window.add(fName);
            window.add(fwScore);
            window.add(fcScore);
            window.add(fiScore);
            window.add(cPath);
            
            window.add(btnUpd);

            //LABEL
            //lName.setBounds(5, 35, 120, 20);
            lwScore.setBounds(5, 35, 120, 20);
            lcScore.setBounds(5, 60, 120, 20);
            liScore.setBounds(5, 85, 120, 20);
            lPath.setBounds(5, 110, 120, 20);

            //TEXTFIELD
            //fName.setBounds(150, 35, 120, 20);
            fwScore.setBounds(150, 35, 120, 20);
            fcScore.setBounds(150, 60, 120, 20);
            fiScore.setBounds(150, 85, 120, 20);
            cPath.setBounds(150, 110, 120, 20);

            //BUTTONPANEL
            btnUpd.setBounds(300, 35, 90, 20);

            btnUpd.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                        R.updateData(n, 
                            cPath.getSelectedItem().toString(),
                            Float.parseFloat(fwScore.getText()), 
                            Float.parseFloat(fcScore.getText()),
                            Float.parseFloat(fiScore.getText()));         
                }
            });
        }
    }
}
