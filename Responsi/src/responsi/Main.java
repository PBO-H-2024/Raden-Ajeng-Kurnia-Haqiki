//123220022_Raden Ajeng Kurnia Haqiki

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package responsi;

import controller.RecruitController;
import view.RecruitView;

/**
 *
 * @author PC PRAKTIKUM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RecruitView r = new RecruitView();
        RecruitView.ReadData rd = r.new ReadData(new RecruitController());
    }
    
}
