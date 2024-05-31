/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.RecruitModel;

/**
 *
 * @author PC PRAKTIKUM
 */
public class RecruitController {
    RecruitModel model;
    
    public RecruitController() {
        this.model = new RecruitModel(this);
    }
    
    public void insertData(String name, String path, float wScore, float cScore, float iScore){
        model.insertData(name, path, wScore, cScore, iScore);
        JOptionPane.showMessageDialog(null, "Insert Data Process is Success", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String[][] readData(){
        return model.readData();
    }
    
    public void updateData(String name, String path, float wScore, float cScore, float iScore){
        model.updateData(name, path, wScore, cScore, iScore);
        JOptionPane.showMessageDialog(null, "Update Data Process is Success", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void deleteData(String n){
        model.deleteData(n);
        JOptionPane.showMessageDialog(null, "Delete Data Process is Success", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}
