/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import BangunDatar.Segitiga;

/**
 *
 * @author LENOVO
 */
public class LimasSegitiga extends Segitiga implements BangunRuang{
    //attribute
    double tinggi;
    
    //constructor
    public LimasSegitiga(double a, double b, double c, double tl){
        super(a,b,c);
        this.tinggi = tl;
    }
    
    //method

    @Override
    public double Volume() {
        return (super.Luas() * tinggi)/3;
    }

    @Override
    public double LuasPermukaan() {
        //TO = Tinggi Limas (tengah base) sampai O (setengah sisi base)
        //sh = tinggi sisi tegak (Slant Height)
        
        //Asumsikan tinggi sisi tegaknya sama semua
        double t = Math.sqrt(Math.pow(super.getSisiB(), 2) - Math.pow((super.getSisiA()/2),2));
        double sh = Math.hypot(tinggi, t/2);
        double SisiTegakA = (super.getSisiA() * sh)/2;
        double SisiTegakB = (super.getSisiB() * sh)/2;
        double SisiTegakC = (super.getSisiC() * sh)/2;
      
        return (super.Luas() + SisiTegakA + SisiTegakB + SisiTegakC);
    }
    
}
