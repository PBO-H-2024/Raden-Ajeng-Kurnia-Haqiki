/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import BangunDatar.Lingkaran;

/**
 *
 * @author LENOVO
 */
public class Tabung extends Lingkaran implements BangunRuang{
    //attribute
    double tinggi;
    
    //constructor
    public Tabung (double r, double t){
        super(r);
        this.tinggi = t;
    }
    
    //method
    @Override
    public double Volume() {
        return (super.Luas() * tinggi);
    }

    @Override
    public double LuasPermukaan() {
        return (2 * super.Luas()) + (2 * Math.PI * super.getRadius() * tinggi);
    }
    
    
}
