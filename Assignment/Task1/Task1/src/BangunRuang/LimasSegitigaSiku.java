/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import BangunDatar.SegitigaSiku;

/**
 *
 * @author LENOVO
 */
public class LimasSegitigaSiku extends SegitigaSiku implements BangunRuang{
    //attribute
    double tinggi;
    
    //constructor
    public LimasSegitigaSiku(double a, double t, double tl){
        super(a, t);
        this.tinggi = tl;
    }
    
    //method
    @Override
    public double Volume() {
        return (super.Luas()*tinggi)/3;
    }

    @Override
    public double LuasPermukaan() {
        double SisiTegakA = (super.getAlas() * tinggi)/2;
        double SisiTegakB = (super.getTinggi() * tinggi)/2;
        
        //alas base segitiga sebagai hipotenusa
        //setengah dari hipotenusa base segitiga sebagai alas
        //mencari tinggi segitiga siku-siku
        //TO sebagai alas
        //tinggi limas sebagai tinggi
        //mencari hipotenusa segitiga siku-siku
        double TO = Math.sqrt(Math.pow(super.getAlas(), 2) - Math.pow((Math.hypot(super.getAlas(), super.getTinggi())/2), 2));
        double SisiTegakC = (Math.hypot(super.getAlas(), super.getTinggi()) * Math.hypot(TO, tinggi))/2;
        
        return (super.Luas() + SisiTegakA + SisiTegakB + SisiTegakC);
    }
    
    
}
