/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author LENOVO
 */
public class SegitigaSiku implements BangunDatar{
    //attribute
    private double alas, tinggi;
    
    //constractor
    public SegitigaSiku(double a, double t){
        this.alas = a;
        this.tinggi = t;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    
    //method

    @Override
    public double Keliling() {
        return (alas + tinggi + Math.hypot(alas, tinggi));
    }

    @Override
    public double Luas() {
        return (alas * tinggi)/2;
    }
    
    
}
