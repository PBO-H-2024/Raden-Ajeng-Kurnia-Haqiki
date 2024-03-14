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
    public LimasSegitiga(double a, double t, double tl){
        super(a, t);
        this.tinggi = tl;
    }
    
    //method
    public double SisiTegakA(){
        return (super.getAlas() * tinggi)/2;
    }
    
    public double SisiTegakB(){
        return (super.getTinggi() * tinggi)/2;
    }
    
    public double TO(){
        //alas base segitiga sebagai hipotenusa
        //setengah dari hipotenusa base segitiga sebagai alas
        //mencari tinggi segitiga siku-siku
        return Math.sqrt(Math.pow(super.getAlas(), 2) - Math.pow((super.Hipotenusa()/2), 2));
    }
    
    public double TinggiSisiTegakC(){
        //TO sebagai alas
        //tinggi limas sebagai tinggi
        //mencari hipotenusa segitiga siku-siku
        return Math.sqrt((Math.pow(TO(), 2) + Math.pow(tinggi, 2)));
    }
    
    public double SisiTegakC(){
        return (super.Hipotenusa() * TinggiSisiTegakC())/2;
    }
    
    @Override
    public double Volume() {
        return (super.Luas()*tinggi)/3;
    }

    @Override
    public double LuasPermukaan() {
        return (super.Luas() + SisiTegakA() + SisiTegakB() + SisiTegakC());
    }
    
    
}
