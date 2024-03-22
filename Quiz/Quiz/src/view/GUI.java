/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.event.*;
import javax.swing.*;
import model.Intern;

/**
 *
 * @author LENOVO
 */
public class GUI extends JFrame{
    //attribute
    JLabel ltitle, lcategory, lname, lnim, lwriting, lcoding, linterview;
    JTextField fname, fnim, fwriting, fcoding, finterview;
    JRadioButton android, webdev;
    
    public JButton btnSubmit;
    
    //constructor
    public GUI(){
        //setting for the frame (web)
        setTitle("PT. OOP Internship");
        setSize(500, 350);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //declare all component/object
        ltitle = new JLabel("PT. OOP Internship Exam");
        
        lname = new JLabel("Name: ");
        fname = new JTextField();
        
        lnim = new JLabel("NIM: ");
        fnim = new JTextField();
        
        lwriting = new JLabel("Writing Exam Score: ");
        fwriting = new JTextField();
        
        lcoding = new JLabel("Coding Test score: ");
        fcoding = new JTextField();
        
        linterview = new JLabel("Interview Test score: ");
        finterview = new JTextField();
        
        lcategory = new JLabel("Internship Category: ");
        android = new JRadioButton("Android Developer");
        webdev = new JRadioButton("Website Developer");
        
        btnSubmit = new JButton("Submit");
        
        //Make button group for the radio button
        ButtonGroup group = new ButtonGroup();
        group.add(android);
        group.add(webdev);
        
        //add all component
        add(ltitle);
        add(lname);
        add(fname);
        add(lnim);
        add(fnim);
        add(lwriting);
        add(fwriting);
        add(lcoding);
        add(fcoding);
        add(linterview);
        add(finterview);
        add(lcategory);
        add(android);
        add(webdev);
        add(btnSubmit);
        
        //set where the component will take place in frame
        ltitle.setBounds(170, 5, 150, 20);
        lcategory.setBounds(5, 35, 150, 20);
        android.setBounds(160, 35, 150, 20);
        webdev.setBounds(320, 35, 150, 20);
        
        lname.setBounds(5, 70, 100, 20);
        fname.setBounds(160, 70, 200, 20);
        
        lnim.setBounds(5, 90, 100, 20);
        fnim.setBounds(160, 90, 110, 20);
        
        lwriting.setBounds(5, 135, 150, 20);
        fwriting.setBounds(160, 130, 50, 30);
        
        lcoding.setBounds(5, 175, 150, 20);
        fcoding.setBounds(160,170, 50, 30);
        
        linterview.setBounds(5, 215, 150, 20);
        finterview.setBounds(160, 210, 50, 30);
        
        btnSubmit.setBounds(200, 260, 100, 30);
    }

    public void setLtitle(JLabel ltitle) {
        this.ltitle = ltitle;
    }

    public void setLcategory(JLabel lcategory) {
        this.lcategory = lcategory;
    }

    public void setLname(JLabel lname) {
        this.lname = lname;
    }

    public void setLnim(JLabel lnim) {
        this.lnim = lnim;
    }

    public void setLwriting(JLabel lwriting) {
        this.lwriting = lwriting;
    }

    public void setLcoding(JLabel lcoding) {
        this.lcoding = lcoding;
    }

    public void setLinterview(JLabel linterview) {
        this.linterview = linterview;
    }

    public void setFname(JTextField fname) {
        this.fname = fname;
    }

    public void setFnim(JTextField fnim) {
        this.fnim = fnim;
    }

    public void setFwriting(JTextField fwriting) {
        this.fwriting = fwriting;
    }

    public void setFcoding(JTextField fcoding) {
        this.fcoding = fcoding;
    }

    public void setFinterview(JTextField finterview) {
        this.finterview = finterview;
    }

    public void setAndroid(JRadioButton android) {
        this.android = android;
    }

    public void setWebdev(JRadioButton webdev) {
        this.webdev = webdev;
    }

    public JLabel getLtitle() {
        return ltitle;
    }

    public JLabel getLcategory() {
        return lcategory;
    }

    public JLabel getLname() {
        return lname;
    }

    public JLabel getLnim() {
        return lnim;
    }

    public JLabel getLwriting() {
        return lwriting;
    }

    public JLabel getLcoding() {
        return lcoding;
    }

    public JLabel getLinterview() {
        return linterview;
    }

    public JTextField getFname() {
        return fname;
    }

    public JTextField getFnim() {
        return fnim;
    }

    public JTextField getFwriting() {
        return fwriting;
    }

    public JTextField getFcoding() {
        return fcoding;
    }

    public JTextField getFinterview() {
        return finterview;
    }

    public JRadioButton getAndroid() {
        return android;
    }

    public JRadioButton getWebdev() {
        return webdev;
    }
    
}
