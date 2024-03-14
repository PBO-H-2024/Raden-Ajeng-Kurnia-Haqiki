/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author LENOVO
 */
public class Segitiga implements BangunDatar{
    //attribute
    private double sisiA, sisiB, sisiC;
    
    //constructor
    public Segitiga(double a, double b, double c){
        this.sisiA = a;
        this.sisiB = b;
        this.sisiC = c;
    }

    public double getSisiA() {
        return sisiA;
    }

    public double getSisiB() {
        return sisiB;
    }

    public double getSisiC() {
        return sisiC;
    }

    public void setSisiA(double sisiA) {
        this.sisiA = sisiA;
    }

    public void setSisiB(double sisiB) {
        this.sisiB = sisiB;
    }

    public void setSisiC(double sisiC) {
        this.sisiC = sisiC;
    }
        
    //method
    @Override
    public double Keliling() {
        return sisiA + sisiB + sisiC;
    }

    @Override
    public double Luas() {
        double tinggi = Math.sqrt(Math.pow(sisiB, 2) - Math.pow((sisiA/2),2)); 
        return (sisiA * tinggi)/2;
    }
    
}
