/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author LENOVO
 */
public class Lingkaran implements BangunDatar{
    //attribute
    private double radius;
    
    //constructor
    public Lingkaran(double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
        
    //method
    @Override
    public double Keliling() {
        return (2 * radius * Math.PI);
    }

    @Override
    public double Luas() {
        return (Math.PI * Math.pow(radius, 2));
    }
    
    
}
