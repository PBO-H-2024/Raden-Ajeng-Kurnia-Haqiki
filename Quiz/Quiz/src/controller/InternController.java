/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.*;
import model.Intern;
import view.GUI;

/**
 *
 * @author LENOVO
 */
public class InternController {
    //attribute
    GUI internView;
    
    //constructor
    public InternController(GUI internView) {
        this.internView = internView;
        
        internView.btnSubmit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String category = internView.getAndroid().isSelected() ? "android" : "webdev";
                String name = internView.getFname().getText();
                String nim = internView.getFnim().getText();
                
                                String writing = internView.getFwriting().getText();
                String coding = internView.getFcoding().getText();
                String interview = internView.getFinterview().getText();
                
                double result;
                //convert input score from string to double so can be calculated
                double w = Double.parseDouble(writing);
                double c = Double.parseDouble(coding);
                double i = Double.parseDouble(interview);
                
                Intern intern;
                
                if(category == "android"){
                    result = ((w * 0.2) + (c * 0.5) + (i * 0.3))/3;
                    intern = new Intern("Android Developer", name, nim, result);
                }
                else if(category == "webdev"){
                    result = ((w * 0.4) + (c * 0.35) + (i * 0.25))/3;
                    intern = new Intern("Website Developer", name, nim, result);
                }
                
            }
            
        });
    }
    
}
