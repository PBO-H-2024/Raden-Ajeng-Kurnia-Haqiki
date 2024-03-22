/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Intern {
    //attribute
    private String name, nim, category;
    private double score;
    
    //constructor
    public Intern(String category, String name, String nim, double score){
        this.category = category;
        this.name = name;
        this.nim = nim;
        this.score = score;
                       
        System.out.println("Category: " + category + 
                "\nName: " + name +
                "\nNIM: " + nim +
                "\nScore: " + score +
                "\n\nResult: " + (score >= 85 ? "ACCEPTED" : "NOT ACCEPTED" ));
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public String getCategory() {
        return category;
    }

    public double getScore() {
        return score;
    }

        public void setName(String name) {
        this.name = name;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setScore(double score) {
        this.score = score;
    }

    
    @Override
    public String toString() {
        return ("Category: " + category + 
                "\nName: " + name +
                "\nNIM: " + nim +
                "\n\nResult: " + (score >= 85 ? "ACCEPTED" : "NOT ACCEPTED" ));
    }
    
    
}
