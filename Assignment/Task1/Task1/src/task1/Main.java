/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task1;

import BangunDatar.Lingkaran;
import BangunDatar.Segitiga;
import BangunDatar.SegitigaSiku;
import BangunRuang.LimasSegitiga;
import BangunRuang.LimasSegitigaSiku;
import BangunRuang.Tabung;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int yn = 1;
        double x, y, z, t;
        
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("---- PERTIHUNGAN ----\n\n");
            System.out.println("0. Keluar\n1. Tabung\n2. Limas Segitiga Siku-siku (Alas & Tinggi)\n3. Limas Segitiga Selain Siku-siku (Sisi)\n>> ");
            
            int choice;
            choice = scan.nextInt();
            
            switch(choice){
                case 0:
                    yn = choice;
                    break;
                case 1:
                    System.out.println("\n\n---- TABUNG ----\n\n");
                    
                    System.out.println("-) Input jari-jari lingkaran: ");
                    x = scan.nextDouble();
                    System.out.println("-) Input tinggi tabung: ");
                    y = scan.nextDouble();
                    
                    Lingkaran O = new Lingkaran(x);
                    Tabung HO = new Tabung(x, y);
                    
                    System.out.println("\n\nHasil:");
                    System.out.println("1) Keliling Lingkaran = " + O.Keliling());
                    System.out.println("2) Luas Lingkaran = " + O.Luas());
                    System.out.println("3) Volume Tabung = " + HO.Volume());
                    System.out.println("4) Luas Permukaan Tabung = " + HO.LuasPermukaan());
                    
                    break; 
                case 2:
                    System.out.println("\n\n---- LIMAS SEGITIGA SIKU-SIKU ----\n\n");
                    
                    System.out.println("-) Input alas segitiga: ");
                    x = scan.nextDouble();
                    System.out.println("-) Input tinggi segitiga: ");
                    y = scan.nextDouble();
                    System.out.println("-) Input tinggi limas: ");
                    z = scan.nextDouble();
                    
                    SegitigaSiku ABC = new SegitigaSiku(x, y);
                    LimasSegitigaSiku TABC = new LimasSegitigaSiku(x, y, z);
                    
                    System.out.println("\n\nHasil:");
                    System.out.println("1) Keliling Segitiga = " + ABC.Keliling());
                    System.out.println("2) Luas Segitiga = " + ABC.Luas());
                    System.out.println("3) Volume Limas = " + TABC.Volume());
                    System.out.println("4) Luas Permukaan = " + TABC.LuasPermukaan());

                    break;
                case 3:
                    System.out.println("\n\n---- LIMAS SEGITIGA ----\n\n");
                    
                    System.out.println("-) Input sisi A segitiga (alas): ");
                    x = scan.nextDouble();
                    System.out.println("-) Input sisi B segitiga: ");
                    y = scan.nextDouble();
                    System.out.println("-) Input sisi C segitiga: ");
                    z = scan.nextDouble();
                    System.out.println("-) Input tinggi limas");
                    t = scan.nextDouble();
                    
                    Segitiga BCA = new Segitiga(x, y, z);
                    LimasSegitiga TBCA = new LimasSegitiga(x, y, z, t);
                    
                    System.out.println("\n\nHasil:");
                    System.out.println("1) Keliling Segitiga = " + BCA.Keliling());
                    System.out.println("2) Luas Segitiga = " + BCA.Luas());
                    System.out.println("3) Volume Limas = " + TBCA.Volume());
                    System.out.println("4) Luas Permukaan = " + TBCA.LuasPermukaan());
                    break;
                default: 
                    System.out.println("\nMasukkan angka pilihan yang benar!");
                    break;
            }
            
            if(choice != 0){
                System.out.println("\n\n[Kembali ke Menu: 1  |  Keluar: 0] >> ");
                int i = scan.nextInt();
                yn = i;
            }
            
        }while(yn == 1 && yn != 0);
    }
}
